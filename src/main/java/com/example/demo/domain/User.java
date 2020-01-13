package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 用户实体类
 */
@TableName("login")
public class User {
    private String userid;
    private String userName;
    private String userPassword;

    public String getId() {
        return userid;
    }

    public void setId(String userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + userid + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
