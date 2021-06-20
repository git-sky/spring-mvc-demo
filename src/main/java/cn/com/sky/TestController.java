package cn.com.sky;


import org.springframework.scheduling.config.AnnotationDrivenBeanDefinitionParser;
import org.springframework.web.servlet.*;
import org.springframework.web.servlet.config.MvcNamespaceHandler;
import org.springframework.web.servlet.handler.AbstractHandlerMapping;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.i18n.AbstractLocaleResolver;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

import javax.servlet.Servlet;

//import org.springframework.web.servlet.mvc.annotation.DefaultAnnotationHandlerMapping;
//import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
//import org.springframework.web.servlet.mvc.support.ControllerBeanNameHandlerMapping;
//import org.springframework.web.servlet.mvc.support.ControllerClassNameHandlerMapping;

public class TestController {

    public static void main(String[] args) {

        //==== Controller层次体系 ====//
        Controller controller;
        //自由挥洒派
        AbstractController abstractController;
//        MultiActionController multiActionController;

        //规范操作派
//        BaseCommandController baseCommandController;
//        AbstractCommandController abstractCommandController;
//        AbstractFormController abstractFormController;
//        SimpleFormController simpleFormController;
//        AbstractWizardFormController abstractWizardFormController;


        ViewResolver viewResolver;

        View jspView;
        FreeMarkerView freeMarkerView;


        AnnotationDrivenBeanDefinitionParser annotationDrivenBeanDefinitionParser;
        MvcNamespaceHandler mvcNamespaceHandler;


        //HandlerMapping 的实现类
//        ControllerClassNameHandlerMapping controllerClassNameHandlerMapping;
//        ControllerBeanNameHandlerMapping controllerBeanNameHandlerMapping;
//        DefaultAnnotationHandlerMapping defaultAnnotationHandlerMapping;
        SimpleUrlHandlerMapping simpleUrlHandlerMapping;
        BeanNameUrlHandlerMapping beanNameUrlHandlerMapping;
        RequestMappingHandlerMapping requestMappingHandlerMapping;


        LocaleResolver localeResolver;
        AbstractLocaleResolver abstractLocaleResolver;

        DispatcherServlet dispatcherServlet;


        Servlet invokerServlet;

        AbstractHandlerMapping abstractHandlerMapping;

        HandlerMapping handlerMapping;

    }
}