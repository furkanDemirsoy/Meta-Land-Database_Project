/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.manager;

import com.Meta_Land.DatabaseUtilities.DatabaseUtilites;
import com.Meta_Land.Game.entity.BusinessIncomeInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author izemd
 */
public class BusinessIncomeInfo_Manager {
    
    
    public boolean insert(BusinessIncomeInfo x) throws SQLException
    {
        
        Connection conn=null;
        conn= DatabaseUtilites.getConnection();
        
        conn.setAutoCommit(false);
        
        
        PreparedStatement stmt;
        
        String sql="insert into isletme_gelir_bilgileri_tablosu(alan_no,isletme_sabit_gelir_miktari,isletme_sabit_gelir_orani,market_yiyecek_ucreti,magaza_esya_ucreti) values(?,?,?,?,?) "; 
        
        
        stmt=conn.prepareStatement(sql);
        
        
     stmt.setInt(1,x.getPlotNo());
     
     stmt.setInt(2,x.getBusinessFixedIncomeAmount());
     
     
     stmt.setInt(3,x.getBusinessFixedIncomeRate());
     stmt.setInt(4,x.getMarketFoodPrice());
     stmt.setInt(5,x.getClothingGoodPrice());
     
        
     
        
        
        int affected=stmt.executeUpdate();
        
        
        
        
         conn.commit();
        
        conn.close();
        return affected==1?true:false;
    }
    
    
   public BusinessIncomeInfo find(int id) throws SQLException
   {
       BusinessIncomeInfo x=null;
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        String sql="select * from isletme_gelir_bilgileri_tablosu where alan_no=?";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;
        stmt.setInt(1,id);
      
       resultSet=stmt.executeQuery();//okuma yapmayı sağlayan şey
      
        
        
        if(resultSet.next())//resultSet.next() bu değer olduğu sürece döner 
        {
            x=new BusinessIncomeInfo();
         
            x.setPlotNo(resultSet.getInt("alan_no"));
          
            x.setBusinessFixedIncomeAmount(resultSet.getInt("isletme_sabit_gelir_miktari"));
             x.setBusinessFixedIncomeRate(resultSet.getInt("isletme_sabit_gelir_orani"));
             x.setMarketFoodPrice(resultSet.getInt("market_yiyecek_ucreti"));
             x.setClothingGoodPrice(resultSet.getInt("magaza_esya_ucreti"));
             
        }
        
        
        
        
         conn.commit();
        
        conn.close();
        
       return x;
   }
    
    
    
    public boolean update(BusinessIncomeInfo x) throws SQLException
    {
        
        
       Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         
        
        
        
        
        PreparedStatement stmt;
      
        String sql="update isletme_gelir_bilgileri_tablosu set isletme_sabit_gelir_miktari=?,isletme_sabit_gelir_orani=?,market_yiyecek_ucreti=?,magaza_esya_ucreti=? where alan_no=?";//aynı id ile kayıt ekleyemezsin bu yüzden burdaki 1. yi yani id yi sürekli değiştir
        stmt=conn.prepareStatement(sql);
        
        
        
       
        stmt.setInt(5,x.getPlotNo());
        stmt.setInt(4,x.getClothingGoodPrice());
        stmt.setInt(3,x.getMarketFoodPrice());
        stmt.setInt(2,x.getBusinessFixedIncomeRate());
        stmt.setInt(1,x.getBusinessFixedIncomeAmount());
        
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
        
        String sql="delete from isletme_gelir_bilgileri_tablosu where alan_no=?";
        stmt=conn.prepareStatement(sql);
        
        
        stmt.setInt(1,id);
       // stmt.setString(1,"12");
        
        
    
        int affected=stmt.executeUpdate();
        
        
        
        
        
        
        
        
        
        
        
        
          
         conn.commit();
        
        conn.close();
        
        
        
        
        
        
        return affected==1?true:false;
    }
    
    
    public ArrayList<BusinessIncomeInfo> list() throws SQLException
    {
        ArrayList<BusinessIncomeInfo> Plotlist=new ArrayList<BusinessIncomeInfo>();
       
         Connection conn=null;
        conn= DatabaseUtilites.getConnection();
       
        conn.setAutoCommit(false);
        
        
        
         String sql="select * from isletme_gelir_bilgileri_tablosu ";
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet resultSet;//sorgunun sonucunda gelen listeler için
     
       resultSet=stmt.executeQuery();//okuma yapmayı sağlayan şey
       
        
        
        while(resultSet.next())//resultSet.next() bu değer olduğu sürece döner 
        {
           BusinessIncomeInfo  x=new BusinessIncomeInfo();
         
            x.setPlotNo(resultSet.getInt("alan_no"));
            
            x.setBusinessFixedIncomeAmount(resultSet.getInt("isletme_sabit_gelir_miktari"));
            x.setBusinessFixedIncomeRate(resultSet.getInt("isletme_sabit_gelir_orani"));
            x.setMarketFoodPrice(resultSet.getInt("market_yiyecek_ucreti"));
            x.setClothingGoodPrice(resultSet.getInt("magaza_esya_ucreti"));
           
            Plotlist.add(x);//nesneler listeye atılır
            
        }
        
        
        
        
        
        
        
        
        conn.commit();
        
        conn.close();
        
        
         
        
        
        
        
        return Plotlist;
    }
    
}
