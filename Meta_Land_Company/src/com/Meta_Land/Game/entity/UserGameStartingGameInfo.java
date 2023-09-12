/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.entity;

/**
 *
 * @author izemd
 */
public class UserGameStartingGameInfo {
     private int UserNo;
    private int StartingfUserMoney;
     private int StartingfUserFood;
      private int StartingfUserGoods;
      private String StartingGameDate;//TARİHLERİ STRİNG ALDIK

    public UserGameStartingGameInfo(int UserNo, int StartingfUserMoney, int StartingfUserFood, int StartingfUserGoods, String StartingGameDate) {
        this.UserNo = UserNo;
        this.StartingfUserMoney = StartingfUserMoney;
        this.StartingfUserFood = StartingfUserFood;
        this.StartingfUserGoods = StartingfUserGoods;
        this.StartingGameDate = StartingGameDate;
    }

    public UserGameStartingGameInfo()
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
     * @return the StartingfUserMoney
     */
    public int getStartingfUserMoney() {
        return StartingfUserMoney;
    }

    /**
     * @param StartingfUserMoney the StartingfUserMoney to set
     */
    public void setStartingfUserMoney(int StartingfUserMoney) {
        this.StartingfUserMoney = StartingfUserMoney;
    }

    /**
     * @return the StartingfUserFood
     */
    public int getStartingfUserFood() {
        return StartingfUserFood;
    }

    /**
     * @param StartingfUserFood the StartingfUserFood to set
     */
    public void setStartingfUserFood(int StartingfUserFood) {
        this.StartingfUserFood = StartingfUserFood;
    }

    /**
     * @return the StartingfUserGoods
     */
    public int getStartingfUserGoods() {
        return StartingfUserGoods;
    }

    /**
     * @param StartingfUserGoods the StartingfUserGoods to set
     */
    public void setStartingfUserGoods(int StartingfUserGoods) {
        this.StartingfUserGoods = StartingfUserGoods;
    }

    /**
     * @return the StartingGameDate
     */
    public String getStartingGameDate() {
        return StartingGameDate;
    }

    /**
     * @param StartingGameDate the StartingGameDate to set
     */
    public void setStartingGameDate(String StartingGameDate) {
        this.StartingGameDate = StartingGameDate;
    }
      
      
      
}
