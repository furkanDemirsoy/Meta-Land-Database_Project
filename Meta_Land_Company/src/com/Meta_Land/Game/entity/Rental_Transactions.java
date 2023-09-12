/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.entity;

/**
 *
 * @author izemd
 */
public class Rental_Transactions {
    private int RentalBusineesPrice;
    private String LeaseStartDate;//kiralama tarihi
    private String LeaseEndDate;
    private int RentalTime;
    private int PlotNo;
     private String TradedEstate;

    public Rental_Transactions(int RentalBusineesPrice, String LeaseStartDate, String LeaseEndDate, int RentalTime, int PlotNo, String TradedEstate) {
        this.RentalBusineesPrice = RentalBusineesPrice;
        this.LeaseStartDate = LeaseStartDate;
        this.LeaseEndDate = LeaseEndDate;
        this.RentalTime = RentalTime;
        this.PlotNo = PlotNo;
        this.TradedEstate = TradedEstate;
    }

    public Rental_Transactions()
    {
        
    }
    /**
     * @return the RentalBusineesPrice
     */
    public int getRentalBusineesPrice() {
        return RentalBusineesPrice;
    }

    /**
     * @param RentalBusineesPrice the RentalBusineesPrice to set
     */
    public void setRentalBusineesPrice(int RentalBusineesPrice) {
        this.RentalBusineesPrice = RentalBusineesPrice;
    }

    /**
     * @return the LeaseStartDate
     */
    public String getLeaseStartDate() {
        return LeaseStartDate;
    }

    /**
     * @param LeaseStartDate the LeaseStartDate to set
     */
    public void setLeaseStartDate(String LeaseStartDate) {
        this.LeaseStartDate = LeaseStartDate;
    }

    /**
     * @return the LeaseEndDate
     */
    public String getLeaseEndDate() {
        return LeaseEndDate;
    }

    /**
     * @param LeaseEndDate the LeaseEndDate to set
     */
    public void setLeaseEndDate(String LeaseEndDate) {
        this.LeaseEndDate = LeaseEndDate;
    }

    /**
     * @return the RentalTime
     */
    public int getRentalTime() {
        return RentalTime;
    }

    /**
     * @param RentalTime the RentalTime to set
     */
    public void setRentalTime(int RentalTime) {
        this.RentalTime = RentalTime;
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
     * @return the TradedEstate
     */
    public String getTradedEstate() {
        return TradedEstate;
    }

    /**
     * @param TradedEstate the TradedEstate to set
     */
    public void setTradedEstate(String TradedEstate) {
        this.TradedEstate = TradedEstate;
    }
     
     
            
}
