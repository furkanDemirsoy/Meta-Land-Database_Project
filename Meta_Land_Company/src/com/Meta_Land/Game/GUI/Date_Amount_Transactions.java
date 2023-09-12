/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.GUI;

import com.Meta_Land.Game.entity.login;
import com.Meta_Land.Game.manager.login_Manager;
import static java.lang.Math.abs;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


/**
 *
 * @author izemd
 */
public class Date_Amount_Transactions {
  private login log=new login();
    private login_Manager managerLog=new login_Manager();
    
    
   public long SubstractionDate(int id) throws SQLException
   {
       try
       {
           
       
        
     String str=   managerLog.find(id).getLastLoginDate();
     
     
     
     
     
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
       
        
        int day=Integer.parseInt(String.valueOf(ch[1]))+10*Integer.parseInt(String.valueOf(ch[0])); 
        int mounth=Integer.parseInt(String.valueOf(ch[4]))+(10*Integer.parseInt(String.valueOf(ch[3])));
        int year=Integer.parseInt(String.valueOf(ch[9]))+(1000*Integer.parseInt(String.valueOf(ch[6])))+(100*Integer.parseInt(String.valueOf(ch[7])))+(10*Integer.parseInt(String.valueOf(ch[8])));
              
       LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String currentDateAsString = currentDate.format(formatter);
        
        
        
         char[] ch2 = new char[currentDateAsString.length()];
        for (int i = 0; i < currentDateAsString.length(); i++) {
            ch2[i] = currentDateAsString.charAt(i);
        }
        
        
        
         int daynow= Integer.parseInt(String.valueOf(ch2[1]))+10*Integer.parseInt(String.valueOf(ch2[0])); 
        int mounthnow=Integer.parseInt(String.valueOf(ch2[4]))+(10*Integer.parseInt(String.valueOf(ch2[3])));
        int yearnow=Integer.parseInt(String.valueOf(ch2[9]))+(1000*Integer.parseInt(String.valueOf(ch2[6])))+(100*Integer.parseInt(String.valueOf(ch2[7])))+(10*Integer.parseInt(String.valueOf(ch2[8])));
              
        
        System.out.println("-----------");
        System.out.println(day);
        System.out.println(year);
        System.out.println(mounth);
        
        
        
        LocalDate startDate = LocalDate.of(year, mounth, day);
        LocalDate endDate = LocalDate.of(yearnow,mounthnow,daynow);
        
        
        long daysBetween = getDaysBetween(startDate, endDate);
        
        System.out.println("Verilen tarihler arasında geçen gün sayısı: " + daysBetween);
        daysBetween=abs(daysBetween);
        return daysBetween;
       }
       catch(java.lang.NullPointerException ex)
       {
           System.out.println("bulunamadi");
       }
       return 0;
       
   }
   
   public static long getDaysBetween(LocalDate startDate, LocalDate endDate) {
        return ChronoUnit.DAYS.between(startDate, endDate);
    }
   
   
   public long SubstractionDateSpeed(String str) throws SQLException//SON LOGİN YAPILAN TARİHLE ARASINDAKİ FARKA BAKAR
   {//TARİHİ GİR DİREKT
       
        
    
     
     
     
     
     
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
       
        
        int day=Integer.parseInt(String.valueOf(ch[1]))+10*Integer.parseInt(String.valueOf(ch[0])); 
        int mounth=Integer.parseInt(String.valueOf(ch[4]))+(10*Integer.parseInt(String.valueOf(ch[3])));
        int year=Integer.parseInt(String.valueOf(ch[9]))+(1000*Integer.parseInt(String.valueOf(ch[6])))+(100*Integer.parseInt(String.valueOf(ch[7])))+(10*Integer.parseInt(String.valueOf(ch[8])));
              
       LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String currentDateAsString = currentDate.format(formatter);
        
        
        
         char[] ch2 = new char[currentDateAsString.length()];
        for (int i = 0; i < currentDateAsString.length(); i++) {
            ch2[i] = currentDateAsString.charAt(i);
        }
        
        
        
         int daynow= Integer.parseInt(String.valueOf(ch2[1]))+10*Integer.parseInt(String.valueOf(ch2[0])); 
        int mounthnow=Integer.parseInt(String.valueOf(ch2[4]))+(10*Integer.parseInt(String.valueOf(ch2[3])));
        int yearnow=Integer.parseInt(String.valueOf(ch2[9]))+(1000*Integer.parseInt(String.valueOf(ch2[6])))+(100*Integer.parseInt(String.valueOf(ch2[7])))+(10*Integer.parseInt(String.valueOf(ch2[8])));
              
        
        System.out.println("-----------");
        System.out.println(day);
        System.out.println(year);
        System.out.println(mounth);
        
        
        
        LocalDate startDate = LocalDate.of(year, mounth, day);
        LocalDate endDate = LocalDate.of(yearnow,mounthnow,daynow);
        
        
        long daysBetween = getDaysBetween(startDate, endDate);
        
        System.out.println("Verilen tarihler arasında geçen gün sayısı: " + daysBetween);
        daysBetween=abs(daysBetween);
        return daysBetween;
   }
}
