/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.manager;

import com.Meta_Land.DatabaseUtilities.DatabaseUtilites;
import com.Meta_Land.Game.entity.Rental_Transactions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author izemd
 */
public class Rental_Transactions_Manager {
    
    
     public boolean insert(Rental_Transactions x) throws SQLException
    {
        
        Connection conn=null;
        conn= DatabaseUtilites.getConnection();
        
        conn.setAutoCommit(false);
        
        
        PreparedStatement stmt;
        
        String sql="insert into kiralama_islemleri(alan_no,kiralama_tarihi,kira_bitis_tarihi,islem_yapilan_emlak,kiralik_isletme_fiyati,kira_suresi) values(?,?,?,?,?,?) "; 
        
        
        stmt=conn.prepareStatement(sql);
        
        
     stmt.setInt(1,x.getPlotNo());
     
     stmt.setString(2,x.getLeaseStartDate());
     
     stmt.setString(3,x.getLeaseEndDate());
     stmt.setInt(5,x.getRentalBusineesPrice());
     stmt.setInt(6,x.getRentalTime());
     stmt.setString(4,x.getTradedEstate());
     
        
     
        
        
        int affected=stmt.executeUpdate();
        
        
        
        
         conn.commit();
        
        conn.close();
        return affected==1?true:false;
    }
    
    
   public Rental_Transactions  find(int id) throws SQLException
   {
       Rental_Transactions  x=null;
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        String sql="select * from kiralama_islemleri where alan_no=?";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;
        stmt.setInt(1,id);
      
       resultSet=stmt.executeQuery();//okuma yapmayı sağlayan şey
      
        
        
        if(resultSet.next())//resultSet.next() bu değer olduğu sürece döner 
        {
            x=new Rental_Transactions();
            x.setLeaseEndDate(resultSet.getString("kira_bitis_tarihi"));
           
            x.setLeaseStartDate(resultSet.getString("kiralama_tarihi"));
            x.setTradedEstate(resultSet.getString("islem_yapilan_emlak"));
            x.setPlotNo(resultSet.getInt("alan_no"));
             x.setRentalBusineesPrice(resultSet.getInt("kiralik_isletme_fiyati"));
              x.setRentalTime(resultSet.getInt("kira_suresi"));
             
        }
        
        
        
        
         conn.commit();
        
        conn.close();
        
       return x;
   }
    
    
    
    public boolean update(Rental_Transactions x) throws SQLException
    {
        
        
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         
        
        
        
        
        PreparedStatement stmt;
      
        String sql="update kiralama_islemleri set kira_bitis_tarihi=?,kiralama_tarihi=?,islem_yapilan_emlak=?,kiralik_isletme_fiyati=?,kira_suresi=? where alan_no=?";//aynı id ile kayıt ekleyemezsin bu yüzden burdaki 1. yi yani id yi sürekli değiştir
        stmt=conn.prepareStatement(sql);
        
        
        stmt.setInt(6, x.getPlotNo());
        stmt.setString(1,x.getLeaseEndDate());//BURADA İSİM GÜNCELLENİR
        stmt.setString(2,x.getLeaseStartDate());
        stmt.setString(3,x.getTradedEstate());
        
        stmt.setInt(4,x.getRentalBusineesPrice());
        stmt.setInt(5,x.getRentalTime());
       
        
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
        
        String sql="delete from kiralama_islemleri where alan_no=?";
        stmt=conn.prepareStatement(sql);
        
      
        stmt.setInt(1,id);
       // stmt.setString(1,"12");
        
        
    
        int affected=stmt.executeUpdate();
        
        
        
        
        
        
        
        
        
        
        
        
          
         conn.commit();
        
        conn.close();
        
        
        
        
        
        
        return affected==1?true:false;
    }
    
    
    public ArrayList<Rental_Transactions> list() throws SQLException
    {
        ArrayList<Rental_Transactions> Plotlist=new ArrayList<Rental_Transactions>();
       
         Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         String sql="select * from kiralama_islemleri ";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;//sorgunun sonucunda gelen listeler için
     
       resultSet=stmt.executeQuery();//okuma yapmayı sağlayan şey
      
        
        
        while(resultSet.next())//resultSet.next() bu değer olduğu sürece döner 
        {
           Rental_Transactions  x=new Rental_Transactions();
            x.setLeaseEndDate(resultSet.getString("kira_bitis_tarihi"));
            x.setPlotNo(resultSet.getInt("alan_no"));
            x.setLeaseStartDate(resultSet.getString("kiralama_tarihi"));
            x.setRentalBusineesPrice(resultSet.getInt("kiralik_isletme_fiyati"));
            x.setTradedEstate(resultSet.getString("islem_yapilan_emlak"));
            x.setRentalTime(resultSet.getInt("kira_suresi"));
            Plotlist.add(x);//nesneler listeye atılır
            
        }
        
        
      
        
        
        
        
        
        conn.commit();
        
        conn.close();
        
        
         
        
        
        
        
        return Plotlist;
    }
    
}
