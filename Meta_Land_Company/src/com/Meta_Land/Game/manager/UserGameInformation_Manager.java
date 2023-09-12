/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.manager;

import com.Meta_Land.DatabaseUtilities.DatabaseUtilites;
import com.Meta_Land.Game.entity.UserGameInformation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author izemd
 */
public class UserGameInformation_Manager {
    
     public boolean insert(UserGameInformation x) throws SQLException
    {
        
        Connection conn=null;
        conn= DatabaseUtilites.getConnection();
        
        conn.setAutoCommit(false);
        
        
        PreparedStatement stmt;
        
        String sql="insert into kullanici_oyun_bilgileri_tablosu(kullanici_no,kullanici_yemek_miktari,kullanici_esya_miktari,kullanici_para_miktari) values(?,?,?,?) "; 
        
        
        stmt=conn.prepareStatement(sql);
        
        
     stmt.setInt(1,x.getUserNo());
     
     stmt.setInt(2,x.getAmountofUserFood());
     
     
     stmt.setInt(3,x.getAmountofUserGoods());
     stmt.setInt(4,x.getAmountofUserMoney());
     
     
        
     
        
        
        int affected=stmt.executeUpdate();
        
        
        
        
         conn.commit();
        
        conn.close();
        return affected==1?true:false;
    }
    
    
   public UserGameInformation find(int id) throws SQLException
   {
       UserGameInformation x=null;
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        String sql="select * from kullanici_oyun_bilgileri_tablosu where kullanici_no=?";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;
        stmt.setInt(1,id);
      
       resultSet=stmt.executeQuery();//okuma yapmayı sağlayan şey
      
        
        
        if(resultSet.next())//resultSet.next() bu değer olduğu sürece döner 
        {
            x=new UserGameInformation();
         
            x.setUserNo(resultSet.getInt("kullanici_no"));
          
            x.setAmountofUserFood(resultSet.getInt("kullanici_yemek_miktari"));
             x.setAmountofUserGoods(resultSet.getInt("kullanici_esya_miktari"));
             x.setAmountofUserMoney(resultSet.getInt("kullanici_para_miktari"));
             
        }
        
        
        
        
         conn.commit();
        
        conn.close();
        
       return x;
   }
    
    
    
    public boolean update(UserGameInformation x) throws SQLException
    {
        
        
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         
        
        
        
        
        PreparedStatement stmt;
       
        String sql="update kullanici_oyun_bilgileri_tablosu set kullanici_yemek_miktari=?,kullanici_esya_miktari=?,kullanici_para_miktari=? where kullanici_no=?";//aynı id ile kayıt ekleyemezsin bu yüzden burdaki 1. yi yani id yi sürekli değiştir
        stmt=conn.prepareStatement(sql);
        
       
        
       
        stmt.setInt(4,x.getUserNo());
        stmt.setInt(3,x.getAmountofUserMoney());
        stmt.setInt(2,x.getAmountofUserGoods());
        stmt.setInt(1,x.getAmountofUserFood());
        
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
        
        String sql="delete from kullanici_oyun_bilgileri_tablosu where kullanici_no=?";
        stmt=conn.prepareStatement(sql);
        
       
        stmt.setInt(1,id);
       // stmt.setString(1,"12");
        
        
    
        int affected=stmt.executeUpdate();
        
        
        
        
        
        
        
        
        
        
        
        
          
         conn.commit();
        
        conn.close();
        
        
        
        
        
        
        return affected==1?true:false;
    }
    
    
    public ArrayList<UserGameInformation> list() throws SQLException
    {
        ArrayList<UserGameInformation> Plotlist=new ArrayList<UserGameInformation>();
       
         Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         String sql="select * from kullanici_oyun_bilgileri_tablosu ";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;//sorgunun sonucunda gelen listeler için
     
       resultSet=stmt.executeQuery();//okuma yapmayı sağlayan şey
      
        
        
        while(resultSet.next())
        {
           UserGameInformation  x=new UserGameInformation();
         
            x.setUserNo(resultSet.getInt("kullanici_no"));
            
            x.setAmountofUserFood(resultSet.getInt("kullanici_yemek_miktari"));
            x.setAmountofUserGoods(resultSet.getInt("kullanici_esya_miktari"));
            x.setAmountofUserMoney(resultSet.getInt("kullanici_para_miktari"));
           
            Plotlist.add(x);//nesneler listeye atılır
            
        }
        
        
        
        
        
        
        
        
        conn.commit();
        
        conn.close();
        
        
         
        
        
        
        
        return Plotlist;
    }
    
}
