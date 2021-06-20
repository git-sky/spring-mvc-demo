package cn.com.sky.annotation.beans;

public class Person {

    String username;
    int age;
    Location local;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Location getLocal() {
        return local;
    }

    public void setLocal(Location local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Person [username=" + username + ", age=" + age + ", local=" + local + "]";
    }

}