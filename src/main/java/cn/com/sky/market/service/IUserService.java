package cn.com.sky.market.service;

import cn.com.sky.market.model.User;
import cn.com.sky.market.model.UserReq;

public interface IUserService {

    Long register(UserReq userReq);

    User login(String name, String password);

    User logOut();

    String getName();

}
