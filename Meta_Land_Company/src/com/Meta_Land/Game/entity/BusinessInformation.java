/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.entity;

/**
 *
 * @author izemd
 */
public class BusinessInformation {
    private int PlotNo;
    private String BusinessType;
    private int ManagerOperatingFee;
    private int UserOperatingFee;
    private String BusinessLevelNowStartDate;//TARİHLERİ STRİNG ALDIM AMA SQL DE STRİNG DEĞİL
private int BusineesNmbrStaff;
private int LevelBusinees;

    public BusinessInformation(int PlotNo, String BusinessType, int ManagerOperatingFee, int UserOperatingFee, String BusinessLevelNowStartDate, int BusineesNmbrStaff, int LevelBusinees) {
        this.PlotNo = PlotNo;
        this.BusinessType = BusinessType;
        this.ManagerOperatingFee = ManagerOperatingFee;
        this.UserOperatingFee = UserOperatingFee;
        this.BusinessLevelNowStartDate = BusinessLevelNowStartDate;
        this.BusineesNmbrStaff = BusineesNmbrStaff;
        this.LevelBusinees = LevelBusinees;
    }
public BusinessInformation()
{
    
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

    /**
     * @return the BusinessType
     */
    public String getBusinessType() {
        return BusinessType;
    }

    /**
     * @param BusinessType the BusinessType to set
     */
    public void setBusinessType(String BusinessType) {
        this.BusinessType = BusinessType;
    }

    /**
     * @return the ManagerOperatingFee
     */
    public int getManagerOperatingFee() {
        return ManagerOperatingFee;
    }

    /**
     * @param ManagerOperatingFee the ManagerOperatingFee to set
     */
    public void setManagerOperatingFee(int ManagerOperatingFee) {
        this.ManagerOperatingFee = ManagerOperatingFee;
    }

    /**
     * @return the UserOperatingFee
     */
    public int getUserOperatingFee() {
        return UserOperatingFee;
    }

    /**
     * @param UserOperatingFee the UserOperatingFee to set
     */
    public void setUserOperatingFee(int UserOperatingFee) {
        this.UserOperatingFee = UserOperatingFee;
    }

    /**
     * @return the BusinessLevelNowStartDate
     */
    public String getBusinessLevelNowStartDate() {
        return BusinessLevelNowStartDate;
    }

    /**
     * @param BusinessLevelNowStartDate the BusinessLevelNowStartDate to set
     */
    public void setBusinessLevelNowStartDate(String BusinessLevelNowStartDate) {
        this.BusinessLevelNowStartDate = BusinessLevelNowStartDate;
    }

    /**
     * @return the BusineesNmbrStaff
     */
    public int getBusineesNmbrStaff() {
        return BusineesNmbrStaff;
    }

    /**
     * @param BusineesNmbrStaff the BusineesNmbrStaff to set
     */
    public void setBusineesNmbrStaff(int BusineesNmbrStaff) {
        this.BusineesNmbrStaff = BusineesNmbrStaff;
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
   

    
    
}
