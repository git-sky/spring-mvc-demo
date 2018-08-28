package cn.com.sky.market.dao.impl;

import cn.com.sky.market.dao.IUserDao;
import cn.com.sky.market.mapper.UserMapper;
import cn.com.sky.market.model.User;
import cn.com.sky.market.model.UserReq;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class UserDaoImpl implements IUserDao {

    @Resource
    private  UserMapper userMapper;

    @Override
    public Long register(UserReq userReq) {
        return userMapper.insert(userReq);
    }

    @Override
    public User login(String name, String password) {
        return userMapper.selectByNameAndPassword(name, password);
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
