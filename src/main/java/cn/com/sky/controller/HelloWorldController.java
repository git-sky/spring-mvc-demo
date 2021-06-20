package cn.com.sky.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Writer;

/**
 * 继承AbstractController并实现handleRequestInternal方法
 * <p>
 * url: http://localhost:8081/helloWorldController
 */
public class HelloWorldController extends AbstractController {

    /**
     * 通过response直接回写数据，也可通过ModelAndView指定逻辑视图并回写数据
     */
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Writer writer = response.getWriter();
        writer.write("hello AbstractController");
        writer.flush();
        return null;
    }

}
