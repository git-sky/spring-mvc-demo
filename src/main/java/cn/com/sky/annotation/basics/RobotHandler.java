package cn.com.sky.annotation.basics;

import java.lang.annotation.Retention;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
1.@RequestMapping除了修饰方法，还可以来修饰类
类定义处：提供初步的请求映射信息。相对于web应用的根目录
方法定义处：进一步提供细分的映射信息。相对于类定义处的URL。若类定义处没有标注@RequestMapping，则方法处的@RequestMapping直接对应于web应用的根目录

请求：（网站域名+web应用名）web应用根目录+类定义处@RequestMapping+方法定义处@RequestMapping
映射到
物理视图：webapp根目录+springmvc.xml配置的prefix+ 控制器方法的返回值 +springmvc.xml配置的sufix


这里的话是
请求：http://localhost:8080/mymvc/c1/m1
映射到
物理视图webapp/views/robot_baymax1.jsp就通过控制器上的


映射过程是：DispatchServlet在截获请求后，@RequestMapping提供额映射信息确认请求所对应对的处理方法。
*/
@RequestMapping("/c1")
@Controller
public class RobotHandler {
	
	@RequestMapping("/m1")
	String handle1()
	{
		return "robot_baymax1";
	}
	
	@RequestMapping("/m2")
	String handle2()
	{
		return "robot_baymax2";
	}
	
	
	@RequestMapping("/m3")
	String handle3()
	{
		return "robot_baymax3";
	}
}