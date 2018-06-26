package com.pay.paas.entity;

public class User {
    private Long id;

    private String username;

    private String password;

    private String userSex;

    private String nickName;

    public User(Long id, String username, String password, String userSex, String nickName) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.userSex = userSex;
        this.nickName = nickName;
    }

    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }
}