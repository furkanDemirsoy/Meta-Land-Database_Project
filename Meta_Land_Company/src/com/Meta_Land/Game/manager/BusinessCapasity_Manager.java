/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.manager;

import com.Meta_Land.DatabaseUtilities.DatabaseUtilites;
import com.Meta_Land.Game.entity.BusinessCapasity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author izemd
 */
public class BusinessCapasity_Manager {
    
    
    public boolean insert(BusinessCapasity x) throws SQLException
    {
        
        Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        
        conn.setAutoCommit(false);
        
        
        PreparedStatement stmt;
        
        String sql="insert into isletme_kapasitesi(isletme_seviyesi,isletme_kapasitesi) values(?,?) "; 
        
        
        stmt=conn.prepareStatement(sql);
        
        
     stmt.setInt(1,x.getLevelBusinees());// X NESNESİNİN İD Sİ VE ADI VERİTABANINA KAYDEDİLİR
     
     stmt.setInt(2,x.getBusineesCapasity());
     
     
     
     
        
     
        
        
        int affected=stmt.executeUpdate();
        
        
        
        
         conn.commit();
        
        conn.close();
        return affected==1?true:false;
    }
    
    
   public BusinessCapasity find(int id) throws SQLException
   {
       BusinessCapasity x=null;
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        String sql="select * from isletme_kapasitesi where isletme_seviyesi=?";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;
        stmt.setInt(1,id);
      
       resultSet=stmt.executeQuery();//okuma yapmayı sağlayan şey
      
        
        
        if(resultSet.next())//resultSet.next() bu değer olduğu sürece döner 
        {
            x=new BusinessCapasity();
         
            x.setLevelBusinees(resultSet.getInt("isletme_seviyesi"));
          
            x.setBusineesCapasity(resultSet.getInt("isletme_kapasitesi"));
             
             
        }
        
        
        
        
         conn.commit();
        
        conn.close();
        
       return x;
   }
    
    
    
    public boolean update(BusinessCapasity x) throws SQLException
    {
        
        
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         
        
        
        
        
        PreparedStatement stmt;
      
        String sql="update isletme_kapasitesi set isletme_kapasitesi=? where isletme_seviyesi=?";
        stmt=conn.prepareStatement(sql);
        
       
        
       
       
        stmt.setInt(2,x.getLevelBusinees());
        stmt.setInt(1,x.getBusineesCapasity());
        
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
        
        String sql="delete from isletme_kapasitesi where isletme_seviyesi=?";
        stmt=conn.prepareStatement(sql);
        
        
        stmt.setInt(1,id);
      
        
        
    
        int affected=stmt.executeUpdate();
        
        
        
        
        
        
        
        
        
        
        
        
          
         conn.commit();
        
        conn.close();
        
        
        
        
        
        
        return affected==1?true:false;
    }
    
    
    public ArrayList<BusinessCapasity> list() throws SQLException
    {
        ArrayList<BusinessCapasity> Plotlist=new ArrayList<BusinessCapasity>();
       
         Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         String sql="select * from isletme_kapasitesi ";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;//sorgunun sonucunda gelen listeler için
     
       resultSet=stmt.executeQuery();
       
        
        
        while(resultSet.next())//resultSet.next() bu değer olduğu sürece döner 
        {
          BusinessCapasity  x=new BusinessCapasity();
         
            x.setLevelBusinees(resultSet.getInt("isletme_seviyesi"));
            
            x.setBusineesCapasity(resultSet.getInt("isletme_kapasitesi"));
            
           
            Plotlist.add(x);//nesneler listeye atılır
            
        }
        
        
        
        
        
        
        
        
        conn.commit();
        
        conn.close();
        
        
         
        
        
        
        
        return Plotlist;
    }
    
}
