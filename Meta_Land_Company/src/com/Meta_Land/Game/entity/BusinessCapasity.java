/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.entity;

/**
 *
 * @author izemd
 */
public class BusinessCapasity {
    private int LevelBusinees;
     private int BusineesCapasity;

    public BusinessCapasity(int LevelBusinees, int BusineesCapasity) {
        this.LevelBusinees = LevelBusinees;
        this.BusineesCapasity = BusineesCapasity;
    }

    public BusinessCapasity()
    {
        
    }
    /**
     * @return the LevelBusinees
     */
    public int getLevelBusinees() {
        return LevelBusinees;
    }

    /**
     * @param LevelBusinees the LevelBusinees to set
     */
    public void setLevelBusinees(int LevelBusinees) {
        this.LevelBusinees = LevelBusinees;
    }

    /**
     * @return the BusineesCapasity
     */
    public int getBusineesCapasity() {
        return BusineesCapasity;
    }

    /**
     * @param BusineesCapasity the BusineesCapasity to set
     */
    public void setBusineesCapasity(int BusineesCapasity) {
        this.BusineesCapasity = BusineesCapasity;
    }
     
     
}
