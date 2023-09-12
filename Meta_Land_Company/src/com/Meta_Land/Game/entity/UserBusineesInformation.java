/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.entity;

/**
 *
 * @author izemd
 */
public class UserBusineesInformation {
    private int UserNo;
    private String UserStartDate;
    private String UserEndDate;
    private int UserWorkingDay;
    private String UserWorkingHour;
   

    public UserBusineesInformation(int UserNo, String UserStartDate, String UserEndDate, int UserWorkingDay, String UserWorkingHour) {
        this.UserNo = UserNo;
        this.UserStartDate = UserStartDate;
        this.UserEndDate = UserEndDate;
        this.UserWorkingDay = UserWorkingDay;
        this.UserWorkingHour = UserWorkingHour;
        
    }
public UserBusineesInformation()
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
     * @return the UserStartDate
     */
    public String getUserStartDate() {
        return UserStartDate;
    }

    /**
     * @param UserStartDate the UserStartDate to set
     */
    public void setUserStartDate(String UserStartDate) {
        this.UserStartDate = UserStartDate;
    }

    /**
     * @return the UserEndDate
     */
    public String getUserEndDate() {
        return UserEndDate;
    }

    /**
     * @param UserEndDate the UserEndDate to set
     */
    public void setUserEndDate(String UserEndDate) {
        this.UserEndDate = UserEndDate;
    }

    /**
     * @return the UserWorkingDay
     */
    public int getUserWorkingDay() {
        return UserWorkingDay;
    }

    /**
     * @param UserWorkingDay the UserWorkingDay to set
     */
    public void setUserWorkingDay(int UserWorkingDay) {
        this.UserWorkingDay = UserWorkingDay;
    }

    /**
     * @return the UserWorkingHour
     */
    public String getUserWorkingHour() {
        return UserWorkingHour;
    }

    /**
     * @param UserWorkingHour the UserWorkingHour to set
     */
    public void setUserWorkingHour(String UserWorkingHour) {
        this.UserWorkingHour = UserWorkingHour;
    }

    /**
     * @return the LevelBusinees
     */
    
   

    
    
    
    
}
