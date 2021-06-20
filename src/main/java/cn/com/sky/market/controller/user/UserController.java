//package cn.com.sky.market.controller.user;
//
//
//import cn.com.sky.market.model.CommonHttpResponse;
//import cn.com.sky.market.model.UserReq;
//import cn.com.sky.market.service.IUserService;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.annotation.Resource;
//
////localhost:8081/spring-mvc-demo/user/register
//
//@Controller
//@RequestMapping("/user")
//public class UserController {
//
//    @Resource
//    private IUserService userService;
//
//
//    @RequestMapping(value = "/register", method = RequestMethod.GET)
//    @ResponseBody
//    public CommonHttpResponse register(@RequestBody UserReq userReq) {
//        CommonHttpResponse response = new CommonHttpResponse();
//        response.setData(userService.register(userReq));
//        return response;
//    }
//
//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    @ResponseBody
//    public CommonHttpResponse login(String name, String password) {
//        CommonHttpResponse response = new CommonHttpResponse();
//        response.setData(userService.login(name, password));
//        return response;
//    }
//
//}