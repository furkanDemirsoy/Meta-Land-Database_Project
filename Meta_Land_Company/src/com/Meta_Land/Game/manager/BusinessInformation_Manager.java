/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.manager;

import com.Meta_Land.DatabaseUtilities.DatabaseUtilites;
import com.Meta_Land.Game.entity.BusinessInformation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author izemd
 */
public class BusinessInformation_Manager {
    
    
     public boolean insert(BusinessInformation x) throws SQLException
    {
        
        Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        
        conn.setAutoCommit(false);
        
        
        PreparedStatement stmt;
        
        String sql="insert into isletme_bilgileri(alan_no,isletme_turu,yonetici_isletme_ucreti,kullanici_isletme_ucreti,isletme_mevcut_seviye_baslangic_tarihi,isletme_seviyesi,isletme_calisan_sayisi) values(?,?,?,?,?,?,?) "; 
        
        
        stmt=conn.prepareStatement(sql);
        
        
     stmt.setInt(1,x.getPlotNo());
     
     stmt.setString(2,x.getBusinessType());
     
     stmt.setString(5,x.getBusinessLevelNowStartDate());
     stmt.setInt(3,x.getManagerOperatingFee());
     stmt.setInt(4,x.getUserOperatingFee());
     stmt.setInt(6,x.getLevelBusinees());
     stmt.setInt(7,x.getBusineesNmbrStaff());
        
     
        
        
        int affected=stmt.executeUpdate();
        
        
        
        
         conn.commit();
        
        conn.close();
        return affected==1?true:false;
    }
    
    
   public BusinessInformation find(int id) throws SQLException
   {
       BusinessInformation x=null;
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        String sql="select * from isletme_bilgileri where alan_no=?";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;
        stmt.setInt(1,id);
      
       resultSet=stmt.executeQuery();//okuma yapmayı sağlayan şey
      
        
        
        if(resultSet.next())//resultSet.next() bu değer olduğu sürece döner 
        {
            x=new BusinessInformation();
            x.setBusinessLevelNowStartDate(resultSet.getString("isletme_mevcut_seviye_baslangic_tarihi"));
            x.setPlotNo(resultSet.getInt("alan_no"));
            x.setBusinessType(resultSet.getString("isletme_turu"));
            x.setUserOperatingFee(resultSet.getInt("kullanici_isletme_ucreti"));
             x.setLevelBusinees(resultSet.getInt("isletme_seviyesi"));
             x.setManagerOperatingFee(resultSet.getInt("yonetici_isletme_ucreti"));
            x.setBusineesNmbrStaff(resultSet.getInt("isletme_calisan_sayisi"));
        }
        
        
        
        
         conn.commit();
        
        conn.close();
        
       return x;
   }
    
    
    
    public boolean update(BusinessInformation x) throws SQLException
    {
        
        
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         
        
        
        
        
        PreparedStatement stmt;
       
        String sql="update isletme_bilgileri set isletme_mevcut_seviye_baslangic_tarihi=?,isletme_turu=?,kullanici_isletme_ucreti=?,isletme_seviyesi=?,yonetici_isletme_ucreti=?,isletme_calisan_sayisi=? where alan_no=?";//aynı id ile kayıt ekleyemezsin bu yüzden burdaki 1. yi yani id yi sürekli değiştir
        stmt=conn.prepareStatement(sql);
        
        
        stmt.setInt(7, x.getPlotNo());
        stmt.setString(1,x.getBusinessLevelNowStartDate());
        stmt.setString(2,x.getBusinessType());
        stmt.setInt(3,x.getUserOperatingFee());
        stmt.setInt(4,x.getLevelBusinees());
        stmt.setInt(5,x.getManagerOperatingFee());
        stmt.setInt(6,x.getBusineesNmbrStaff());
        
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
        
        String sql="delete from isletme_bilgileri where alan_no=?";
        stmt=conn.prepareStatement(sql);
        
        
        stmt.setInt(1,id);
       // stmt.setString(1,"12");
        
        
    
        int affected=stmt.executeUpdate();
        
        
        
        
        
        
        
        
        
        
        
        
          
         conn.commit();
        
        conn.close();
        
        
        
        
        
        
        return affected==1?true:false;
    }
    
    
    public ArrayList<BusinessInformation> list() throws SQLException
    {
        ArrayList<BusinessInformation> Plotlist=new ArrayList<BusinessInformation>();
       
         Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         String sql="select * from isletme_bilgileri ";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;
   
        
       resultSet=stmt.executeQuery();//okuma yapmayı sağlayan şey
     
        
        
        while(resultSet.next())//resultSet.next() bu değer olduğu sürece döner 
        {
           BusinessInformation  x=new BusinessInformation();
            x.setBusinessLevelNowStartDate(resultSet.getString("isletme_mevcut_seviye_baslangic_tarihi"));
            x.setPlotNo(resultSet.getInt("alan_no"));
            x.setBusinessType(resultSet.getString("isletme_turu"));
            x.setUserOperatingFee(resultSet.getInt("kullanici_isletme_ucreti"));
            x.setManagerOperatingFee(resultSet.getInt("yonetici_isletme_ucreti"));
            x.setLevelBusinees(resultSet.getInt("isletme_seviyesi"));
            x.setBusineesNmbrStaff(resultSet.getInt("isletme_calisan_sayisi"));
            Plotlist.add(x);//nesneler listeye atılır
            
        }
        
        
        
        
        
        
        
        
        conn.commit();
        
        conn.close();
        
        
         
        
        
        
        
        return Plotlist;
    }
    
}
