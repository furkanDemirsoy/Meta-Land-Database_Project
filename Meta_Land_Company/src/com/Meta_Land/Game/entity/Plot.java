/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.entity;

/**
 *
 * @author izemd
 */
public class Plot {
    private int PlotNo;
    private String KindofPlot;
    private String PlotOwner;
    
     private int PlotSize;

    public Plot(int PlotNo, String KindofPlot, String PlotOwner, int PlotSize) {
        this.PlotNo = PlotNo;
        this.KindofPlot = KindofPlot;
        this.PlotOwner = PlotOwner;
        this.PlotSize = PlotSize;
    }
public Plot()
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
     * @return the KindofPlot
     */
    public String getKindofPlot() {
        return KindofPlot;
    }

    /**
     * @param KindofPlot the KindofPlot to set
     */
    public void setKindofPlot(String KindofPlot) {
        this.KindofPlot = KindofPlot;
    }

    /**
     * @return the PlotOwner
     */
    public String getPlotOwner() {
        return PlotOwner;
    }

    /**
     * @param PlotOwner the PlotOwner to set
     */
    public void setPlotOwner(String PlotOwner) {
        this.PlotOwner = PlotOwner;
    }

    /**
     * @return the PlotSize
     */
    public int getPlotSize() {
        return PlotSize;
    }

    /**
     * @param PlotSize the PlotSize to set
     */
    public void setPlotSize(int PlotSize) {
        this.PlotSize = PlotSize;
    }

    
     
}
