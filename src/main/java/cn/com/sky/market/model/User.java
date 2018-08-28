package cn.com.sky.market.model;

import java.util.Date;


public class User {
    private Integer id;
    private String name;
    private String password;
    private Integer height;
    private Integer weight;
    private Integer sex;

    /**
     * 生日
     */
//    @JsonSerialize(using = CustomJsonDateSerializer.class)
//    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    private Date birthday;

    /**
     * 注册日期
     */
    private Date gmtCreated;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Date getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }
}
