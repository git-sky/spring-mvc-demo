package cn.com.sky.custom;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface MyHandler {

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response);

}
