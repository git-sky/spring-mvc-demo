package cn.com.sky.annotation.basics;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/servlet")
@Controller
public class NativeServletHandler {

	@RequestMapping("/handle1")
	String handle1(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("request:" + request + ", response:" + response);
		return "successrm";
	}

	@RequestMapping("/handle2")
	void handle2(HttpServletRequest request, Writer writer) throws IOException {
		writer.write("hello! happyBKs!");

	}
}