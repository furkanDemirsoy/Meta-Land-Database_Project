/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.manager;

import com.Meta_Land.DatabaseUtilities.DatabaseUtilites;
import com.Meta_Land.Game.entity.PlotSize;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author izemd
 */
public class PlotSize_Manager {
    
    
     public boolean insert(PlotSize x) throws SQLException
    {
        
        Connection conn=null;
        conn= DatabaseUtilites.getConnection();
        
        conn.setAutoCommit(false);
        
        
        PreparedStatement stmt;
        
        String sql="insert into alan_boyutu_tablosu(boyutid,oyun_alan_boyutu) values(?,?) "; 
        
        
        stmt=conn.prepareStatement(sql);
        
        
     stmt.setInt(1,x.getPlotNo());// X NESNESİNİN İD Sİ VE ADI VERİTABANINA KAYDEDİLİR
     
     stmt.setString(2,x.getPlotSize());
     
     
        
     
        
        
        int affected=stmt.executeUpdate();
        
        
        
        
         conn.commit();
        
        conn.close();
        return affected==1?true:false;
    }
    
    
   public PlotSize find(int id) throws SQLException
   {
       PlotSize x=null;
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        String sql="select * from alan_boyutu_tablosu where boyutid=?";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;
        stmt.setInt(1,id);
      
       resultSet=stmt.executeQuery();//okuma yapmayı sağlayan şey
      
        
        
        if(resultSet.next())//resultSet.next() bu değer olduğu sürece döner 
        {
            x=new PlotSize();
            x.setPlotSize(resultSet.getString("oyun_alan_boyutu"));
            x.setPlotNo(resultSet.getInt("boyutid"));
            
        }
        
        
        
        
         conn.commit();
        
        conn.close();
       
       return x;
   }
    
    
    
    public boolean update(PlotSize x) throws SQLException
    {
        
        
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         
        
        
        
        
        PreparedStatement stmt;
        
        String sql="update alan_boyutu_tablosu set oyun_alan_boyutu=? where boyutid=?";
        stmt=conn.prepareStatement(sql);
        
        
        stmt.setInt(2, x.getPlotNo());
        stmt.setString(1,x.getPlotSize());//BURADA İSİM GÜNCELLENİR
        
        
        int affected=stmt.executeUpdate();
        
        
        
        
        
        
        
         conn.commit();
        
        conn.close();
        
        
        
        
        
        
        
        
        
        
        
        
        
        return affected==1?true:false;
    }
    
    
    public boolean delete(int id) throws SQLException
    {
        
         Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
         PreparedStatement stmt;
        
        String sql="delete from alan_boyutu_tablosu where boyutid=?";
        stmt=conn.prepareStatement(sql);
        
        
        stmt.setInt(1,id);
       // stmt.setString(1,"12");
        
        
    
        int affected=stmt.executeUpdate();
        
        
        
        
        
        
        
        
        
        
        
        
          
         conn.commit();
        
        conn.close();
        
        
        
        
        
        
        return affected==1?true:false;
    }
    
    
    public ArrayList<PlotSize> list() throws SQLException
    {
        ArrayList<PlotSize> Plotlist=new ArrayList<PlotSize>();
       
         Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         String sql="select * from alan_boyutu_tablosu ";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;//sorgunun sonucunda gelen listeler için
     
       resultSet=stmt.executeQuery();//okuma yapmayı sağlayan şey
     
        
        
        while(resultSet.next())//resultSet.next() bu değer olduğu sürece döner 
        {
           PlotSize x=new PlotSize();
            x.setPlotSize(resultSet.getString("oyun_alan_boyutu"));
            x.setPlotNo(resultSet.getInt("boyutid"));
           
            Plotlist.add(x);//nesneler listeye atılır
            
        }
        
        
        
        
        
        
        
        
        conn.commit();
        
        conn.close();
        
        
         
        
        
        
        
        return Plotlist;
    }
    
}
