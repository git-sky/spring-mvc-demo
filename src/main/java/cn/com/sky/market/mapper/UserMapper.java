package cn.com.sky.market.mapper;

import cn.com.sky.market.model.User;
import cn.com.sky.market.model.UserReq;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    Long insert(UserReq userReq);

    User selectByNameAndPassword(@Param("name") String name, @Param("password") String password);

    User logOut();

    String getName();
}
