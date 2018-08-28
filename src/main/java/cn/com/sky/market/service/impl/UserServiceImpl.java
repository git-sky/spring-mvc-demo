package cn.com.sky.market.service.impl;

import cn.com.sky.market.dao.IUserDao;
import cn.com.sky.market.model.User;
import cn.com.sky.market.model.UserReq;
import cn.com.sky.market.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public Long register(UserReq userReq) {
        return userDao.register(userReq);
    }

    @Override
    public User login(String name, String password) {
        return userDao.login(name, password);
    }

    @Override
    public User logOut() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }
}
