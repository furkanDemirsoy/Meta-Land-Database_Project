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
import com.Meta_Land.Game.entity.login;
import com.Meta_Land.Game.manager.BusinessIncomeInfo_Manager;
import com.Meta_Land.Game.manager.DaileyExpanse_Manager;
import com.Meta_Land.Game.manager.PlotSize_Manager;
import com.Meta_Land.Game.manager.Plot_Manager;
import com.Meta_Land.Game.manager.UserGameInformation_Manager;
import com.Meta_Land.Game.manager.UserGameStartingGameInfo_Manager;
import com.Meta_Land.Game.manager.User_Manager;
import com.Meta_Land.Game.manager.login_Manager;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author izemd
 */
public class AuthorizedGUI {
    
    private JFrame frame=new JFrame();
    private JButton SizeButton=new JButton("Set Plot Size");
    private Container c=frame.getContentPane();
     private  Font font3 =new Font("Arial",Font.ITALIC,20);
     private JButton DaileyExpanse=new JButton("Set Dailey Expanse");
     private JButton StartingAmount=new JButton("Set Starting Amounts");
     private PlotSize plotsize=new PlotSize();
     private PlotSize_Manager managerPlotsize=new PlotSize_Manager();
     private UserGameStartingGameInfo startınfo=new UserGameStartingGameInfo();
    private UserGameStartingGameInfo_Manager startınfoManager=new UserGameStartingGameInfo_Manager();       
   private DaileyExpanse dailey=new DaileyExpanse();
    private DaileyExpanse_Manager managerDailey=new DaileyExpanse_Manager();
    private JButton speedButon=new JButton("Speed Time");
    private JButton Ratebutton=new JButton("Set Income Rate");
    private JButton Incomebutton=new JButton("Set Income");
    private JButton ShowUserButon=new JButton("Show Users Information");
    private JFrame UserFrame=new JFrame();
    private JButton Butonınfo[];
    Container cuser=UserFrame.getContentPane();
    BusinessIncomeInfo ınfo=new BusinessIncomeInfo();
    BusinessIncomeInfo ınfo2=new BusinessIncomeInfo();
    BusinessIncomeInfo_Manager managerınfo=new BusinessIncomeInfo_Manager();
    User_Manager manageruser=new User_Manager();
    UserGameInformation usergame=new UserGameInformation();
    UserGameInformation_Manager managerusergame=new UserGameInformation_Manager();
    Plot_Manager managerPlot=new Plot_Manager();
    private JButton erbuton=new JButton("Show ER diagram");
   
