/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.manager;

import com.Meta_Land.DatabaseUtilities.DatabaseUtilites;
import com.Meta_Land.Game.entity.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author izemd
 */
public class login_Manager {
    
    
    
      public boolean insert(login x) throws SQLException
    {
        
        Connection conn=null;
        conn= DatabaseUtilites.getConnection();
        
        conn.setAutoCommit(false);
        
        
        PreparedStatement stmt;
        
        String sql="insert into login_tablosu(kullanici_no,son_login_tarihi) values(?,?) "; 
        
        
        stmt=conn.prepareStatement(sql);
        
        
     stmt.setInt(1,x.getUserNo());
     
     stmt.setString(2,x.getLastLoginDate());
     
     
        
     
        
        
        int affected=stmt.executeUpdate();
        
        
        
        
         conn.commit();
        
        conn.close();
        return affected==1?true:false;
    }
    
    
   public login find(int id) throws SQLException
   {
       login x=null;
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        String sql="select * from login_tablosu where kullanici_no=?";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;
        stmt.setInt(1,id);
      
       resultSet=stmt.executeQuery();
      
        
        
        if(resultSet.next())
        {
            x=new login();
            x.setLastLoginDate(resultSet.getString("son_login_tarihi"));
            x.setUserNo(resultSet.getInt("kullanici_no"));
            
        }
        
        
        
        
         conn.commit();
        
        conn.close();
        
       return x;
   }
    
    
    
    public boolean update(login x) throws SQLException
    {
        
        
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         
        
        
        
        
        PreparedStatement stmt;
        
        String sql="update login_tablosu set son_login_tarihi=? where kullanici_no=?";
        stmt=conn.prepareStatement(sql);
        
      
        stmt.setInt(2, x.getUserNo());
        stmt.setString(1,x.getLastLoginDate());
        
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
        
        String sql="delete from login_tablosu where  kullanici_no=?";
        stmt=conn.prepareStatement(sql);
        
      
        stmt.setInt(1,id);
       // stmt.setString(1,"12");
        
        
    
        int affected=stmt.executeUpdate();
        
        
        
        
        
        
        
        
        
        
        
        
          
         conn.commit();
        
        conn.close();
        
        
        
        
        
        
        return affected==1?true:false;
    }
    
    
    public ArrayList<login> list() throws SQLException
    {
        ArrayList<login> Userilist=new ArrayList<login>();
       
         Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         String sql="select * from login_tablosu ";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;//sorgunun sonucunda gelen listeler için
     
       resultSet=stmt.executeQuery();//okuma yapmayı sağlayan şey
     
        
        
        while(resultSet.next())//resultSet.next() bu değer olduğu sürece döner 
        {
           login  x=new login();
            x.setLastLoginDate(resultSet.getString("son_login_tarihi"));
            x.setUserNo(resultSet.getInt("kullanici_no"));
            
            Userilist.add(x);//nesneler listeye atılır
            
        }
        
        
        
        
        
        
        
        
        conn.commit();
        
        conn.close();
        
        
         
        
        
        
        
        return Userilist;
    }
    
}
