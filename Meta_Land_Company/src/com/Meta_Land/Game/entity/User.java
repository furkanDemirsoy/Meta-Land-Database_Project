/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.entity;

/**
 *
 * @author izemd
 */
public class User {
    private int UserNo;
    private String UserName;
    private String UserSurname;
    private String UserPassword;

    public User(int UserNo, String UserName, String UserSurname, String UserPassword) {
        this.UserNo = UserNo;
        this.UserName = UserName;
        this.UserSurname = UserSurname;
        this.UserPassword = UserPassword;
    }
    public User()
    {
        
    }

    /**
     * @return the UserNo
     */
    public int getUserNo() {
        return UserNo;
    }

    /**
     * @param UserNo the UserNo to set
     */
    public void setUserNo(int UserNo) {
        this.UserNo = UserNo;
    }

    /**
     * @return the UserName
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * @param UserName the UserName to set
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * @return the UserSurname
     */
    public String getUserSurname() {
        return UserSurname;
    }

    /**
     * @param UserSurname the UserSurname to set
     */
    public void setUserSurname(String UserSurname) {
        this.UserSurname = UserSurname;
    }

    /**
     * @return the UserPassword
     */
    public String getUserPassword() {
        return UserPassword;
    }

    /**
     * @param UserPassword the UserPassword to set
     */
    public void setUserPassword(String UserPassword) {
        this.UserPassword = UserPassword;
    }
    
}
