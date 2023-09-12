/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.GUI;

import com.Meta_Land.Game.entity.DaileyExpanse;
import com.Meta_Land.Game.entity.User;
import com.Meta_Land.Game.entity.UserGameInformation;
import com.Meta_Land.Game.entity.login;
import com.Meta_Land.Game.manager.DaileyExpanse_Manager;
import com.Meta_Land.Game.manager.PlotSize_Manager;
import com.Meta_Land.Game.manager.UserGameInformation_Manager;
import com.Meta_Land.Game.manager.User_Manager;
import com.Meta_Land.Game.manager.login_Manager;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Math.abs;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author izemd
 */
public class GUI {
     private JPanel panel=new JPanel();
   private JFrame frame=new JFrame();
   private Icon icon = new ImageIcon("C:\\Users\\izemd\\OneDrive\\Masaüstü\\Meta_Land_Company\\src\\7c89904c65970d2581ce4b5a392f7712.gif");
   private JLabel label = new JLabel();
   private Container c=frame.getContentPane();
   private Color acikMavi2 = Color.decode("#D1EAF0");
   private Color acikMavi3 = Color.decode("#61A5C2");
  
  // private Color acikMavi3 = Color.decode("#aaaaaa");
   private Color acikMavi4 = Color.decode("#90E0EF");
  // private Color acikKIRMIZI4 = Color.decode("#3f3f3f");
  private Color acikKIRMIZI4 = Color.decode("#EC5578");
 //  private Color acikKIRMIZI4 = Color.decode("#bbbbbb");
   private Color acikMOR4 = Color.decode("#B289F3");
   private Color acikGRİ4 = Color.decode("#bbbbbb");
   private JPanel panel2=new JPanel();
   private JPanel panel3=new JPanel();
    private JPanel panel4=new JPanel();
    private JPanel panel5=new JPanel();
    private JTextField textfield=new JTextField();
   private  Font font =new Font("Arial",Font.PLAIN,30);
   private  Font font2 =new Font("Arial",Font.PLAIN,25);
   private JPasswordField password=new JPasswordField();
   private JLabel label2=new JLabel("Welcome to My Meta-Land Game");
   private JLabel label3=new JLabel("Please Login to Play Game");
   private JLabel label4=new JLabel("I Have 2 Problem to Play Game");
   private JButton buton=new JButton("Login");
    private JButton buton2=new JButton("Sign Up");
    private JLabel label6=new JLabel("User Name");
   private JLabel label7=new JLabel("Password");
    private  Font font3 =new Font("Arial",Font.PLAIN,15);
    private User user=new User();
    private User_Manager managerUser=new User_Manager();
    private PlotSize_Manager managerPlotsize=new PlotSize_Manager();
    private login log=new login();
    private login_Manager managerLog=new login_Manager();
    private Date_Amount_Transactions date=new Date_Amount_Transactions();
    private UserGameInformation usergameınfo=new UserGameInformation();
    private UserGameInformation_Manager managerUserGameInfo=new UserGameInformation_Manager();
    private DaileyExpanse dailey=new DaileyExpanse();
    private DaileyExpanse_Manager managerdailey=new DaileyExpanse_Manager();
    
    public GUI(int x)
    {
        
    }
   public GUI()
   {
       frame.setLayout(null);
       frame.setBounds(0, 0,2000, 700);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // frame.setResizable(false);
       frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
       frame.setUndecorated(false);



       panel.setBounds(800,0, 1000, 1000);
       panel.setBackground(acikMavi3);

       
       panel2.setBounds(0,600, 1000,1000);
       panel2.setBackground(acikMavi2);
       
       panel3.setBounds(0,0, 1000,1000);
       panel3.setBackground(acikMavi4);
       panel.setLayout(null);
       panel4.setBounds(0,0,100,900);
       panel4.setBackground(acikKIRMIZI4);
       
       panel5.setBounds(650,0,100,900);
       panel5.setBackground(acikGRİ4);
       
       panel.add(panel4);
       panel.add(panel5);
       label.setBounds(0,0,1000,600);
       
       label.setIcon(icon);

       textfield.setBounds(250,200,250,40);
        password.setBounds(250,270,250, 40);
        password.setBackground(Color.white);
       panel.add(textfield);
       panel.add(password);
       password.setForeground(Color.DARK_GRAY);
       password.setFont(font3);
       
       textfield.setFont(font3);
       textfield.setForeground(Color.DARK_GRAY);
       textfield.setBackground(Color.white);
       
       textfield.setEditable(true);

       label2.setBounds(150,20, 700,100);
       label2.setFont(font);
       label2.setForeground(Color.white);
       
        label3.setBounds(230,80, 600,100);
       label3.setFont(font2);
       label3.setForeground(Color.white);
       
       buton.setBounds(250, 400,250,40);
       buton.setBackground(acikKIRMIZI4);
       buton.setFont(font2);
       buton.setForeground(Color.white);
       
       buton2.setBounds(250, 450,250,40);
       buton2.setBackground(acikGRİ4);
       buton2.setFont(font2);
       buton2.setForeground(Color.white);
       
       label6.setBounds(255, 140,100,100);
       label7.setBounds(255, 210,100,100);
       label6.setBackground(acikGRİ4);
       label6.setForeground(Color.DARK_GRAY);
       label7.setForeground(Color.darkGray);
       
       panel.add(label6);
       panel.add(label7);
       panel.add(buton2);
       panel.add(buton);
       panel.add(label2);
       panel.add(label3);
c.add(label);
c.add(panel);
c.add(panel2);

c.setBackground(Color.WHITE);

frame.setVisible(true);

buton2.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              frame.setVisible(false);
              RegistarGUI g=new RegistarGUI();
              
           }
   });

