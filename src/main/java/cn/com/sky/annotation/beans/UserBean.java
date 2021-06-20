package cn.com.sky.annotation.beans;

public class UserBean {

    Integer id;
    String username;
    String password;
    int age;

    public UserBean(int id, String username, String password, int age) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public UserBean() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserBean [id=" + id + ", username=" + username + ", password=" + password + ", age=" + age + "]";
    }

}