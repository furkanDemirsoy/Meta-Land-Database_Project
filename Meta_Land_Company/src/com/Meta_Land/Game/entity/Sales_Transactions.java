/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.entity;

/**
 *
 * @author izemd
 */
public class Sales_Transactions {
    private String SaleDate;
    private String TradedEstate;
    private int PlotNo;
    private int BusineesPrice;

    public Sales_Transactions(String SaleDate, String TradedEstate, int PlotNo, int BusineesPrice) {
        this.SaleDate = SaleDate;
        this.TradedEstate = TradedEstate;
        this.PlotNo = PlotNo;
        this.BusineesPrice = BusineesPrice;
    }
    
    public Sales_Transactions()
    {
        
    }

    /**
     * @return the SaleDate
     */
    public String getSaleDate() {
        return SaleDate;
    }

    /**
     * @param SaleDate the SaleDate to set
     */
    public void setSaleDate(String SaleDate) {
        this.SaleDate = SaleDate;
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
     * @return the BusineesPrice
     */
    public int getBusineesPrice() {
        return BusineesPrice;
    }

    /**
     * @param BusineesPrice the BusineesPrice to set
     */
    public void setBusineesPrice(int BusineesPrice) {
        this.BusineesPrice = BusineesPrice;
    }
    
    
}