buton.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               
               
              LoginControl();
              
             //  RegistarGUI g=new RegistarGUI();
            
           }
   });


   }
   public void LoginControl()
   {
        String USERNAME=null;
                USERNAME=textfield.getText();
                
               
                
               char[]   PASSWORD=password.getPassword();
               String password=  String.valueOf(PASSWORD);
               if(USERNAME.isEmpty()||password.isEmpty())
               {
                   JOptionPane.showMessageDialog(c,"Please Fill Empty Fields","login Feedback",JOptionPane.INFORMATION_MESSAGE);
               }
               else
               {
                   int controlTemp=0;
                   try {
                       for( User z:managerUser.list())
                       {
                          if( z.getUserName().equals(USERNAME)&&z.getUserPassword().equals(password))
                          {
                              if(z.getUserName().equals("furkan")&&z.getUserPassword().equals("0536ee2002"))
                              {
                                  AuthorizedGUI n=new AuthorizedGUI();
                                  n.frameUtilites();
                                  n.SetFrame();
                                  controlTemp++;
                              }
                              else
                              {
                                  controlTemp++;
                              PlayingFieldGUI n=new PlayingFieldGUI(z.getUserNo());
                              n.working(z.getUserNo());
                                n.frameUtilites();
                             String str=   managerPlotsize.find(1).getPlotSize();
                             char[] charArray=new char[str.length()];
                             
                             for (int i = 0; i < str.length(); i++) {
                                    charArray[i] = str.charAt(i);
                            }
                             
                            System.out.println(" "+charArray[2]); 
                            
                             int a = Integer.parseInt(String.valueOf(charArray[0]));
                             int b = Integer.parseInt(String.valueOf(charArray[2]));
                             
                              //  charArray[0]
                              reduceAmount(z.getUserNo());
                                SaveLoginDate(z.getUserNo());                         
                                n.Generete(b,a);
                                break;
                              }
                            //  z.getUserNo() bu da o kullanıcının id sidir
                              
                          }
                       }
                          if(controlTemp==0)
                          {
                              JOptionPane.showMessageDialog(c,"Please Enter Correct Information","Login Feedback",JOptionPane.INFORMATION_MESSAGE);
                              
                          }
                        
                          
                       
                   } catch (SQLException ex) {
                       Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                   }
               }
   }
   
   public void SaveLoginDate(int userNo) throws SQLException
   {
       LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String currentDateAsString = currentDate.format(formatter);
        
        log.setUserNo(userNo);
        log.setLastLoginDate(currentDateAsString);
        managerLog.delete(userNo);
        
            managerLog.insert(log);
        
        
   }
   public void reduceAmount(int userNo) throws SQLException
   {//gunluk giderden azalt
       try
       {
           
       
      long daysbetween= date.SubstractionDate(userNo);
      int food=(managerUserGameInfo.find(userNo).getAmountofUserFood())-((managerdailey.find(1).getDailyFoodExpanse())*((int)daysbetween));
      int goods=(managerUserGameInfo.find(userNo).getAmountofUserGoods())-((managerdailey.find(1).getDailyGoodsExpanse())*((int)daysbetween));
      int money=(managerUserGameInfo.find(userNo).getAmountofUserMoney())-((managerdailey.find(1).getDailyMoneyExpanse())*((int)daysbetween));
      
      usergameınfo.setUserNo(userNo);
      usergameınfo.setAmountofUserFood(food);
      usergameınfo.setAmountofUserMoney(money);
      usergameınfo.setAmountofUserGoods(goods);
      
      
      
      
    managerUserGameInfo.update(usergameınfo); 
       }
       catch(java.lang.NullPointerException ex)
       {
           
       }
   }
   
   public void reduceAmountspeed(int userNo,String str) throws SQLException
   {//gunluk giderden azalt
       
       Date_Amount_Transactions date=new Date_Amount_Transactions();
    int daysbetween=    (int) abs(date.SubstractionDateSpeed(str));
       
     
      int food=(managerUserGameInfo.find(userNo).getAmountofUserFood())-((managerdailey.find(1).getDailyFoodExpanse())*(daysbetween));
      int goods=(managerUserGameInfo.find(userNo).getAmountofUserGoods())-((managerdailey.find(1).getDailyGoodsExpanse())*(daysbetween));
      int money=(managerUserGameInfo.find(userNo).getAmountofUserMoney())-((managerdailey.find(1).getDailyMoneyExpanse())*(daysbetween));
      
      usergameınfo.setUserNo(userNo);
      usergameınfo.setAmountofUserFood(food);
      usergameınfo.setAmountofUserMoney(money);
      usergameınfo.setAmountofUserGoods(goods);
      
      
      
      
    managerUserGameInfo.update(usergameınfo);  
   }
}
