package cn.com.sky.custom;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义handler
 */
public interface MyHandler {

    ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response);

}
