package cn.com.sky.annotation.basics;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <pre>
 *
 *  @RequestMapping请求value的通配符详解
 *
 *  @RequestMapping 还支持 Ant 风格的 URL
 *
 *  Ant 风格资源地址支持 3 种匹配符：
 *
 * 1. ?：匹配文件名中的一个字符
 *
 * 2. *：匹配文件名中的任意字符
 *
 * 3. **： 匹配多层路径
 *
 *
 * 大结论：相同位置相同个数的含有一个通配符，优先级由高到低：?   *    ** 。
 *
 * </pre>
 */
@RequestMapping("/c3")
@Controller
public class RMHandler {

    // value限制请求的url，method对请求方法的限制,此处限制为post，get请求不 能通过。
    // 请求方法的限定method
    @RequestMapping(value = "/abc", method = RequestMethod.POST)
    public String handle() {
        return "successrm";
    }

    // 请求参数的限定params
    @RequestMapping(value = "rq1", params = {"username", "age=20", "!pwd"})
    public String handle2() {
        return "age20world";
    }

    // 报文头的条件限定headers
    @RequestMapping(value = "rq2", headers = {"Host=localhost:8080"})
    public String handle3() {
        return "age20world";
    }

    // 1
    // handle4和handle5测试当请求的url符合两个映射方法的value通配符时
    // 问：如何springmvc选择
    // 答：选择映射范围更小、更具体的url来进行映射
    @RequestMapping(value = "rq3/**/")
    public String handle4() {
        return "successrm";
    }

    @RequestMapping(value = "rq3/**/hhh")
    public String handle5() {
        return "robot_baymax1";
    }

    // 2
    // handle6-8测试当请求的url符合两个映射方法的value通配符时，如何springmvc选择
    // 答：*的优先级会高于**的通配符。
    @RequestMapping(value = "rq4/*/bbb")
    public String handle6() {
        return "robot_baymax1";
    }

    @RequestMapping(value = "rq4/**/bbb")
    public String handle7() {
        return "robot_baymax2";
    }

    @RequestMapping(value = "rq5/**/bbb")
    public String handle8() {
        return "robot_baymax2";
    }

    // 3
    // handle9-11测试当请求的url符合两个映射方法的value通配符时，如何springmvc选择
    // 答：当请求url两个都符合时，含有?的映射优先级高于含有*的。
    @RequestMapping(value = "rq6/qqq*")
    public String handle9() {
        return "robot_baymax1";
    }

    @RequestMapping(value = "rq6/qqq?")
    public String handle10() {
        return "robot_baymax3";
    }

    @RequestMapping(value = "rq7/qqq*")
    public String handle11() {
        return "robot_baymax1";
    }

    // 4
    // handle12-13测试当请求的url符合两个映射方法的value通配符时，如何springmvc选择
    // 答：结果随机,映射优先级与通配符位置无关，当两个RequestMapping通配符url差别仅仅是位置差别时，映射结果是随机的。
    @RequestMapping(value = "rq8/**/kkk")
    public String handle12() {
        System.out.print("handle12");
        return "robot_baymax1";
    }

    @RequestMapping(value = "rq8/aaa/**")
    public String handle13() {
        System.out.print("handle13");
        return "robot_baymax2";
    }

    @RequestMapping(value = "rq8_bm/bbb/**")
    public String handle12_bm() {
        System.out.print("handle12_bm");
        return "robot_baymax1";
    }

    @RequestMapping(value = "rq8_bm/**/mmm")
    public String handle13_bm() {
        System.out.print("handle13_bm");
        return "robot_baymax2";
    }

    // 5
    // handle14-17测试当请求的url符合两个映射方法的value通配符时，如何springmvc选择
    // 答:通配符个数少的RequestMapping的value更高优先级。
    @RequestMapping(value = "rq9/*/kkk/nnn")
    public String handle14() {
        System.out.print("handle14");
        return "robot_baymax1";
    }

    @RequestMapping(value = "rq9/aaa/*/*")
    public String handle15() {
        System.out.print("handle15");
        return "robot_baymax2";
    }

    @RequestMapping(value = "rq10/aaa/*/*")
    public String handle16() {
        System.out.print("handle16");
        return "robot_baymax1";
    }

    @RequestMapping(value = "rq10/*/kkk/nnn")
    public String handle17() {
        System.out.print("handle17");
        return "robot_baymax2";
    }
}