/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.manager;

import com.Meta_Land.DatabaseUtilities.DatabaseUtilites;
import com.Meta_Land.Game.entity.UserWorkingPlace;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author izemd
 */
public class UserWorkingPlace_Manager {
    
    
    
      public boolean insert(UserWorkingPlace x) throws SQLException
    {
        
        Connection conn=null;
        conn= DatabaseUtilites.getConnection();
        
        conn.setAutoCommit(false);
        
        
        PreparedStatement stmt;
        
        String sql="insert into kullanici_calisma_yeri(kullanici_no,alan_no) values(?,?) "; 
        
        
        stmt=conn.prepareStatement(sql);
        
        
     stmt.setInt(1,x.getUserNo());
     
     stmt.setInt(2,x.getPlotNo());
     
     
        
     
        
        
        int affected=stmt.executeUpdate();
        
        
        
        
         conn.commit();
        
        conn.close();
        return affected==1?true:false;
    }
    
    
   public UserWorkingPlace find(int id) throws SQLException
   {
       UserWorkingPlace x=null;
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        String sql="select * from kullanici_calisma_yeri where kullanici_no=?";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;
        stmt.setInt(1,id);
      
       resultSet=stmt.executeQuery();//okuma yapmayı sağlayan şey
      
        
        
        if(resultSet.next())//resultSet.next() bu değer olduğu sürece döner 
        {
            x=new UserWorkingPlace();
            x.setPlotNo(resultSet.getInt("alan_no"));
            x.setUserNo(resultSet.getInt("kullanici_no"));
            
        }
        
        
        
        
         conn.commit();
        
        conn.close();
        
       return x;
   }
    
    
    
    public boolean update(UserWorkingPlace x) throws SQLException
    {
        
        
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         
        
        
        
        
        PreparedStatement stmt;
       
        String sql="update kullanici_calisma_yeri set alan_no=? where kullanici_no=?";
        stmt=conn.prepareStatement(sql);
        
       
        stmt.setInt(2, x.getUserNo());
        stmt.setInt(1,x.getPlotNo());//BURADA İSİM GÜNCELLENİR
        
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
        
        String sql="delete from kullanici_calisma_yeri where  kullanici_no=?";
        stmt=conn.prepareStatement(sql);
        
      
        stmt.setInt(1,id);
       // stmt.setString(1,"12");
        
        
    
        int affected=stmt.executeUpdate();
        
        
        
        
        
        
        
        
        
        
        
        
          
         conn.commit();
        
        conn.close();
        
        
        
        
        
        
        return affected==1?true:false;
    }
    
    
    public ArrayList<UserWorkingPlace> list() throws SQLException
    {
        ArrayList<UserWorkingPlace> Userilist=new ArrayList<UserWorkingPlace>();
       
         Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         String sql="select * from kullanici_calisma_yeri ";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;//sorgunun sonucunda gelen listeler için
     
       resultSet=stmt.executeQuery();//okuma yapmayı sağlayan şey
       
        
        
        while(resultSet.next())//resultSet.next() bu değer olduğu sürece döner 
        {
           UserWorkingPlace  x=new UserWorkingPlace();
            x.setPlotNo(resultSet.getInt("alan_no"));
            x.setUserNo(resultSet.getInt("kullanici_no"));
            
            Userilist.add(x);//nesneler listeye atılır
            
        }
        
        
        
        
        
        
        
        
        conn.commit();
        
        conn.close();
        
        
         
        
        
        
        
        return Userilist;
    }
    
}
