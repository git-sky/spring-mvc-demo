package cn.com.sky.annotation.model;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.com.sky.annotation.beans.Location;

@RequestMapping("/model")
@Controller
public class ModelDataHandler {

	/*
	 * 目标方法返回值可以使ModelAndView类型 可以包含视图和模型信息 SpringMVC会把ModelAndView中的model数据放入request域对象中。
	 * 
	 * 这里需要注意的是，其实处理函数无论返回String，ModelAndView，Map类型，SpringMVC内部都会自动统一转换为ModelAndView
	 */
	@RequestMapping("/ModelAndView")
	public ModelAndView handle1() {
		String viewName = "my";
		ModelAndView mv = new ModelAndView(viewName);
		mv.addObject("time", new Date());
		Location loc = new Location();
		loc.setCity("urban");
		loc.setProvince("Shanghai");
		mv.addObject("local", loc);
		return mv;
	}

	/*
	 * 目标方法可以添加Map类型（实际上也可以是Model类新星或者ModelMap类型）的参数
	 */
	@RequestMapping("/Map")
	public String handle2(Map<String, Object> map) {
		String reStr = "MapTest";
		map.put("staff", Arrays.asList("happyBKs", "hong shu"));
		map.put("luckynumber", Arrays.asList(1, 3, 5, 7, 8));

		Location loc1 = new Location();
		loc1.setCity("urban");
		loc1.setProvince("Shanghai");

		Location loc2 = new Location();
		loc2.setCity("county");
		loc2.setProvince("Beijing");
		map.put("addlist", Arrays.asList(loc1, loc2));

		return reStr;
	}

}