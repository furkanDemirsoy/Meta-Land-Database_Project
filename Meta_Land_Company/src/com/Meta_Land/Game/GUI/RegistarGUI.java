/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.GUI;

import com.Meta_Land.Game.entity.User;
import com.Meta_Land.Game.entity.UserGameInformation;
import com.Meta_Land.Game.entity.UserGameStartingGameInfo;
import com.Meta_Land.Game.manager.UserGameInformation_Manager;
import com.Meta_Land.Game.manager.UserGameStartingGameInfo_Manager;
import com.Meta_Land.Game.manager.User_Manager;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
public class RegistarGUI {
    private JPanel panel=new JPanel();
   private JFrame frame=new JFrame();
   private Icon icon = new ImageIcon("C:\\Users\\izemd\\OneDrive\\Masaüstü\\META_LAND\\src\\7c89904c65970d2581ce4b5a392f7712.gif");
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
    private JTextField textfieldBirth=new JTextField();
    private JTextField textfieldUserName=new JTextField();
   private  Font font =new Font("Arial",Font.PLAIN,30);
   private  Font font2 =new Font("Arial",Font.PLAIN,25);
   private JPasswordField password=new JPasswordField();
   private JPasswordField password2=new JPasswordField();
   private JLabel label2=new JLabel("Welcome to My Meta-Land Game");
   private JLabel label3=new JLabel("Please Sign Up to Play Game");
   private JLabel label4=new JLabel("I Have 2 Problem to Play Game");
   private JButton buton=new JButton("Login");
    private JButton buton2=new JButton("Sign Up");
    private JLabel label6=new JLabel("Enter your E-mail");
   private JLabel label7=new JLabel("Enter your Password");
   private JLabel label8=new JLabel("Enter your Password Again ");
   private JLabel label9=new JLabel("Enter your Surname  ");
   private JLabel label10=new JLabel("Enter your User Name  ");
    private  Font font3 =new Font("Arial",Font.PLAIN,15);
    private JButton butonComplate=new JButton("Complate");
    private User user=new User();;
    private User_Manager managerUser=new User_Manager();
    private UserGameStartingGameInfo startınfo=new UserGameStartingGameInfo();
    private UserGameStartingGameInfo_Manager startınfoManager=new UserGameStartingGameInfo_Manager();
    
    private UserGameInformation usergame=new UserGameInformation();
    private UserGameInformation_Manager managerUsergame=new UserGameInformation_Manager();
            
