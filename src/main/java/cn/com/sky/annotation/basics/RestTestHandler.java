package cn.com.sky.annotation.basics;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 使用HiddenHttpMethodFilter过滤器实现restful功能。
 */
@RequestMapping("/rest")
@Controller
public class RestTestHandler {

    /**
     * <pre>
     * Rest 风格的Url 原先利用请求参数的风格
     * 以CRUD为例
     * 新增： /order POST
     * 修改：/order/1 Put 	update?id=1
     * 获取：/order/1 GET 	get?id=1
     * 删除：/order/1 DELETE 	delete?id=1
     *
     *
     * /blog/1　HTTP　GET　=>　　得到id　=　1的blog
     * /blog/1　HTTP　DELETE　=>　删除　id　=　1的blog
     * /blog/1　HTTP　PUT　=>　　更新id　=　1的blog
     * /blog　　　HTTP　POST　=>　　新增BLOG
     *
     * 如何发送PUT请求和DELETE请求？
     * 1.需要配置HiddenHttpMethodFilter
     * 2.需要发送POST请求
     * 3.需要在发送POST请求时携带一个name=”_method“的隐藏域，值为DELETE或PUT
     *
     * 在SpringMVC的目标方法中如何得到id呢？ 使用@PathVariable注解
     *
     * </pre>
     */

    @RequestMapping(value = "/methodstest/{id}", method = RequestMethod.GET)
    public String restGet(@PathVariable int id)// 当@PathVariable没有标明{id}，
    {
        System.out.println("get " + id);
        System.out.println("querry operations...");
        return "querry";
    }

    @RequestMapping(value = "/methodstest", method = RequestMethod.POST)
    public String restPost() {
        System.out.println("post ");
        System.out.println("post operations...");
        return "post";
    }

    @RequestMapping(value = "/methodstest/{id}", method = RequestMethod.PUT)
    public String restPut(@PathVariable int id) {
        System.out.println("put " + id);
        System.out.println("put operations...");
        return "put";
    }

    @RequestMapping(value = "/methodstest/{id}", method = RequestMethod.DELETE)
    public String restDelete(@PathVariable int id) {
        System.out.println("delete " + id);
        System.out.println("delete operations...");
        return "delete";
    }
}