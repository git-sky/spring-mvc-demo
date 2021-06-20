package cn.com.sky.custom;

import org.springframework.web.servlet.handler.AbstractHandlerMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 自定义handlerMapping
 */
public class MyHandlerMapping extends AbstractHandlerMapping {

    @Override
    protected Object getHandlerInternal(HttpServletRequest request) throws Exception {
        return null;
    }

}
