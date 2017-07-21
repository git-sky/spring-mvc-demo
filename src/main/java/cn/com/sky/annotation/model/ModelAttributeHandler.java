package cn.com.sky.annotation.model;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.com.sky.annotation.beans.UserBean;

/**
 * <pre>
 * 
 * springMVC在映射请求的过程中，在映射到控制器类之后，会先执行带@ModelAttribute的方法，
 * 无论你实际映射的处理函数的输出模型数据是否与这个@ModelAttribute方法有关，
 * 也就是说，如果你在现在这个控制器类中加入其它处理目标方法，并且与当前类对象和表单没有任何关系，在映射时，@ModelAttribute方法getUser都会被执行。
 */
@RequestMapping("/ModelAttribute")
@Controller
public class ModelAttributeHandler {

	@RequestMapping("/userma")
	public String handle(@ModelAttribute(value = "myUser") UserBean user) {
		String returnStr = "modelAttributeTest1";
		System.out.println("updating " + user);
		return returnStr;
	}

	/*
	 * 带有@ModelAttribute注解标记的方法，会在每个目标方法执行之前被SpringMVC调用
	 * 
	 * 运行过程： 1. 执行@ModelAttribute注解修饰的方法：从数据库取出对象，把对象放入Map中。键为userBean 2.
	 * SpringMVC从Map中取出UserBean对象，并发表单中的参数赋给UserBean对象对应的属性 3. SpringMVC把上述对象传入目标方法参数
	 * 
	 * 注意：在@ModelAttribute方法中，放入Map的键必须和入参类型的第一个字母小写的字符串一致。
	 */
	@ModelAttribute
	public void getUser(@RequestParam(value = "id", required = false) Integer id, Map<String, Object> map) {
		System.out.println("calling @ModelAttribute getUser");
		if (id != null)// 注意：如果是int id就不能够用==null来判断了
		{
			UserBean user = new UserBean(1, "happyBKs", "12345678", 200);
			System.out.println("从数据库中获取对象：" + user);
			map.put("userBean", user);// 此处的key是userBean，对应 handle(UserBean
										// user)的入参类型。key必须是入参类型的小写，否则对应不上。
		}
	}

	@ModelAttribute
	public void getUser2(@RequestParam(value = "id", required = false) Integer id, Map<String, Object> map) {
		System.out.println("calling @ModelAttribute getUser2");
		if (id != null)// 注意：如果是int id就不能够用==null来判断了
		{
			UserBean user = new UserBean(1, "Lucky", "123", 300);
			System.out.println("从数据库中获取对象：" + user);
			map.put("myUser", user);

		}
	}

}