package com.Managerment.pojo;

public class User {
    private Integer userId;

    private String userName;

    private String userPassword;

    public Integer getId() {
        return userId;
    }

    public void setId(Integer id) {
        this.userId = id;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username == null ? null : username.trim();
    }

    public String getPassword() {
        return userPassword;
    }

    public void setPassword(String password) {
        this.userPassword = password == null ? null : password.trim();
    }
}