/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.manager;

import com.Meta_Land.DatabaseUtilities.DatabaseUtilites;
import com.Meta_Land.Game.entity.EstateTransactions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author izemd
 */
public class EstateTransactions_Manager {
    
      public boolean insert(EstateTransactions x) throws SQLException
    {
        
        Connection conn=null;
        conn= DatabaseUtilites.getConnection();
        
        conn.setAutoCommit(false);
        
        
        PreparedStatement stmt;
        
        String sql="insert into emlak_islemleri_tablosu(alan_no,emlak_komisyonu,emlak_islemi) values(?,?,?) "; 
        
        
        stmt=conn.prepareStatement(sql);
        
        
     stmt.setInt(1,x.getPlotNo());
     
     stmt.setInt(2,x.getEstateCommission());
     stmt.setString(3,x.getEstateOperationType());
     
     
        
     
        
        
        int affected=stmt.executeUpdate();
        
        
        
        
         conn.commit();
        
        conn.close();
        return affected==1?true:false;
    }
    
    
   public EstateTransactions find(int id) throws SQLException
   {
       EstateTransactions x=null;
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        String sql="select * from emlak_islemleri_tablosu where alan_no=?";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;
        stmt.setInt(1,id);
      
       resultSet=stmt.executeQuery();//okuma yapmayı sağlayan şey
      
        
        
        if(resultSet.next())//resultSet.next() bu değer olduğu sürece döner 
        {
            x=new EstateTransactions();
            x.setEstateOperationType(resultSet.getString("emlak_islemi"));
            x.setPlotNo(resultSet.getInt("alan_no"));
            x.setEstateCommission(resultSet.getInt("emlak_komisyonu"));
            
        }
        
        
        
        
         conn.commit();
        
        conn.close();
        
       return x;
   }
    
    
    
    public boolean update(EstateTransactions x) throws SQLException
    {
        
        
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         
        
        
        
        
        PreparedStatement stmt;
       
        String sql="update emlak_islemleri_tablosu set emlak_islemi=?,emlak_komisyonu=? where alan_no=?";
        stmt=conn.prepareStatement(sql);
        
        
        stmt.setInt(2, x.getEstateCommission());
        stmt.setInt(3, x.getPlotNo());
        stmt.setString(1,x.getEstateOperationType());//BURADA İSİM GÜNCELLENİR
        
        
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
        
        String sql="delete from emlak_islemleri_tablosu where alan_no=?";
        stmt=conn.prepareStatement(sql);
        
       
        stmt.setInt(1,id);
       // stmt.setString(1,"12");
        
        
    
        int affected=stmt.executeUpdate();
        
        
        
        
        
        
        
        
        
        
        
        
          
         conn.commit();
        
        conn.close();
        
        
        
        
        
        
        return affected==1?true:false;
    }
    
    
    public ArrayList<EstateTransactions> list() throws SQLException
    {
        ArrayList<EstateTransactions> Plotlist=new ArrayList<EstateTransactions>();
       
         Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         String sql="select * from emlak_islemleri_tablosu ";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;//sorgunun sonucunda gelen listeler için
     
       resultSet=stmt.executeQuery();//okuma yapmayı sağlayan şey
       
        
        
        while(resultSet.next())//resultSet.next() bu değer olduğu sürece döner 
        {
           EstateTransactions x=new EstateTransactions();
            x.setEstateOperationType(resultSet.getString("emlak_islemi"));
            x.setPlotNo(resultSet.getInt("alan_no"));
             x.setEstateCommission(resultSet.getInt("emlak_komisyonu"));
           
            Plotlist.add(x);//nesneler listeye atılır
            
        }
        
        
        
        
        
        
        
        
        conn.commit();
        
        conn.close();
        
        
         
        
        
        
        
        return Plotlist;
    }
    
}
