package cn.com.sky.annotation.basics;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <pre>
 *
 * RequestParam注解
 *
 * required属性标注这个参数是否是必需大的，默认是true，如果想让它可以不存在，那么就设置为false。
 * 但是请注意，required设置成false的参数对应的处理函数的参数类型必须是对象类型，否则回报错500！
 *
 *
 * @RequestParam 来映射请求参数
 * value值 即请求参数名。
 * required 该参数是否必需。默认为true。
 * defaultValue请求参数的默认值。
 *
 * </pre>
 */

@RequestMapping("class")
@Controller
public class RPTestHandler {

    String page = "successrm";

    /**
     * required设置成false的参数类型必须是对象类型，否则回报错500！
     *
     * 所以此处会报500错误。
     */
    // @RequestMapping("student")
    // public String handle(@RequestParam(value = "username") String un, @RequestParam(value =
    // "age", required = false) int age) {
    // System.out.println("a student's request has come. username: " + un + ", age: " + age);
    // return page;
    // }

    /**
     * 把age改成Integer类型，就会正常处理。
     */
    // @RequestMapping("student")
    // public String handle(@RequestParam(value = "username") String un, @RequestParam(value =
    // "age", required = false) Integer age) {
    // System.out.println("a student's request has come. username: " + un + ", age: " + age);
    // return page;
    // }

    /**
     * age使用基本类型，使用defaultValue属性来指定默认值。
     */
    @RequestMapping("student")
    public String handle(@RequestParam(value = "username") String un, @RequestParam(value = "age", required = false, defaultValue = "0") int age) {
        System.out.println("a student's request has come. username: " + un + ", age: " + age);
        return page;
    }

    /**
     * 注意：如果@RequestHeader给定的value不存在，也就是映射的请求头名称不存在，那么服务器将报错。
     */
    @RequestMapping("testhead")
    public String handleRH(@RequestHeader(value = "Accept-language") String head) {
        System.out.println("Request Head Accept-language:" + head);
        return page;
    }

    /**
     * CookieValue注解
     */
    @RequestMapping("testCookie")
    public String handleCookieValue(@CookieValue(value = "JSESSIONID") String cookie) {
        System.out.println("Request CookieValue JSESSIONID:" + cookie);
        return page;
    }

}