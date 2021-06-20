package cn.com.sky.advice;

import com.google.common.collect.Lists;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;

@ControllerAdvice
public class DesensitizeResponseBodyAdvice implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        Method method = returnType.getMethod();
        //a. 首先判断该方法是否存在@DesensitizeSupport注解
        //b. 如果不存在,再判断该方法所在类是否存在注解
        boolean exist = method.getAnnotation(DesensitizeSupport.class) != null || method.getDeclaringClass().getAnnotation(DesensitizeSupport.class) != null;

        return exist;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        if (body == null) {
            return null;
        }

        Collection<Object> collection;
        //1.判断返回值的类型，构造成一个集合对象
        if (body instanceof ApiResponse) {
            ApiResponse apiResponse = (ApiResponse) body;
            Object data = apiResponse.getData();

            if (data == null) {
                collection = Lists.newArrayList();
            } else if (data instanceof Page) {
                collection = ((Page) data).getData();
            } else if (data instanceof Collection) {
                collection = (Collection) data;
            } else {
                collection = Arrays.asList(apiResponse.getData());
            }

            // 进行脱敏
            collection.stream().forEach(obj -> {
                Class clazz = obj.getClass();

                Arrays.stream(clazz.getDeclaredFields()).filter(field ->
                        //2. 获取class中 所有带有@Desensitize注解，且字段申明字段类型为String得 fields ,
                        field.getAnnotation(Desensitize.class) != null && String.class == field.getType()
                ).forEach(field -> {
                    //3. 针对满足条件2的字段进行脱敏

                    //3.1 获取field的脱敏类型
                    DesensitizeType type = field.getAnnotation(Desensitize.class).type();

                    field.setAccessible(true);
                    //3.2 获取field的值
                    Object oldValue = null;
                    try {
                        oldValue = field.get(obj);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }

                    //3.3 获取脱敏类型type,并针对不同对脱敏类型进行脱敏，获取newValue
                    Object newValue = replace(oldValue, type);

                    //3.4 反射设置newValue
                    try {
                        field.set(obj, newValue);
                    } catch (IllegalAccessException e) {
                    }
                });

            });
        }


        return body;
    }

    Object replace(Object oldValue, DesensitizeType type) {
        try {
            if (oldValue instanceof String) {
                return type.getContent((String) oldValue);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return oldValue;
    }
}