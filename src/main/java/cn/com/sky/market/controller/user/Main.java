package cn.com.sky.market.controller.user;

import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.servlet.*;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        HandlerMapping handlerMapping;

        Controller controller;
        AbstractController abstractController;

        ModelAndView modelAndView;
        ViewResolver resolver;
//        VelocityViewResolver velocityViewResolver;
        InternalResourceViewResolver internalResourceViewResolver;

        View view;
        InternalResourceView internalResourceView;
        FreeMarkerView freeMarkerView;
//        VelocityView velocityView;
//        AbstractXlsView abstractXlsView;
//        AbstractXlsxView abstractXlsxView;
//        AbstractXlsxStreamingView abstractXlsxStreamingView;

        MultipartResolver multipartResolver;

        DispatcherServlet dispatcherServlet;

        HandlerAdapter handlerAdapter;

//        Server.main();


    }

}