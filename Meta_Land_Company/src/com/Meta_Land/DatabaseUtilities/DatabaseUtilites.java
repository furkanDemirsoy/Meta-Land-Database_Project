/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.DatabaseUtilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author izemd
 */
public class DatabaseUtilites {
     public static String url="jdbc:postgresql://localhost:5432/Meta_Land";//her nesne oluşturulduğunda tekrar oluşmazlar sadece 1 kere oluşurlar
    public static String user="postgres";
    public static String password="123456";
    
    public static Connection getConnection() throws SQLException
    {
        Connection conn=null;
        conn= DriverManager.getConnection(url,user,password);
        
        return conn;
    }
}
