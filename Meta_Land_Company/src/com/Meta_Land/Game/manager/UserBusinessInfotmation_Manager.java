/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.manager;

import com.Meta_Land.DatabaseUtilities.DatabaseUtilites;
import com.Meta_Land.Game.entity.UserBusineesInformation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author izemd
 */
public class UserBusinessInfotmation_Manager {
    
     public boolean insert(UserBusineesInformation x) throws SQLException
    {
        
        Connection conn=null;
        conn= DatabaseUtilites.getConnection();
        
        conn.setAutoCommit(false);
        
        
        PreparedStatement stmt;
        
        String sql="insert into kullanici_isletme_bilgileri_tablosu(kullanici_no,kullanici_calisma_baslangic_tarihi,kullanici_calisma_bitis_tarihi,kullanici_calisma_gun_sayisi,kullanici_calisma_saatleri) values(?,?,?,?,?) "; 
        
        
        stmt=conn.prepareStatement(sql);
        
        
     stmt.setInt(1,x.getUserNo());
     
     stmt.setString(2,x.getUserStartDate());
     
     stmt.setString(3,x.getUserEndDate());
     stmt.setInt(4,x.getUserWorkingDay());
     stmt.setString(5,x.getUserWorkingHour());
     
        
     
        
        
        int affected=stmt.executeUpdate();
        
        
        
        
         conn.commit();
        
        conn.close();
        return affected==1?true:false;
    }
    
    
   public UserBusineesInformation  find(int id) throws SQLException
   {
       UserBusineesInformation  x=null;
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        String sql="select * from kullanici_isletme_bilgileri_tablosu where kullanici_no=?";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;
        stmt.setInt(1,id);
      
       resultSet=stmt.executeQuery();//okuma yapmayı sağlayan şey
      
        
        
        if(resultSet.next())//resultSet.next() bu değer olduğu sürece döner 
        {
            x=new UserBusineesInformation();
            x.setUserEndDate(resultSet.getString("kullanici_calisma_bitis_tarihi"));
           
            x.setUserStartDate(resultSet.getString("kullanici_calisma_baslangic_tarihi"));
            x.setUserWorkingHour(resultSet.getString("kullanici_calisma_saatleri"));
            x.setUserNo(resultSet.getInt("kullanici_no"));
             x.setUserWorkingDay(resultSet.getInt("kullanici_calisma_gun_sayisi"));
             
        }
        
        
        
        
         conn.commit();
        
        conn.close();
        
       return x;
   }
    
    
    
    public boolean update(UserBusineesInformation x) throws SQLException
    {
        
        
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         
        
        
        
        
        PreparedStatement stmt;
       
        String sql="update kullanici_isletme_bilgileri_tablosu set kullanici_calisma_gun_sayisi=?,kullanici_calisma_saatleri=?,kullanici_calisma_bitis_tarihi=?,kullanici_calisma_baslangic_tarihi=? where kullanici_no=?";//aynı id ile kayıt ekleyemezsin bu yüzden burdaki 1. yi yani id yi sürekli değiştir
        stmt=conn.prepareStatement(sql);
        
        
        stmt.setInt(1, x.getUserWorkingDay());
        stmt.setString(2,x.getUserWorkingHour());//BURADA İSİM GÜNCELLENİR
        stmt.setString(3,x.getUserEndDate());
        stmt.setString(4,x.getUserStartDate());
        
        stmt.setInt(5,x.getUserNo());
       
        
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
        
        String sql="delete from kullanici_isletme_bilgileri_tablosu where kullanici_no=?";
        stmt=conn.prepareStatement(sql);
        
       
        stmt.setInt(1,id);
       // stmt.setString(1,"12");
        
        
    
        int affected=stmt.executeUpdate();
        
        
        
        
        
        
        
        
        
        
        
        
          
         conn.commit();
        
        conn.close();
        
        
        
        
        
        
        return affected==1?true:false;
    }
    
    
    public ArrayList<UserBusineesInformation> list() throws SQLException
    {
        ArrayList<UserBusineesInformation> Plotlist=new ArrayList<UserBusineesInformation>();
       
         Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         String sql="select * from kullanici_isletme_bilgileri_tablosu ";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;//sorgunun sonucunda gelen listeler için
     
       resultSet=stmt.executeQuery();//okuma yapmayı sağlayan şey
     
        
        
        while(resultSet.next())//resultSet.next() bu değer olduğu sürece döner 
        {
           UserBusineesInformation  x=new UserBusineesInformation();
            x.setUserStartDate(resultSet.getString("kullanici_calisma_baslangic_tarihi"));
            x.setUserNo(resultSet.getInt("kullanici_no"));
            x.setUserEndDate(resultSet.getString("kullanici_calisma_bitis_tarihi"));
            x.setUserWorkingDay(resultSet.getInt("kullanici_calisma_gun_sayisi"));
            x.setUserWorkingHour(resultSet.getString("kullanici_calisma_saatleri"));
            Plotlist.add(x);//nesneler listeye atılır
            
        }
        
        
      
        
        
        
        
        
        conn.commit();
        
        conn.close();
        
        
         
        
        
        
        
        return Plotlist;
    }
    
}
