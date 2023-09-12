/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.entity;

/**
 *
 * @author izemd
 */
public class PlotSize {
    private int PlotNo;
    private String PlotSize;

    public PlotSize(int PlotNo, String PlotSize) {
        this.PlotNo = PlotNo;
        this.PlotSize = PlotSize;
    }

    public PlotSize()
    {
        
    }
    /**
     * @return the PlotId
     */
    public int getPlotNo() {
        return PlotNo;
    }

    /**
     * @param PlotId the PlotId to set
     */
    public void setPlotNo(int PlotNo) {
        this.PlotNo = PlotNo;
    }

    /**
     * @return the PlotSize
     */
    public String getPlotSize() {
        return PlotSize;
    }

    /**
     * @param PlotSize the PlotSize to set
     */
    public void setPlotSize(String PlotSize) {
        this.PlotSize = PlotSize;
    }
    
    
}
