/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.entity;

/**
 *
 * @author izemd
 */
public class UserWorkingPlace {
     private int UserNo;
     private int PlotNo;

    public UserWorkingPlace(int UserNo, int PlotNo) {
        this.UserNo = UserNo;
        this.PlotNo = PlotNo;
    }
public UserWorkingPlace()
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
     * @return the PlotNo
     */
    public int getPlotNo() {
        return PlotNo;
    }

    /**
     * @param PlotNo the PlotNo to set
     */
    public void setPlotNo(int PlotNo) {
        this.PlotNo = PlotNo;
    }
     
     
}
