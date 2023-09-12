/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.entity;

/**
 *
 * @author izemd
 */
public class UserGameInformation {
    private int UserNo;
    private int AmountofUserFood;
    private int AmountofUserGoods;
    private int AmountofUserMoney;

    public UserGameInformation(int UserNo, int AmountofUserFood, int AmountofUserGoods, int AmountofUserMoney) {
        this.UserNo = UserNo;
        this.AmountofUserFood = AmountofUserFood;
        this.AmountofUserGoods = AmountofUserGoods;
        this.AmountofUserMoney = AmountofUserMoney;
    }
    
    public UserGameInformation()
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
     * @return the AmountofUserFood
     */
    public int getAmountofUserFood() {
        return AmountofUserFood;
    }

    /**
     * @param AmountofUserFood the AmountofUserFood to set
     */
    public void setAmountofUserFood(int AmountofUserFood) {
        this.AmountofUserFood = AmountofUserFood;
    }

    /**
     * @return the AmountofUserGoods
     */
    public int getAmountofUserGoods() {
        return AmountofUserGoods;
    }

    /**
     * @param AmountofUserGoods the AmountofUserGoods to set
     */
    public void setAmountofUserGoods(int AmountofUserGoods) {
        this.AmountofUserGoods = AmountofUserGoods;
    }

    /**
     * @return the AmountofUserMoney
     */
    public int getAmountofUserMoney() {
        return AmountofUserMoney;
    }

    /**
     * @param AmountofUserMoney the AmountofUserMoney to set
     */
    public void setAmountofUserMoney(int AmountofUserMoney) {
        this.AmountofUserMoney = AmountofUserMoney;
    }
    

   
    
}
