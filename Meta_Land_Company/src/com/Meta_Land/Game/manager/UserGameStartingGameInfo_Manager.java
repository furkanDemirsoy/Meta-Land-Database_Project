/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.manager;

import com.Meta_Land.DatabaseUtilities.DatabaseUtilites;
import com.Meta_Land.Game.entity.UserGameStartingGameInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author izemd
 */
public class UserGameStartingGameInfo_Manager {
    
     public boolean insert(UserGameStartingGameInfo x) throws SQLException
    {
        
        Connection conn=null;
        conn= DatabaseUtilites.getConnection();
        
        conn.setAutoCommit(false);
        
        
        PreparedStatement stmt;
        
        String sql="insert into kullanici_baslangic_oyun_bilgileri(kullanici_no,baslangic_yemek_miktari,baslangic_esya_miktari,baslangic_para_miktari,oyun_baslangic_tarihi) values(?,?,?,?,?) "; 
        
        
        stmt=conn.prepareStatement(sql);
        
        
     stmt.setInt(1,x.getUserNo());
     
     stmt.setInt(2,x.getStartingfUserFood());
     
     
     stmt.setInt(3,x.getStartingfUserGoods());
     stmt.setInt(4,x.getStartingfUserMoney());
     stmt.setString(5,x.getStartingGameDate());
     
        
     
        
        
        int affected=stmt.executeUpdate();
        
        
        
        
         conn.commit();
        
        conn.close();
        return affected==1?true:false;
    }
    
    
   public UserGameStartingGameInfo find(int id) throws SQLException
   {
       UserGameStartingGameInfo x=null;
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        String sql="select * from kullanici_baslangic_oyun_bilgileri where kullanici_no=?";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;
        stmt.setInt(1,id);
      
       resultSet=stmt.executeQuery();//okuma yapmayı sağlayan şey
      
        
        
        if(resultSet.next())//resultSet.next() bu değer olduğu sürece döner 
        {
            x=new UserGameStartingGameInfo();
            x.setStartingGameDate(resultSet.getString("oyun_baslangic_tarihi"));
            x.setUserNo(resultSet.getInt("kullanici_no"));
          
            x.setStartingfUserFood(resultSet.getInt("baslangic_yemek_miktari"));
             x.setStartingfUserGoods(resultSet.getInt("baslangic_esya_miktari"));
             x.setStartingfUserMoney(resultSet.getInt("baslangic_para_miktari"));
             
        }
        
        
        
        
         conn.commit();
        
        conn.close();
        
       return x;
   }
    
    
    
    public boolean update(UserGameStartingGameInfo x) throws SQLException
    {
        
        
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         
        
        
        
        
        PreparedStatement stmt;
        
        String sql="update kullanici_baslangic_oyun_bilgileri set baslangic_yemek_miktari=?,baslangic_esya_miktari=?,baslangic_para_miktari=?,oyun_baslangic_tarihi=? where kullanici_no=?";//aynı id ile kayıt ekleyemezsin bu yüzden burdaki 1. yi yani id yi sürekli değiştir
        stmt=conn.prepareStatement(sql);
        
     
        
        stmt.setString(4,x.getStartingGameDate());
        stmt.setInt(5,x.getUserNo());
        stmt.setInt(3,x.getStartingfUserMoney());
        stmt.setInt(2,x.getStartingfUserGoods());
        stmt.setInt(1,x.getStartingfUserFood());
        
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
        
        String sql="delete from kullanici_baslangic_oyun_bilgileri where kullanici_no=?";
        stmt=conn.prepareStatement(sql);
        
      
        stmt.setInt(1,id);
       // stmt.setString(1,"12");
        
        
    
        int affected=stmt.executeUpdate();
        
        
        
        
        
        
        
        
        
        
        
        
          
         conn.commit();
        
        conn.close();
        
        
        
        
        
        
        return affected==1?true:false;
    }
    
    
    public ArrayList<UserGameStartingGameInfo> list() throws SQLException
    {
        ArrayList<UserGameStartingGameInfo> Plotlist=new ArrayList<UserGameStartingGameInfo>();
       
         Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         String sql="select * from kullanici_baslangic_oyun_bilgileri ";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;//sorgunun sonucunda gelen listeler için
     
       resultSet=stmt.executeQuery();//okuma yapmayı sağlayan şey
      
        
        
        while(resultSet.next())//resultSet.next() bu değer olduğu sürece döner 
        {
           UserGameStartingGameInfo  x=new UserGameStartingGameInfo();
            x.setStartingGameDate(resultSet.getString("oyun_baslangic_tarihi"));
            x.setUserNo(resultSet.getInt("kullanici_no"));
            
            x.setStartingfUserFood(resultSet.getInt("baslangic_yemek_miktari"));
            x.setStartingfUserGoods(resultSet.getInt("baslangic_esya_miktari"));
            x.setStartingfUserMoney(resultSet.getInt("baslangic_para_miktari"));
           
            Plotlist.add(x);//nesneler listeye atılır
            
        }
        
        
        
        
        
        
        
        
        conn.commit();
        
        conn.close();
        
        
         
        
        
        
        
        return Plotlist;
    }
    
}
