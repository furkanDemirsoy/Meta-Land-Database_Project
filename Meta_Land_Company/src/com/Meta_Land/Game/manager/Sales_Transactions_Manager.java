/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.manager;

import com.Meta_Land.DatabaseUtilities.DatabaseUtilites;
import com.Meta_Land.Game.entity.Sales_Transactions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author izemd
 */
public class Sales_Transactions_Manager {
    
    
     public boolean insert(Sales_Transactions x) throws SQLException
    {
        
        Connection conn=null;
        conn= DatabaseUtilites.getConnection();
        
        conn.setAutoCommit(false);
        
        
        PreparedStatement stmt;
        
        String sql="insert into satin_alma(alan_no,isletme_fiyati,satis_tarihi,islem_yapilan_emlak) values(?,?,?,?) "; 
        
        
        stmt=conn.prepareStatement(sql);
        
        
     stmt.setInt(1,x.getPlotNo());// X NESNESİNİN İD Sİ VE ADI VERİTABANINA KAYDEDİLİR
     
     stmt.setInt(2,x.getBusineesPrice());
     
     
    
     stmt.setString(4,x.getTradedEstate());
     stmt.setString(3,x.getSaleDate());
     
        
     
        
        
        int affected=stmt.executeUpdate();
        
        
        
        
         conn.commit();
        
        conn.close();
        return affected==1?true:false;
    }
    
    
   public Sales_Transactions find(int id) throws SQLException
   {
       Sales_Transactions x=null;
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        String sql="select * from satin_alma where alan_no=?";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;
        stmt.setInt(1,id);
      
       resultSet=stmt.executeQuery();//okuma yapmayı sağlayan şey
      
        
        
        if(resultSet.next())//resultSet.next() bu değer olduğu sürece döner 
        {
            x=new Sales_Transactions();
            x.setTradedEstate(resultSet.getString("islem_yapilan_emlak"));
            x.setPlotNo(resultSet.getInt("alan_no"));
          
            x.setBusineesPrice(resultSet.getInt("isletme_fiyati"));
             x.setSaleDate(resultSet.getString("satis_tarihi"));
             
             
        }
        
        
        
        
         conn.commit();
        
        conn.close();
        
       return x;
   }
    
    
    
    public boolean update(Sales_Transactions x) throws SQLException
    {
        
        
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         
        
        
        
        
        PreparedStatement stmt;
      
        String sql="update satin_alma set isletme_fiyati=?,islem_yapilan_emlak=?,satis_tarihi=? where alan_no=?";
        stmt=conn.prepareStatement(sql);
        
       
        
        stmt.setString(2,x.getTradedEstate());
        stmt.setString(3,x.getSaleDate());
        stmt.setInt(4,x.getPlotNo());
        
        stmt.setInt(1,x.getBusineesPrice());
        
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
        
        String sql="delete from satin_alma where alan_no=?";
        stmt=conn.prepareStatement(sql);
        
        
        stmt.setInt(1,id);
       // stmt.setString(1,"12");
        
        
    
        int affected=stmt.executeUpdate();
        
        
        
        
        
        
        
        
        
        
        
        
          
         conn.commit();
        
        conn.close();
        
        
        
        
        
        
        return affected==1?true:false;
    }
    
    
    public ArrayList<Sales_Transactions> list() throws SQLException
    {
        ArrayList<Sales_Transactions> Plotlist=new ArrayList<Sales_Transactions>();
       
         Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         String sql="select * from satin_alma ";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;//sorgunun sonucunda gelen listeler için
    
       resultSet=stmt.executeQuery();//okuma yapmayı sağlayan şey
      
        
        
        while(resultSet.next())//resultSet.next() bu değer olduğu sürece döner 
        {
           Sales_Transactions  x=new Sales_Transactions();
            x.setSaleDate(resultSet.getString("satis_tarihi"));
            x.setPlotNo(resultSet.getInt("alan_no"));
            
            x.setBusineesPrice(resultSet.getInt("isletme_fiyati"));
            x.setTradedEstate(resultSet.getString("islem_yapilan_emlak"));
           
           
            Plotlist.add(x);//nesneler listeye atılır
            
        }
        
        
        
        
        
        
        
        
        conn.commit();
        
        conn.close();
        
        
         
        
        
        
        
        return Plotlist;
    }
    
}
