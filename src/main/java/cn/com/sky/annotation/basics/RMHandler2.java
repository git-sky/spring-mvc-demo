package cn.com.sky.annotation.basics;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <pre>
 *
 * 映射请求URL中的占位符到控制器方法参数
 *
 * @PathVariable注解
 *
 * 参数部分@PathVariable("id")和@RequestMapping("p1/{id}")注解的名称必须相同.
 *
 * </pre>
 */
@RequestMapping("/c3")
@Controller
public class RMHandler2 {

    @RequestMapping(value = "p1/{id}")
    public String handleP1(@PathVariable("id") int pid) {
        System.out.println(pid + "+100=" + (pid + 100));
        return "successrm";
    }

}