/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.entity;

/**
 *
 * @author izemd
 */
public class EstateTransactions {
    private int PlotNo;
    private int EstateCommission;
    private String EstateOperationType;

    public EstateTransactions(int PlotNo, int EstateCommission, String EstateOperationType) {
        this.PlotNo = PlotNo;
        this.EstateCommission = EstateCommission;
        this.EstateOperationType = EstateOperationType;
    }

    public EstateTransactions()
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
     * @return the EstateCommission
     */
    public int getEstateCommission() {
        return EstateCommission;
    }

    /**
     * @param EstateCommission the EstateCommission to set
     */
    public void setEstateCommission(int EstateCommission) {
        this.EstateCommission = EstateCommission;
    }

    /**
     * @return the EstateOperationType
     */
    public String getEstateOperationType() {
        return EstateOperationType;
    }

    /**
     * @param EstateOperationType the EstateOperationType to set
     */
    public void setEstateOperationType(String EstateOperationType) {
        this.EstateOperationType = EstateOperationType;
    }
    

   
    
}
