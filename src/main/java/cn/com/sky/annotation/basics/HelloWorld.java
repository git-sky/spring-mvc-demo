package cn.com.sky.annotation.basics;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("control")
public class HelloWorld {

	// 这个方法需要能够应答一个请求，即相应index.jsp的请求。
	/*
	 * 1.使用@RequestMapping注解 来映射请求的URL 这的声明的/happyBKs与index.jsp的href="happyBKs"对应，所以能够相应。
	 * 
	 * 2.返回值会通过视图解析器解析为物理视图，对于InternalResourceViewResolver视图解析器会做如下解析： 通过 prefix + returnValue +
	 * subfix 的方式得到物理视图，然后做转发操作
	 * 
	 * /views/baymax.jsp
	 */
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("hello, springMVC!");
		return "first";
	}
	// 返回了一个baymax，对应了哪个页面呢？还需要在springmvc.xml的配置视图解析

}