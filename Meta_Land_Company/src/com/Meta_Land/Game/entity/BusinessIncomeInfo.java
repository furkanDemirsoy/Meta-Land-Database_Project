/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.entity;

/**
 *
 * @author izemd
 */
public class BusinessIncomeInfo {
    private int PlotNo;
    private int BusinessFixedIncomeAmount;
    private int BusinessFixedIncomeRate;
    private int MarketFoodPrice;
    private int ClothingGoodsPrice;

    public BusinessIncomeInfo(int PlotNo, int BusinessFixedIncomeAmount, int BusinessFixedIncomeRate, int MarketFoodPrice, int ClothingGoodPrice) {
        this.PlotNo = PlotNo;
        this.BusinessFixedIncomeAmount = BusinessFixedIncomeAmount;
        this.BusinessFixedIncomeRate = BusinessFixedIncomeRate;
        this.MarketFoodPrice = MarketFoodPrice;
        this.ClothingGoodsPrice = ClothingGoodPrice;
    }

    public BusinessIncomeInfo()
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
     * @return the BusinessFixedIncomeAmount
     */
    public int getBusinessFixedIncomeAmount() {
        return BusinessFixedIncomeAmount;
    }

    /**
     * @param BusinessFixedIncomeAmount the BusinessFixedIncomeAmount to set
     */
    public void setBusinessFixedIncomeAmount(int BusinessFixedIncomeAmount) {
        this.BusinessFixedIncomeAmount = BusinessFixedIncomeAmount;
    }

    /**
     * @return the BusinessFixedIncomeRate
     */
    public int getBusinessFixedIncomeRate() {
        return BusinessFixedIncomeRate;
    }

    /**
     * @param BusinessFixedIncomeRate the BusinessFixedIncomeRate to set
     */
    public void setBusinessFixedIncomeRate(int BusinessFixedIncomeRate) {
        this.BusinessFixedIncomeRate = BusinessFixedIncomeRate;
    }

    /**
     * @return the MarketFoodPrice
     */
    public int getMarketFoodPrice() {
        return MarketFoodPrice;
    }

    /**
     * @param MarketFoodPrice the MarketFoodPrice to set
     */
    public void setMarketFoodPrice(int MarketFoodPrice) {
        this.MarketFoodPrice = MarketFoodPrice;
    }

    /**
     * @return the ClothingGoodPrice
     */
    public int getClothingGoodPrice() {
        return ClothingGoodsPrice;
    }

    /**
     * @param ClothingGoodPrice the ClothingGoodPrice to set
     */
    public void setClothingGoodPrice(int ClothingGoodPrice) {
        this.ClothingGoodsPrice = ClothingGoodPrice;
    }
    
    
    
}
