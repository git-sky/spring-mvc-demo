package cn.com.sky.custom;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.handler.AbstractHandlerMapping;

public class MyHandlerMapping extends AbstractHandlerMapping {

	@Override
	protected Object getHandlerInternal(HttpServletRequest request) throws Exception {
		return null;
	}

}
