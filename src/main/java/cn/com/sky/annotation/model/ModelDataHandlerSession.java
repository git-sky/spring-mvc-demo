package cn.com.sky.annotation.model;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import cn.com.sky.annotation.beans.Sword;

/**
 * <pre>
 * 若希望在多个请求之间共用某个模型属性数据，则可以在控制器类上标注一个 @SessionAttributes, Spring MVC将在模型中对应的属性暂存到 HttpSession 中。
 * @SessionAttributes 除了可以通过属性名指定需要放到会话中的属性外，还可以通过模型属性的对象类型指定哪些模型属性需要放到会话中.
 * 
 * 
 * - @SessionAttributes(types=User.class) 会将隐含模型中所有类型为 User.class 的属性添加到会话中。
 * – @SessionAttributes(value={“user1”, “user2”})
 * – @SessionAttributes(types={User.class, Dept.class})
 * – @SessionAttributes(value={“user1”, “user2”},types={Dept.class})
 * 
 * 
 * value指定属性名。
 * types指定类型。
 * 
 */
@SessionAttributes(value = "SW1", types = { String.class })
@RequestMapping("/model")
@Controller
public class ModelDataHandlerSession {

	/*
	 * 
	 * @SessionAttributes 除了可以通过属性名指定需要放到会话中的属性外，(实际上使用的是value属性值)
	 * 还可以通过模型属性的对象类型指定哪些模型属性需要放到会话中(实际上使用的是types属性值)
	 * 
	 * 注意：该注解只能放在类的上面而不能放在方法上面
	 */

	@RequestMapping("/sessiontest")
	public String handle1(Map<String, Object> map) {
		String returnStr = "SessionAnnotationTest";
		Sword s = new Sword("水晶剑", 40);
		map.put("SW1", s);
		map.put("myname", "happyBKs");
		map.put("age", 100);
		return returnStr;
	}

}