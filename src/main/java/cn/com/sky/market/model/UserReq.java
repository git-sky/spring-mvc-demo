package cn.com.sky.market.model;

import java.util.Date;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class UserReq {

    private String name;
    private String password;
    private Integer height;
    private Integer weight;
    private Integer sex;

    //    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
//    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


}
