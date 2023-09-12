/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.entity;

/**
 *
 * @author izemd
 */
public class DaileyExpanse {
    private int id;
     private int DailyFoodExpanse;
    private int DailyGoodsExpanse;
    private int DailyMoneyExpanse;

    public DaileyExpanse(int id, int DailyFoodExpanse, int DailyGoodsExpanse, int DailyMoneyExpanse) {
        this.id = id;
        this.DailyFoodExpanse = DailyFoodExpanse;
        this.DailyGoodsExpanse = DailyGoodsExpanse;
        this.DailyMoneyExpanse = DailyMoneyExpanse;
    }

    public DaileyExpanse()
    {
        
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the DailyFoodExpanse
     */
    public int getDailyFoodExpanse() {
        return DailyFoodExpanse;
    }

    /**
     * @param DailyFoodExpanse the DailyFoodExpanse to set
     */
    public void setDailyFoodExpanse(int DailyFoodExpanse) {
        this.DailyFoodExpanse = DailyFoodExpanse;
    }

    /**
     * @return the DailyGoodsExpanse
     */
    public int getDailyGoodsExpanse() {
        return DailyGoodsExpanse;
    }

    /**
     * @param DailyGoodsExpanse the DailyGoodsExpanse to set
     */
    public void setDailyGoodsExpanse(int DailyGoodsExpanse) {
        this.DailyGoodsExpanse = DailyGoodsExpanse;
    }

    /**
     * @return the DailyMoneyExpanse
     */
    public int getDailyMoneyExpanse() {
        return DailyMoneyExpanse;
    }

    /**
     * @param DailyMoneyExpanse the DailyMoneyExpanse to set
     */
    public void setDailyMoneyExpanse(int DailyMoneyExpanse) {
        this.DailyMoneyExpanse = DailyMoneyExpanse;
    }
    
    
}
