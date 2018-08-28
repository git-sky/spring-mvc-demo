package cn.com.sky.market.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Date;

/**
 * jackson，Date默认转换为long格式
 */
public class TestUser {

    public static void main(String[] args) {
        User user = new User();
        user.setName("sky");
        user.setHeight(175);
        user.setBirthday(new Date());


        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        try {
            String json = objectMapper.writeValueAsString(user);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }
}
