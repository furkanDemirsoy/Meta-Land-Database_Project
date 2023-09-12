/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.GUI;

import com.Meta_Land.Game.entity.BusinessIncomeInfo;
import com.Meta_Land.Game.entity.DaileyExpanse;
import com.Meta_Land.Game.entity.Plot;
import com.Meta_Land.Game.entity.PlotSize;
import com.Meta_Land.Game.entity.User;
import com.Meta_Land.Game.entity.UserGameInformation;
import com.Meta_Land.Game.entity.UserGameStartingGameInfo;
import com.Meta_Land.Game.entity.UserWorkingPlace;
import com.Meta_Land.Game.entity.login;
import com.Meta_Land.Game.manager.BusinessIncomeInfo_Manager;
import com.Meta_Land.Game.manager.DaileyExpanse_Manager;
import com.Meta_Land.Game.manager.PlotSize_Manager;
import com.Meta_Land.Game.manager.Plot_Manager;
import com.Meta_Land.Game.manager.UserGameInformation_Manager;
import com.Meta_Land.Game.manager.UserGameStartingGameInfo_Manager;
import com.Meta_Land.Game.manager.UserWorkingPlace_Manager;
import com.Meta_Land.Game.manager.User_Manager;
import com.Meta_Land.Game.manager.login_Manager;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.io.IOException;
import static java.lang.Math.abs;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author izemd
 */
public class MAİN extends JFrame{
    ImageIcon icon2=new ImageIcon("C:\\Users\\izemd\\OneDrive\\Masaüstü\\Downloads\\pixel-minecraft-style-land-background-3671571.jpg");
    ImageIcon icon3=new ImageIcon("C:\\Users\\izemd\\OneDrive\\Masaüstü\\Downloads\\indir (5).jpg");
     public MAİN()
    {
        setSize(1000,900);
      
        ER_diagram er=new ER_diagram();
        
    add(er);

    }
    public static void main(String[] args) throws MalformedURLException, SQLException, IOException, ClassNotFoundException
    {
        
        try {
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MAİN.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
      GUI guı=new GUI();
        
      User x=new User();
    
      User_Manager m=new User_Manager();
        
      
      LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String currentDateAsString = currentDate.format(formatter);
      //  System.out.println("Güncel tarih: " + currentDateAsString);
      
      char[] charArray = currentDateAsString.toCharArray();
        
        System.out.println("Güncel tarih karakter dizisi:");
        for (char c : charArray) {
           
            System.out.print(c);
        }
      
        UserGameStartingGameInfo startınfo=new UserGameStartingGameInfo();
     UserGameStartingGameInfo_Manager startınfoManager=new UserGameStartingGameInfo_Manager();
        
     DaileyExpanse mn=new DaileyExpanse();
     DaileyExpanse_Manager bn=new DaileyExpanse_Manager();
        
       
       
        
        
    
        
    
   
    
    }
    
    
    
}
