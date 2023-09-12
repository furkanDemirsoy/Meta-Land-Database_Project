/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.manager;

import com.Meta_Land.DatabaseUtilities.DatabaseUtilites;
import com.Meta_Land.Game.entity.Plot;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author izemd
 */
public class Plot_Manager {
    
     public boolean insert(Plot x) throws SQLException
    {
        
        Connection conn=null;
        conn= DatabaseUtilites.getConnection();
        
        conn.setAutoCommit(false);
        
        
        PreparedStatement stmt;
        
        String sql="insert into alan_tablosu(alan_no,alan_turu,alan_sahibi,alan_boyutu) values(?,?,?,?) "; 
        
        
        stmt=conn.prepareStatement(sql);
        
        
     stmt.setInt(1,x.getPlotNo());// X NESNESİNİN İD Sİ VE ADI VERİTABANINA KAYDEDİLİR
     
     stmt.setString(2,x.getKindofPlot());
     
     stmt.setString(3,x.getPlotOwner());
     
     stmt.setInt(4,x.getPlotSize());
        
     
        
        
        int affected=stmt.executeUpdate();
        
        
        
        
         conn.commit();
        
        conn.close();
        return affected==1?true:false;
    }
    
    
   public Plot find(int id) throws SQLException
   {
       Plot x=null;
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        String sql="select * from alan_tablosu where alan_no=?";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;
        stmt.setInt(1,id);
      
       resultSet=stmt.executeQuery();//okuma yapmayı sağlayan şey
      
        
        
        if(resultSet.next())//resultSet.next() bu değer olduğu sürece döner 
        {
            x=new Plot();
            x.setPlotOwner(resultSet.getString("alan_sahibi"));
            x.setPlotNo(resultSet.getInt("alan_no"));
            x.setKindofPlot(resultSet.getString("alan_turu"));
            
             x.setPlotSize(resultSet.getInt("alan_boyutu"));
        }
        
        
        
        
         conn.commit();
        
        conn.close();
        
       return x;
   }
    
    
    
    public boolean update(Plot x) throws SQLException
    {
        
        
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         
        
        
        
        
        PreparedStatement stmt;
       
        String sql="update alan_tablosu set alan_sahibi=?,alan_turu=?,alan_boyutu=? where alan_no=?";
        stmt=conn.prepareStatement(sql);
        
        
        stmt.setInt(4, x.getPlotNo());
        stmt.setString(1,x.getPlotOwner());//BURADA İSİM GÜNCELLENİR
        stmt.setString(2,x.getKindofPlot());
        
        stmt.setInt(3,x.getPlotSize());
        
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
        
        String sql="delete from alan_tablosu where alan_no=?";
        stmt=conn.prepareStatement(sql);
        
       
        stmt.setInt(1,id);
       // stmt.setString(1,"12");
        
        
    
        int affected=stmt.executeUpdate();
        
        
        
        
        
        
        
        
        
        
        
        
          
         conn.commit();
        
        conn.close();
        
        
        
        
        
        
        return affected==1?true:false;
    }
    
    
    public ArrayList<Plot> list() throws SQLException
    {
        ArrayList<Plot> Plotlist=new ArrayList<Plot>();
       
         Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         String sql="select * from alan_tablosu ";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;//sorgunun sonucunda gelen listeler için
     
       resultSet=stmt.executeQuery();//okuma yapmayı sağlayan şey
      
        
        
        while(resultSet.next())//resultSet.next() bu değer olduğu sürece döner 
        {
           Plot  x=new Plot();
            x.setPlotOwner(resultSet.getString("alan_sahibi"));
            x.setPlotNo(resultSet.getInt("alan_no"));
            x.setKindofPlot(resultSet.getString("alan_turu"));
            x.setPlotSize(resultSet.getInt("alan_boyutu"));
           
            Plotlist.add(x);//nesneler listeye atılır
            
        }
        
        
        
        
        
        
        
        
        conn.commit();
        
        conn.close();
        
        
         
        
        
        
        
        return Plotlist;
    }
    
}
