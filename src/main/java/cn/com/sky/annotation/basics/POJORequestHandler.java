package cn.com.sky.annotation.basics;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.com.sky.annotation.beans.Person;

/**
 * 
 * 使用 POJO 对象绑定请求参数值
 * 
 * 注意：
 * 
 * 如果请求的表单参数中不存在pojo对象中的某个域名称的项目，则绑定后pojo该属性为null。
 * 
 * 如果请求的表单参数中存在pojo对象中没有包含的域的项目，则绑定后该参数丢失。
 * 
 * 如果表单项目的数据会自动从String转换为相应pojo的域类型。但如果类型无法转换，则报错。
 */
@RequestMapping("/class")
@Controller
public class POJORequestHandler {

	String page = "successrm";

	@RequestMapping("/boy")
	public String handle(Person stud) {
		System.out.println(stud);
		return page;
	}
}