     public void frameUtilites()
    {
       frame.setLayout(null);
      
      // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setResizable(false);
       frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
       frame.setVisible(true);
  
       
       c.setLayout(null);
    }
     public void SetFrame()
     {
         SizeButton.setBounds(350,20,250,100);
         SizeButton.setFont(font3);
         
         DaileyExpanse.setBounds(650, 20, 250, 100);
         DaileyExpanse.setFont(font3);
         StartingAmount.setBounds(950,20,250,100);
         StartingAmount.setFont(font3);
         
         speedButon.setBounds(650, 300, 250, 100);
         speedButon.setFont(font3);
         
         Ratebutton.setBounds(350, 300, 250, 100);
         Ratebutton.setFont(font3);
         
         Incomebutton.setBounds(950, 300, 250, 100);
         Incomebutton.setFont(font3);
         
         ShowUserButon.setBounds(550, 500, 400, 100);
         ShowUserButon.setFont(font3);
         
         erbuton.setBounds(500, 700, 200, 100);
         erbuton.setFont(font3);
         c.add(erbuton);
         c.add(ShowUserButon);
                 
         c.add(Incomebutton);
         c.add(Ratebutton);
         c.add(speedButon);
         c.add(SizeButton);
         c.add(StartingAmount);
         c.add(DaileyExpanse);
         
         
         
         erbuton.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               
               MAİN main=new MAİN();
               
               main.setVisible(true);
               
           }
   });
         
         
         
         
         
         
         ShowUserButon.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               
               try {
                   ShowUserInfo();
               } catch (SQLException ex) {
                   Logger.getLogger(AuthorizedGUI.class.getName()).log(Level.SEVERE, null, ex);
               }
               
               
               
           }
   });
         
         
         
         Ratebutton.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               
               try {
                   takeRate();
               } catch (SQLException ex) {
                   Logger.getLogger(AuthorizedGUI.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
   });
         
         
         
          Incomebutton.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               try {
                   takeIncome();
               } catch (SQLException ex) {
                   Logger.getLogger(AuthorizedGUI.class.getName()).log(Level.SEVERE, null, ex);
               }
               
            
           }
   });
         
         
         
         
         
         
         speedButon.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               
               try {
                   takeDateInfo();
               } catch (SQLException ex) {
                   Logger.getLogger(AuthorizedGUI.class.getName()).log(Level.SEVERE, null, ex);
               }
            
           }
   });
         
         
         
         SizeButton.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               
               try {
                   takeSizeInfo();
               } catch (SQLException ex) {
                   Logger.getLogger(AuthorizedGUI.class.getName()).log(Level.SEVERE, null, ex);
               }
              
            
           }
   });
         
         
         DaileyExpanse.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               
               try {
                   takeDailey();
               } catch (SQLException ex) {
                   Logger.getLogger(AuthorizedGUI.class.getName()).log(Level.SEVERE, null, ex);
               }
             
            
           }
   });
         
         
         
         StartingAmount.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               
              
               
               try {
                   takeStartingAmount();
               } catch (SQLException ex) {
                   Logger.getLogger(AuthorizedGUI.class.getName()).log(Level.SEVERE, null, ex);
               }
                
                
             
            
           }
   });
         
         
     }
     
     public void takeSizeInfo() throws SQLException
     {
          String str=JOptionPane.showInputDialog("Enter Plot Size as examples 6x4,3x4");
                if(!str.isEmpty())
                {
                    
                plotsize.setPlotSize(str);
                plotsize.setPlotNo(1);
        managerPlotsize.update(plotsize);
               
        
                
                }
     }
     public void takeStartingAmount() throws SQLException
     {
         String str=JOptionPane.showInputDialog("Enter Starting Amounts");
                if(!str.isEmpty())
                {
              
                 int number = Integer.parseInt(str);
                 
            
               startınfoManager.find(1).setStartingfUserFood(number);
               startınfo=startınfoManager.find(1);
              // startınfo.setUserNo(1);
               startınfo.setStartingfUserMoney(number);
               startınfo.setStartingfUserGoods(number);
               startınfo.setStartingfUserFood(number);
             
               
      startınfoManager.update(startınfo) ; 
                
                }
     }
     
     public void takeDailey() throws SQLException
     {
    
      
      String str=JOptionPane.showInputDialog("Enter Dailey Expanses");
                if(!str.isEmpty())
                {
              
                 int number = Integer.parseInt(str);
                 
            dailey=  managerDailey.find(1);
             
              
              dailey.setDailyFoodExpanse(number);
              dailey.setDailyGoodsExpanse(number);
              dailey.setDailyMoneyExpanse(number);
               
      managerDailey.update(dailey) ; 
                
                }
      
     }
    
    public void takeDateInfo() throws SQLException
    {
        JOptionPane.showMessageDialog(c,"Enter Date like 27-05-2023","Date warning",JOptionPane.WARNING_MESSAGE);
        String str=JOptionPane.showInputDialog("Enter Date that you want to show");
                if(str!=null)
                {
              
                GUI speed=new GUI(5);
    
    login cvb=new login();
    
    login_Manager managercvb=new login_Manager();
    
   PlayingFieldGUI gl=new PlayingFieldGUI();
    for(login z:managercvb.list())
    {
        speed.reduceAmountspeed(z.getUserNo(),str);
        gl.workingSpeed(z.getUserNo(),str);
        
     
    }
    gl.DaileyBusinessIncome(str);
    gl.IncreaseLevel(str);
                
                }
    }
    
    public void takeRate() throws SQLException
    {
        String str=JOptionPane.showInputDialog("Enter Manager Shop Income Rate");
                if(!str.isEmpty())
                {
              
                 int number = Integer.parseInt(str);
                 
           
             
              
              ınfo.setPlotNo(2);
   
    
    ınfo.setBusinessFixedIncomeRate(number);
   
    
    managerınfo.update(ınfo);
    
    
    ınfo2.setPlotNo(4);
   
    
    ınfo2.setBusinessFixedIncomeRate(number);
    managerınfo.update(ınfo2);
    
    ınfo.setPlotNo(0);
    ınfo.setBusinessFixedIncomeRate(number);
    managerınfo.update(ınfo);
                
                }
        
        
    }
    
    public void takeIncome() throws SQLException
    {
        
        String str=JOptionPane.showInputDialog("Enter Manager Shop fixed Income");
                if(!str.isEmpty())
                {
              
                 int number = Integer.parseInt(str);
                 
           
             
              
              ınfo.setPlotNo(2);
   
    
    ınfo.setBusinessFixedIncomeAmount(number);
    managerınfo.update(ınfo);
    
    ınfo2.setPlotNo(4);
   
    
    ınfo2.setBusinessFixedIncomeAmount(number);
    managerınfo.update(ınfo2);
    
    ınfo.setPlotNo(0);
    ınfo.setBusinessFixedIncomeAmount(number);
    managerınfo.update(ınfo);
                
                }
        
        
    }
    
    public void ShowUserInfo() throws SQLException
    {
        UserFrame.setLayout(null);
      
      // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       UserFrame.setResizable(false);
       UserFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
       UserFrame.setVisible(true);
  
       
       cuser.setLayout(null);
        
        Butonınfo=new JButton[1000];
        
        int i=0;
               int x=0;
               int y=0;
       for(User user:manageruser.list())
       {
           Butonınfo[i]=new JButton();
           Butonınfo[i].setBounds(x, y, 50, 30);
           String s=Integer.toString(user.getUserNo());
           Butonınfo[i].setText(s);
           cuser.add(Butonınfo[i]);
           y=y+30;
           
          
                   
       }
       y=0;
       for(User user:manageruser.list())
       {
           Butonınfo[i]=new JButton();
           Butonınfo[i].setBounds(60, y, 100, 30);
         //  String s=Integer.toString(user.getUserName());
           Butonınfo[i].setText(user.getUserName());
           cuser.add(Butonınfo[i]);
           y=y+30;
           
          
                   
       }
       
        y=0;
       for(User user:manageruser.list())
       {
           Butonınfo[i]=new JButton();
           Butonınfo[i].setBounds(160, y, 100, 30);
         //  String s=Integer.toString(user.getUserName());
           Butonınfo[i].setText(user.getUserSurname());
           cuser.add(Butonınfo[i]);
           y=y+30;
           
          
                   
       }
        y=0;
        
        
        for(User user:manageruser.list())
        {
            
        
        
       for(UserGameInformation usergame:managerusergame.list())
       {
           if(user.getUserNo()==usergame.getUserNo())
           {
               
           
           Butonınfo[i]=new JButton();
           Butonınfo[i].setBounds(360, y, 200, 30);
           String s=Integer.toString(managerusergame.find(usergame.getUserNo()).getAmountofUserMoney());
           Butonınfo[i].setText("money: "+s);
           cuser.add(Butonınfo[i]);
           
           }
          
                   
       }
        
        y=y+30;
        
        
        }
       
        y=0;
        
        
        for(User user:manageruser.list())
        {
            
        
        
       for(UserGameInformation usergame:managerusergame.list())
       {
           if(user.getUserNo()==usergame.getUserNo())
           {
               
           
           Butonınfo[i]=new JButton();
           Butonınfo[i].setBounds(560, y, 200, 30);
           String s=Integer.toString(managerusergame.find(usergame.getUserNo()).getAmountofUserFood());
           Butonınfo[i].setText("food: "+s);
           cuser.add(Butonınfo[i]);
           
           }
          
                   
       }
        
        y=y+30;
        
        
        }
       
        
        y=0;
        
        
        for(User user:manageruser.list())
        {
            
        
        
       for(UserGameInformation usergame:managerusergame.list())
       {
           if(user.getUserNo()==usergame.getUserNo())
           {
               
           
           Butonınfo[i]=new JButton();
           Butonınfo[i].setBounds(760, y, 200, 30);
           String s=Integer.toString(managerusergame.find(usergame.getUserNo()).getAmountofUserGoods());
           Butonınfo[i].setText("goods: "+s);
           cuser.add(Butonınfo[i]);
           
           }
          
                   
       }
        
        y=y+30;
        
        
        }
       //alan
       
       y=0;
        
        
        for(User user:manageruser.list())
        {
            
        
        Butonınfo[i]=new JButton();
           Butonınfo[i].setBounds(960, y, 100, 30);
         
           Butonınfo[i].setText("Our Estates: ");
           cuser.add(Butonınfo[i]);
           int x2=1060;
       for(Plot plot:managerPlot.list())
       {
           if(user.getUserName().equals(plot.getPlotOwner()))
           {
               
           Butonınfo[i]=new JButton();
          
           Butonınfo[i].setBounds(x2, y, 50, 30);
           String s=Integer.toString(plot.getPlotNo());
           Butonınfo[i].setText(s);
           cuser.add(Butonınfo[i]);
           
           x2=x2+50;
           }
          
                   
       }
        
        y=y+30;
        
        
        }
       
        
        
         y=0;
       for(User user:manageruser.list())
       {
           Butonınfo[i]=new JButton();
           Butonınfo[i].setBounds(1370, y, 150, 30);
           
           String s=Integer.toString(managerDailey.find(1).getDailyFoodExpanse());
           Butonınfo[i].setText("Dailey Expanse: "+s);
           cuser.add(Butonınfo[i]);
           y=y+30;
           
          
                   
       }
       
        
    }
}
