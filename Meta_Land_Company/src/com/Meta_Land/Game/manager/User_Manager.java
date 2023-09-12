/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.manager;

import com.Meta_Land.DatabaseUtilities.DatabaseUtilites;
import com.Meta_Land.Game.entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author izemd
 */
public class User_Manager {
     public boolean insert(User x) throws SQLException
    {
        
        Connection conn=null;
        conn= DatabaseUtilites.getConnection();
        
        conn.setAutoCommit(false);
        
        
        PreparedStatement stmt;
        
        String sql="insert into kullanici_tablosu(kullanicino,kullaniciadi,kullanicisoyadi,kullanicisifresi) values(?,?,?,?) "; 
        
        
        stmt=conn.prepareStatement(sql);
        
        
     stmt.setInt(1,x.getUserNo());
     
     stmt.setString(2,x.getUserName());
     
     stmt.setString(3,x.getUserSurname());
     stmt.setString(4,x.getUserPassword());
        
     
        
        
        int affected=stmt.executeUpdate();
        
        
        
        
         conn.commit();
        
        conn.close();
        return affected==1?true:false;
    }
    
    
   public User find(int id) throws SQLException
   {
       User x=null;
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        String sql="select * from kullanici_tablosu where kullanicino=?";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;
        stmt.setInt(1,id);
      
       resultSet=stmt.executeQuery();//okuma yapmayı sağlayan şey
      
        
        
        if(resultSet.next())//resultSet.next() bu değer olduğu sürece döner 
        {
            x=new User();
            x.setUserName(resultSet.getString("kullaniciadi"));
            x.setUserNo(resultSet.getInt("kullanicino"));
            x.setUserSurname(resultSet.getString("kullanicisoyadi"));
            x.setUserPassword(resultSet.getString("kullanicisifresi"));
        }
        
        
        
        
         conn.commit();
        
        conn.close();
        
       return x;
   }
    
    
    
    public boolean update(User x) throws SQLException
    {
        
        
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         
        
        
        
        
        PreparedStatement stmt;
       
        String sql="update kullanici_tablosu set kullaniciadi=?,kullanicisoyadi=?,kullanicisifresi=? where kullanicino=?";
        stmt=conn.prepareStatement(sql);
        
      
        stmt.setInt(4, x.getUserNo());
        stmt.setString(1,x.getUserName());//BURADA İSİM GÜNCELLENİR
        stmt.setString(2,x.getUserSurname());
        stmt.setString(3,x.getUserPassword());
        
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
        
        String sql="delete from kullanici_tablosu where  kullanicino=?";
        stmt=conn.prepareStatement(sql);
        
       
        stmt.setInt(1,id);
       // stmt.setString(1,"12");
        
        
    
        int affected=stmt.executeUpdate();
        
        
        
        
        
        
        
        
        
        
        
        
          
         conn.commit();
        
        conn.close();
        
        
        
        
        
        
        return affected==1?true:false;
    }
    
    
    public ArrayList<User> list() throws SQLException
    {
        ArrayList<User> Userilist=new ArrayList<User>();
       
         Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         String sql="select * from kullanici_tablosu ";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;//sorgunun sonucunda gelen listeler için
     
       resultSet=stmt.executeQuery();//okuma yapmayı sağlayan şey
      
        
        
        while(resultSet.next())//resultSet.next() bu değer olduğu sürece döner 
        {
           User  x=new User();
            x.setUserName(resultSet.getString("kullaniciadi"));
            x.setUserNo(resultSet.getInt("kullanicino"));
            x.setUserSurname(resultSet.getString("kullanicisoyadi"));
            x.setUserPassword(resultSet.getString("kullanicisifresi"));
            Userilist.add(x);//nesneler listeye atılır
            
        }
        
        
        
        
        
        
        
        
        conn.commit();
        
        conn.close();
        
        
         
        
        
        
        
        return Userilist;
    }
    
    
}
