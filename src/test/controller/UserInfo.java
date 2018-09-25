package test.controller;

/**
 * 用户信息
 */
public class UserInfo {
    private String userId;
    private String name;
    private String tel;
    private String age;

    public UserInfo() {
    }

    public UserInfo(String userId, String name, String tel, String age) {
        this.userId = userId;
        this.name = name;
        this.tel = tel;
        this.age = age;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