   public RegistarGUI()
   {
       frame.setLayout(null);
       frame.setBounds(0, 0,2000, 700);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setResizable(false);
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
       
       textfieldUserName.setBounds(250,480,250,40);
       textfieldBirth.setBounds(250,410,250,40);
       
       password2.setBounds(250,340,250, 40);
       
        password.setBounds(250,270,250, 40);
        password.setBackground(Color.white);
       panel.add(textfield);
       panel.add(password);
       password.setForeground(Color.DARK_GRAY);
       password.setFont(font3);
       
        password2.setForeground(Color.DARK_GRAY);
       password2.setFont(font3);
       password2.setBackground(Color.white);
       textfield.setFont(font3);
       textfield.setForeground(Color.DARK_GRAY);
       textfield.setBackground(Color.white);
       
       textfieldBirth.setFont(font3);
       textfieldBirth.setForeground(Color.DARK_GRAY);
       textfieldBirth.setBackground(Color.white);
       
       textfieldUserName.setFont(font3);
       textfieldUserName.setForeground(Color.DARK_GRAY);
       textfieldUserName.setBackground(Color.white);
       
       
       
       
       panel.add(textfieldBirth);
       panel.add(textfieldUserName);
       panel.add(password2);
       textfield.setEditable(true);

       label2.setBounds(150,20, 1200,100);
       label2.setFont(font);
       label2.setForeground(Color.white);
       
        label3.setBounds(230,80, 1200,100);
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
       
       
       butonComplate.setBounds(250, 600,250,40);
       butonComplate.setBackground(acikKIRMIZI4);
       butonComplate.setFont(font2);
       butonComplate.setForeground(acikGRİ4);
       panel.add(butonComplate);
       label6.setBounds(255, 140,1000,100);
       label7.setBounds(255, 210,1000,100);
       
       label8.setBounds(255, 280,1000,100);
       label9.setBounds(255, 350,1000,100);
       label10.setBounds(255, 420,1000,100);
       
       label8.setForeground(Color.DARK_GRAY);
       label9.setForeground(Color.darkGray);
       label10.setForeground(Color.DARK_GRAY);
       
       label6.setBackground(acikGRİ4);
       label6.setForeground(Color.DARK_GRAY);
       label7.setForeground(Color.darkGray);
       
       panel.add(label6);
       panel.add(label7);
      // panel.add(buton2);
      // panel.add(buton);
       panel.add(label2);
       panel.add(label3);
       panel.add(label8);
       panel.add(label9);
       panel.add(label10);
c.add(label);
c.add(panel);
c.add(panel2);

c.setBackground(Color.WHITE);

frame.setVisible(true);


               
               

butonComplate.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              String EMAİL=null;
                EMAİL=textfield.getText();
               
              
               
               
                
               String SURNAME=null;
                SURNAME=textfieldBirth.getText();
               String USERNAME=null;
                USERNAME=textfieldUserName.getText();
                
               
                
               char[]   PASSWORD=password.getPassword();
               char[]   PASSWORD2=password2.getPassword();
                 
             String password=  String.valueOf(PASSWORD);
             String password2=  String.valueOf(PASSWORD2);
                
            
             
               if(EMAİL.isEmpty()||SURNAME.isEmpty()||USERNAME.isEmpty()||password.isEmpty()||password2.isEmpty())
               {
                  
                   JOptionPane.showMessageDialog(c,"Your Registartion Failed","Registaration Feedback",JOptionPane.INFORMATION_MESSAGE);
                   frame.setVisible(false);
                  //  System.out.println(password);
                  
               }
               else
               {
                   try { 
                   user.setUserNo(managerUser.list().size());
                   
               } catch (SQLException ex) {
                   Logger.getLogger(RegistarGUI.class.getName()).log(Level.SEVERE, null, ex);
               }
                   
                   user.setUserName(USERNAME);
                user.setUserSurname(SURNAME);
                user.setUserPassword(password);
                
                  try {
                      managerUser.insert(user);
                  } catch (SQLException ex) {
                      Logger.getLogger(RegistarGUI.class.getName()).log(Level.SEVERE, null, ex);
                  }
                    JOptionPane.showMessageDialog(c,"Your Registaration Has Been Complated","Registar Feedback",JOptionPane.INFORMATION_MESSAGE);
                  try {
                      SaveStartingInfo();
                  } catch (SQLException ex) {
                      Logger.getLogger(RegistarGUI.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  
                  try {
                      SaveUserGameInfo();
                  } catch (SQLException ex) {
                      Logger.getLogger(RegistarGUI.class.getName()).log(Level.SEVERE, null, ex);
                  }
              frame.setVisible(false);
               }
              
              GUI g=new GUI();
           }
   });
   }
   public void SaveStartingInfo() throws SQLException
   {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String currentDateAsString = currentDate.format(formatter);
       
        
       
       startınfo.setUserNo(managerUser.list().size()-1);
       startınfo.setStartingfUserMoney(startınfoManager.find(1).getStartingfUserFood());
       startınfo.setStartingfUserGoods(startınfoManager.find(1).getStartingfUserFood());
       startınfo.setStartingfUserFood(startınfoManager.find(1).getStartingfUserFood());
       startınfo.setStartingGameDate(currentDateAsString);
       
       startınfoManager.insert(startınfo);
     
   }
   
   public void SaveUserGameInfo() throws SQLException
    {
        
        usergame.setUserNo(managerUser.list().size()-1);
        usergame.setAmountofUserFood(startınfoManager.find(1).getStartingfUserFood());
        usergame.setAmountofUserGoods(startınfoManager.find(1).getStartingfUserFood());
        usergame.setAmountofUserMoney(startınfoManager.find(1).getStartingfUserFood());
        
        managerUsergame.insert(usergame);
    }
}
