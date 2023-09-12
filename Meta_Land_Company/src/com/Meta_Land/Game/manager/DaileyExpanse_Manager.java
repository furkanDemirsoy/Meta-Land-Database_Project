/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.manager;

import com.Meta_Land.DatabaseUtilities.DatabaseUtilites;
import com.Meta_Land.Game.entity.DaileyExpanse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author izemd
 */
public class DaileyExpanse_Manager {
    
     public boolean insert(DaileyExpanse x) throws SQLException
    {
        
        Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        PreparedStatement stmt;
        
        String sql="insert into gunluk_gider(id,gunluk_yiyecek_gideri,gunluk_esya_gideri,gunluk_para_gideri) values(?,?,?,?) "; 
        
        
        stmt=conn.prepareStatement(sql);
        
        
     stmt.setInt(1,x.getId());// X NESNESİNİN İD Sİ VE ADI VERİTABANINA KAYDEDİLİR
     
     stmt.setInt(2,x.getDailyFoodExpanse());
     
     stmt.setInt(3,x.getDailyGoodsExpanse());
     stmt.setInt(4,x.getDailyMoneyExpanse());
     
        
     
        
        
        int affected=stmt.executeUpdate();
        
        
        
        
         conn.commit();
        
        conn.close();
        return affected==1?true:false;
    }
    
    
   public DaileyExpanse find(int id) throws SQLException
   {
       DaileyExpanse x=null;
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        String sql="select * from gunluk_gider where id=?";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;
        stmt.setInt(1,id);
      
       resultSet=stmt.executeQuery();//okuma yapmayı sağlayan şey
      
        
        
        if(resultSet.next())//resultSet.next() bu değer olduğu sürece döner 
        {
            x=new DaileyExpanse();
            
            x.setId(resultSet.getInt("id"));
          
            x.setDailyMoneyExpanse(resultSet.getInt("gunluk_para_gideri"));
             x.setDailyFoodExpanse(resultSet.getInt("gunluk_yiyecek_gideri"));
             x.setDailyGoodsExpanse(resultSet.getInt("gunluk_esya_gideri"));
          
        }
        
        
        
        
         conn.commit();
        
        conn.close();
        
       return x;
   }
    
    
    
    public boolean update(DaileyExpanse x) throws SQLException
    {
        
        
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         
        
        
        
        
        PreparedStatement stmt;
       
        String sql="update gunluk_gider set gunluk_para_gideri=?,gunluk_yiyecek_gideri=?,gunluk_esya_gideri=? where id=?";
        stmt=conn.prepareStatement(sql);
        
       
        stmt.setInt(4, x.getId());
        
        stmt.setInt(1,x.getDailyMoneyExpanse());
        stmt.setInt(2,x.getDailyFoodExpanse());
        stmt.setInt(3,x.getDailyGoodsExpanse());
       
        
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
        
        String sql="delete from gunluk_gider where id=?";
        stmt=conn.prepareStatement(sql);
        
       
        stmt.setInt(1,id);
       // stmt.setString(1,"12");
        
        
    
        int affected=stmt.executeUpdate();
        
        
        
        
        
        
        
        
        
        
        
        
          
         conn.commit();
        
        conn.close();
        
        
        
        
        
        
        return affected==1?true:false;
    }
    
    
    public ArrayList<DaileyExpanse> list() throws SQLException
    {
        ArrayList<DaileyExpanse> Plotlist=new ArrayList<DaileyExpanse>();
       
         Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         String sql="select * from gunluk_gider ";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;//sorgunun sonucunda gelen listeler için
     
       resultSet=stmt.executeQuery();
        
        
        while(resultSet.next())//resultSet.next() bu değer olduğu sürece döner 
        {
           DaileyExpanse  x=new DaileyExpanse();
           
            x.setId(resultSet.getInt("id"));
            
           
            x.setDailyFoodExpanse(resultSet.getInt("gunluk_yiyecek_gideri"));
            x.setDailyMoneyExpanse(resultSet.getInt("gunluk_para_gideri"));
            x.setDailyGoodsExpanse(resultSet.getInt("gunluk_esya_gideri"));
            Plotlist.add(x);//nesneler listeye atılır
            
        }
        
        
        
        
        
        
        
        
        conn.commit();
        
        conn.close();
        
        
         
        
        
        
        
        return Plotlist;
    }
    
}
