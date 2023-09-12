/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.GUI;

import com.Meta_Land.Game.entity.BusinessIncomeInfo;
import com.Meta_Land.Game.entity.BusinessInformation;
import com.Meta_Land.Game.entity.DaileyExpanse;
import com.Meta_Land.Game.entity.EstateTransactions;
import com.Meta_Land.Game.entity.Plot;
import com.Meta_Land.Game.entity.Rental_Transactions;
import com.Meta_Land.Game.entity.Sales_Transactions;
import com.Meta_Land.Game.entity.User;
import com.Meta_Land.Game.entity.UserBusineesInformation;
import com.Meta_Land.Game.entity.UserGameInformation;
import com.Meta_Land.Game.entity.UserWorkingPlace;
import com.Meta_Land.Game.manager.BusinessIncomeInfo_Manager;
import com.Meta_Land.Game.manager.BusinessInformation_Manager;
import com.Meta_Land.Game.manager.DaileyExpanse_Manager;
import com.Meta_Land.Game.manager.EstateTransactions_Manager;
import com.Meta_Land.Game.manager.Plot_Manager;
import com.Meta_Land.Game.manager.Rental_Transactions_Manager;
import com.Meta_Land.Game.manager.Sales_Transactions_Manager;
import com.Meta_Land.Game.manager.UserBusinessInfotmation_Manager;
import com.Meta_Land.Game.manager.UserGameInformation_Manager;
import com.Meta_Land.Game.manager.UserWorkingPlace_Manager;
import com.Meta_Land.Game.manager.User_Manager;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Math.abs;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author izemd
 */
public class PlayingFieldGUI {
     private JFrame frame=new JFrame();
    private JPanel panel=new JPanel();
    private JButton buton[];
    private Container c=frame.getContentPane();
    private Color green = Color.decode("#003152");
    private Color brown = Color.decode("#aaaaaa");
    private Color blue = Color.decode("#003152");
    
    private JButton ScorButon=new JButton();
    private JButton ScorButonGoods=new JButton();
    private JButton ScorButonFoods=new JButton();
     private JPanel LocationUser=new JPanel();
    private  Font font3 =new Font("Arial",Font.ITALIC,20);
    private  Font font5 =new Font("Arial",Font.ITALIC,30);
    ImageIcon icon2=new ImageIcon("C:\\Users\\izemd\\OneDrive\\Masaüstü\\Downloads\\indir (5).jpg");
    ImageIcon icon3=new ImageIcon("C:\\Users\\izemd\\OneDrive\\Masaüstü\\Downloads\\indir (6).jpg");
     ImageIcon icon4=new ImageIcon("C:\\Users\\izemd\\OneDrive\\Masaüstü\\Downloads\\indir (7).jpg");
     ImageIcon icon5=new ImageIcon("C:\\Users\\izemd\\OneDrive\\Masaüstü\\Downloads\\indir.png");
     ImageIcon iconFood=new ImageIcon("C:\\Users\\izemd\\OneDrive\\Masaüstü\\Downloads\\indir (9).jpg");
     ImageIcon iconGood=new ImageIcon("C:\\Users\\izemd\\OneDrive\\Masaüstü\\Downloads\\images (3).png");
      public  ArrayList<Integer> AllButtonX=new ArrayList<>();
       public  ArrayList<Integer> AllButtonY=new ArrayList<>();
       public  ArrayList<Integer> AllButtoni=new ArrayList<>();
       private JFrame frameShop=new JFrame();
       private Container c2=frameShop.getContentPane();
       private Plot plot=new Plot();
       private Plot_Manager managerPlot=new Plot_Manager();
       private  Plot market=new Plot();
      private  Plot grocery=new Plot();
      private Plot estate=new Plot();
      private JButton butonestate=new JButton("Emlak İşlemleri");
      private JButton butongrocery=new JButton("Yiyecek İşlemleri");
      private JButton butongoods=new JButton("Eşya İşlemleri");
      
      private JFrame estateframe=new JFrame();
      private JFrame goodsframe=new JFrame();
      private JFrame groceryframe=new JFrame();
      private Container estatec=estateframe.getContentPane();
      private Container goodsc=goodsframe.getContentPane();
      private Container groceryc=groceryframe.getContentPane();
      
      
      private JButton workestate=new JButton("Çalış");
      private JButton buyestate=new JButton("Satın Al");
      private JButton rentestate=new JButton("Kirala");
      
      private JButton workgrocery=new JButton("Çalış");
      private JButton buygrocery=new JButton("Yiyecek Al");
      
      private JButton workgoods=new JButton("Çalış");
      private JButton buygoods=new JButton("Eşya Al");
      
      private JButton manageEstate=new JButton("Manage Estate");
      
      private JLabel labelmy=new JLabel();
      private JLabel label=new JLabel();
      
      private JFrame estatemanagerframe=new JFrame();
      private Container cestateman=estatemanagerframe.getContentPane();
      
      private JButton hour=new JButton("Set working hour");
      private JButton money=new JButton("Set dailey income ");
      private  JButton SellEstate=new JButton("Sell Estate");
      private JButton rentestate2=new JButton("Rent Estate");
      
      private BusinessInformation business=new BusinessInformation();
      private BusinessInformation_Manager managerBusiness=new BusinessInformation_Manager();
      
      private BusinessIncomeInfo businessIncome=new BusinessIncomeInfo();
      private BusinessIncomeInfo_Manager managerBusinessIncome=new BusinessIncomeInfo_Manager();
      
      private UserBusineesInformation userBusiness=new UserBusineesInformation();
      private UserBusinessInfotmation_Manager managerUserBusiness=new UserBusinessInfotmation_Manager();
      
      private UserGameInformation usergameınfo=new UserGameInformation();
    private UserGameInformation_Manager managerUserGameInfo=new UserGameInformation_Manager();
    private Date_Amount_Transactions date=new Date_Amount_Transactions();
    
    private UserWorkingPlace work=new UserWorkingPlace();
    private UserWorkingPlace_Manager managerwork=new UserWorkingPlace_Manager();
    
    private DaileyExpanse dailey=new DaileyExpanse();
    private DaileyExpanse_Manager managerdailey=new DaileyExpanse_Manager();
    
  private  User user=new User();
  private User_Manager manageruser=new User_Manager();
    
  private EstateTransactions estateTrans=new EstateTransactions();
  private EstateTransactions_Manager managerestateTrans=new EstateTransactions_Manager();
  
  private Sales_Transactions sales=new Sales_Transactions();
  private Sales_Transactions_Manager managersales=new Sales_Transactions_Manager();
  
  private Rental_Transactions rental=new Rental_Transactions();
  private Rental_Transactions_Manager managerrental=new Rental_Transactions_Manager();
  
    private JButton quitejob=new JButton("quite job");
    private JButton job=new JButton();
    
    private JLabel moneyLabel=new JLabel();
    private JLabel goodsLabel=new JLabel();
    private JLabel foodLabel=new JLabel();
    
    private JButton SetBusiness=new JButton("Set Up Business");
    
    private JButton SetThingSellPrice =new JButton();
    
    private JLabel labelMyEstate=new JLabel("My Estates:");
    
    private JButton butonMyEstate[];
   
      int x=0;
        int y=0;
        private int counter=0;
        private int userNo;
        
        public PlayingFieldGUI(int userNo)
        {
            this.userNo=userNo;
        }
        public PlayingFieldGUI()
        {
           
        }
        
    public void frameUtilites()
    {
       frame.setLayout(null);
      
      // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setResizable(false);
       frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
       frame.setVisible(true);
  panel.setBounds(20, 10,2000,1000);
  panel.setBackground(blue);
  panel.setLayout(null);
       c.setLayout(null);
    }
    
    public void Generete(int column,int row) throws SQLException
    {
        buton=new JButton[1000];
        int i=0;
       
       // int counter=0;
        int control=0;
        int control2=0;
        int control3=0;
        while(counter<=row*column-1)
        {
            buton[counter]=new JButton();
            buton[counter].setBackground(brown);
            buton[counter].setBounds(x, y,130,130);
            AllButtonX.add(x);
            AllButtonY.add(y);
            if(i==0&&control!=1)
            {
               
                control=1;
            }
             if(i==2&&control2!=1)
            {
              
                control2=1;
            }
              if(i==4&&control3!=1)
            {
              
                control3=1;
            }
          AllButtoni.add(counter);
            x=x+140;//150
           
            if(buton[counter]!=null)
            {
                
            
            panel.add(buton[counter]);
            }
            
            
            counter++;
           
            i++;
            
             if(i==row)
            {
               x=0; 
               y=y+140;//150
               i=0;
            }
           
        }
        counter=0;
        while(counter<=row*column-1)
        {
            
        
            
        
                if(buton[counter]!=null)
                {
                    
                
            buton[counter].setText("Alan No"+counter);
            buton[counter].setForeground(Color.DARK_GRAY);
           buton[counter].addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              
              
             //  RegistarGUI g=new RegistarGUI();
           // ShopInformaitonUtilities();
             
               try {
                  PlotRegistrationtoDataBase();
                
                 } catch (SQLException ex) {
                   Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
               }
            
                 
                   
           }
   });
            
                }
          counter++;
            }
        ScorButon.setBounds(1300,410,200, 140);
        //ScorButon.setFont(font3);
        ScorButon.setIcon(icon5);
        
         ScorButonGoods.setBounds(1300,10,200, 140);
        //ScorButon.setFont(font3);
        ScorButonGoods.setIcon(iconGood);
        
        
         ScorButonFoods.setBounds(1300,210,200, 140);
        //ScorButon.setFont(font3);
        ScorButonFoods.setIcon(iconFood);
        
        
        butonestate.setBounds(1300,580,200,80);
        butonestate.setFont(font3);
        butongrocery.setFont(font3);
        butongoods.setFont(font3);
        
        manageEstate.setBounds(1000, 720,200, 100);
        manageEstate.setFont(font3);
        
        butongrocery.setBounds(1300, 660, 200,80);
        butongoods.setBounds(1300,740, 200, 80);
        
        labelmy.setBounds(900, 550,300,100);
       // labelmy.setText("54");
                labelmy.setFont(font3);
                labelmy.setForeground(Color.red);
        label.setBounds(900,520 ,200,100);
        
        label.setText("Working Place:");
        label.setFont(font3);
        label.setForeground(Color.red);
        
        labelMyEstate.setBounds(900, 400, 300, 100);
                labelMyEstate.setFont(font3);
        labelMyEstate.setForeground(Color.red);
        
        panel.add(labelMyEstate);
        panel.add(label);
        panel.add(labelmy);
        panel.add(butonestate);
        panel.add(butongrocery);
        panel.add(butongoods);
        panel.add(manageEstate);
        LocationUser.setBackground(Color.red);
        LocationUser.setVisible(true);
        panel.add(LocationUser);
        panel.add(ScorButon);
        panel.add(ScorButonGoods);
        panel.add(ScorButonFoods);
        c.setBackground(green);
       
       // c.add(panel);
        SaveBusinessInfo();
        butonEstateTransaction();
        butonGorecryTransaction();
        butonClothingTransaction();
        butonEstateManager();
        quite();
        Food();
        Goods();
        Money();
        loser();
        MyEstates();
        showBusiness();
        c.add(panel);
    }
    public void ShopInformaitonUtilities()
    {
        
        c2.setLayout(null);
        c2.setBackground(brown);
        frameShop.setBounds(900,0, 500, 700);
       
        frameShop.setResizable(false);
        c2.setVisible(true);
        frameShop.setVisible(true);
        
       
    }
    
    public void  PlotRegistrationtoDataBase() throws SQLException
    {
          
        
        for(Plot z:managerPlot.list())
      {
         managerPlot.delete(z.getPlotNo());
      }
        
        
        
        
       for(int h:AllButtoni)
       {
          plot.setPlotNo(h);
          plot.setKindofPlot("arsa");
          plot.setPlotOwner("yonetici");
         
          plot.setPlotSize(1);
          managerPlot.insert(plot);
       }
       market.setPlotNo(0);
       market.setKindofPlot("isletme");
       market.setPlotOwner("yonetici");
       market.setPlotSize(1);
       
       grocery.setPlotNo(2);
       grocery.setKindofPlot("isletme");
       grocery.setPlotOwner("yonetici");
       grocery.setPlotSize(1);
       
       estate.setPlotNo(4);
       estate.setPlotOwner("yonetici");
       estate.setPlotSize(1);
       estate.setKindofPlot("isletme");
       
       managerPlot.update(market);
       managerPlot.update(grocery);
       managerPlot.update(estate);
       
       
       
       
    }
    public void butonEstateTransaction()
    {
        
        butonestate.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              
              
             //  RegistarGUI g=new RegistarGUI();
            
                 estateFrame();
                   
           }
   });
        
        
    }
    public void butonGorecryTransaction()
    {
        
         butongrocery.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              
              
             //  RegistarGUI g=new RegistarGUI();
          groceryFrame();
                 
                   
           }
   });
    }
    public void butonClothingTransaction()
    {
        
         butongoods.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              
              
             //  RegistarGUI g=new RegistarGUI();
            
                 goodsFrame();
                   
           }
   });
    }
    
    public void butonEstateManager()
    {
        
        manageEstate.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              
              
               try {
                   //  RegistarGUI g=new RegistarGUI();

                   estatemanagerframe();
               } catch (SQLException ex) {
                   Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
               }
                   
           }
   });
        
        
        
    }
   public void quite()
   {
       
       
       quitejob.setBounds(1000,600,100, 50);
       panel.add(quitejob);
       
       quitejob.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              
              
               try {
                   //  RegistarGUI g=new RegistarGUI();
                   quitejob();
               } catch (SQLException ex) {
                   Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
               }
                 
                   
           }
   });
   }
    
   public void estatemanagerframe() throws SQLException
   {
       cestateman.setLayout(null);
        cestateman.setBackground(brown);
        estatemanagerframe.setBounds(900,0, 500, 700);
      
        estatemanagerframe.setResizable(false);
        cestateman.setVisible(true);
        estatemanagerframe.setVisible(true);
        
        money.setBounds(150,100,200,100);
        hour.setBounds(150,250,200,100);
        money.setFont(font3);
        hour.setFont(font3);
        
        SellEstate.setBounds(150,350,200,100);
        rentestate2.setBounds(150,500,200,100);
        SellEstate.setFont(font3);
        rentestate2.setFont(font3);
        
        SetThingSellPrice.setBounds(150, 0, 200, 100);
        SetThingSellPrice.setFont(font3);
        
        String str=JOptionPane.showInputDialog("Enter  plot no that you want to take action");
                if(str!=null)
                {
                    
                    
                    
                    
                    int PlotNumber=Integer.valueOf(str);
                    
                    
                    if(managerPlot.find(PlotNumber).getKindofPlot().equals("isletme"))
                    {
                       String hjk= manageruser.find(userNo).getUserName();
                        if(managerPlot.find(PlotNumber).getPlotOwner().equals(hjk))
                        {
                   
                    
                    
                   if(managerBusiness.find(PlotNumber).getBusinessType().equals("emlak"))
                   {
                       SetThingSellPrice.setText("Enter Estate Commision Price");
                   }
                   if(managerBusiness.find(PlotNumber).getBusinessType().equals("market"))
                   {
                        SetThingSellPrice.setText("Enter Grocery Food Price");
                   }
                   if(managerBusiness.find(PlotNumber).getBusinessType().equals("magaza"))
                   {
                        SetThingSellPrice.setText("Enter Clothing Goods Price");
                   }
                 
                    
                    
                    
         SetThingSellPrice.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              
              
             //  RegistarGUI g=new RegistarGUI();
            
                String str=JOptionPane.showInputDialog("Enter Selling Servis Price");
               
                
              
                
                
               
                
                
                
                
                if(str!=null)
                {
                    
                int Determine=Integer.valueOf(str);
                
                 
                    try {
                        if(managerBusiness.find(PlotNumber).getBusinessType().equals("emlak"))
                        {
                            
                             try {
                               
                                estateTrans.setPlotNo(PlotNumber);
                                estateTrans.setEstateOperationType("komisyon");
                                estateTrans.setEstateCommission(Determine);
                                managerestateTrans.update(estateTrans);
                               
                                
                            } catch (SQLException ex) {
                                
                                Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                            
                            try {
                                estateTrans.setPlotNo(PlotNumber);
                                estateTrans.setEstateOperationType("komisyon");
                                estateTrans.setEstateCommission(Determine);
                                managerestateTrans.insert(estateTrans);
                            } catch (SQLException ex) {
                                Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                            
                            
                            
                            
                            
                            
                            
                         
                        }} catch (SQLException ex) {
                        Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        if(managerBusiness.find(PlotNumber).getBusinessType().equals("market"))
                        {
                            businessIncome.setMarketFoodPrice(Determine);
                          //  managerBusinessIncome.insert(businessIncome
                        }} catch (SQLException ex) {
                        Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        if(managerBusiness.find(PlotNumber).getBusinessType().equals("magaza"))
                        {
                           businessIncome.setClothingGoodPrice(Determine);
                        }} catch (SQLException ex) {
                        Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                    try {
                        if(!managerBusiness.find(PlotNumber).getBusinessType().equals("emlak"))
                        {
                            
                            
                            int c=0;
                            int am=0;
                            
                            try {
                                //   businessIncome.se
                                
                                c=   managerBusinessIncome.find(0).getBusinessFixedIncomeRate();
                            } catch (SQLException ex) {
                                Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                            try {
                                am= managerBusinessIncome.find(0).getBusinessFixedIncomeAmount();
                            } catch (SQLException ex) {
                                Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                            businessIncome.setBusinessFixedIncomeRate(c);
                            businessIncome.setBusinessFixedIncomeAmount(am);
                            businessIncome.setPlotNo(PlotNumber);
                            
                            
                            
                            int ghj=0;
                         for(BusinessIncomeInfo cxz:   managerBusinessIncome.list())
                         {
                             if(cxz.getPlotNo()==PlotNumber)
                             {
                                 ghj++;
                                 managerBusinessIncome.update(businessIncome);
                                 break;
                             }
                         }
                            if(ghj==0)
                            {
                                 managerBusinessIncome.insert(businessIncome);
                            }
                               
                            
                            
                            
                            
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
      
      
                   
           }
   });
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                money.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              
              
             //  RegistarGUI g=new RegistarGUI();
            
                String str=JOptionPane.showInputDialog("Enter dailey Money income for staff");
                if(str!=null)
                {
                    
                int income=Integer.valueOf(str);
                
                business.setPlotNo(PlotNumber);
                business.setUserOperatingFee(income);
               
                String gh = null;
                int cv = 0;
                String dt = null;
                int st=0;
                
                
                    try {
                         gh=   managerBusiness.find(PlotNumber).getBusinessType();
                    } catch (SQLException ex) {
                        Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                         cv=   managerBusiness.find(PlotNumber).getLevelBusinees();
                    } catch (SQLException ex) {
                        Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                         dt=      managerBusiness.find(PlotNumber).getBusinessLevelNowStartDate();
                    } catch (SQLException ex) {
                        Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                         st= managerBusiness.find(PlotNumber).getBusineesNmbrStaff();
                    } catch (SQLException ex) {
                        Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                       business.setLevelBusinees(cv);
                       business.setBusinessLevelNowStartDate(dt);
                       business.setBusinessType(gh);
                       business.setBusineesNmbrStaff(st);
                       
                
                    try {
                        managerBusiness.update(business);
                    } catch (SQLException ex) {
                        Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
               
                
                }
      
                   
           }
   });
                
                
                hour.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              
              
             //  RegistarGUI g=new RegistarGUI();
            
                String str=JOptionPane.showInputDialog("Enter Money working Hour amount");
               
                
                
      
                   
           }
   });
                
                SellEstate.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              
              
             //  RegistarGUI g=new RegistarGUI();
            
             LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String currentDateAsString = currentDate.format(formatter);
        
        String type=null;
             
               try {
                   if(managerBusiness.find(PlotNumber).getBusinessType().equals("market"))
                   {
                       type="market";
                   }      } catch (SQLException ex) {
                   Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
               }
                try {
                   if(managerBusiness.find(PlotNumber).getBusinessType().equals("emlak"))
                   {
                       type="emlak";
                   }      } catch (SQLException ex) {
                   Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
               }
                 try {
                   if(managerBusiness.find(PlotNumber).getBusinessType().equals("magaza"))
                   {
                       type="magaza";
                   }      } catch (SQLException ex) {
                   Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
               }
                 try {
                   if(managerPlot.find(PlotNumber).getKindofPlot().equals("arsa"))
                   {
                       type="arsa";
                   }      } catch (SQLException ex) {
                   Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
               }
        
        
        
                String str=JOptionPane.showInputDialog("Enter Price for Estate");
                if(str!=null)
                {
                     int Sell=Integer.valueOf(str);
                
                     sales.setPlotNo(PlotNumber);
                     sales.setBusineesPrice(Sell);
                     sales.setSaleDate(currentDateAsString);
                     sales.setTradedEstate(type);
                     
                     
                 try {
                     managersales.insert(sales);
                 } catch (SQLException ex) {
                     Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
                 }
                    
              
                }
      
                   
           }
   });
                
                
                rentestate2.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              
              
             //  RegistarGUI g=new RegistarGUI();
             LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String currentDateAsString = currentDate.format(formatter);
        
        String type=null;
             
               try {
                   if(managerBusiness.find(PlotNumber).getBusinessType().equals("market"))
                   {
                       type="market";
                   }      } catch (SQLException ex) {
                   Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
               }
                try {
                   if(managerBusiness.find(PlotNumber).getBusinessType().equals("emlak"))
                   {
                       type="emlak";
                   }      } catch (SQLException ex) {
                   Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
               }
                 try {
                   if(managerBusiness.find(PlotNumber).getBusinessType().equals("magaza"))
                   {
                       type="magaza";
                   }      } catch (SQLException ex) {
                   Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
               }
                 
        
        
        
                String str=JOptionPane.showInputDialog("Enter Rental Price for Estate");
                if(str!=null)
                {
                   
                  
                          DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String currentDateAsString2 = LocalDate.now().plusDays(30).format(formatter2);
                     int Sell=Integer.valueOf(str);
                
                     rental.setPlotNo(PlotNumber);
                     rental.setRentalBusineesPrice(Sell);
                    rental.setLeaseStartDate(currentDateAsString);
                    rental.setTradedEstate(type);
                    rental.setRentalTime(30);
                    rental.setLeaseEndDate(currentDateAsString2);
                 try {
                     managerrental.insert(rental);
                 } catch (SQLException ex) {
                     Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
                 }
                     
                     
                
                    
              
                }
                
      
                   
           }
   });
                
                
                    
                    
                    
                if(str.equals("HÜLYA"))
                {
                    
                }
                
                }
                        
                                 
                        }
                    }
       
                cestateman.add(SetThingSellPrice);
                cestateman.add(hour);
                cestateman.add(money);
                cestateman.add(SellEstate);
                cestateman.add(rentestate2);
   }
      
      
      
    public void estateFrame()
    {
        
        estatec.setLayout(null);
        estatec.setBackground(brown);
        estateframe.setBounds(900,0, 500, 850);
      
        estateframe.setResizable(false);
        estatec.setVisible(true);
        estateframe.setVisible(true);
        
        rentestate.setBounds(150, 500, 200,100);
        rentestate.setFont(font3);
        workestate.setBounds(150,100,200,100);
        buyestate.setBounds(150,300,200,100);
        
        SetBusiness.setBounds(150,700,200, 100);
        SetBusiness.setFont(font3);
        workestate.setFont(font3);
        buyestate.setFont(font3);
        
        
        
         SetBusiness.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              
              
             //  RegistarGUI g=new RegistarGUI();
            
                String str=JOptionPane.showInputDialog("Which Plot no would you like to set up business");
                Integer number3 = Integer.valueOf(str);
                if(str!=null)
                {
                    
                    try {
                        if(managerPlot.find(number3).getKindofPlot().equals("arsa"))
                        {
                            String asd=manageruser.find(userNo).getUserName();
                            if(managerPlot.find(number3).getPlotOwner().equals(asd))
                            {
                                
                                
                                String str5=JOptionPane.showInputDialog("Which Business Type would you like to set up 1-)Estate,2-)Grocery,3-)Clothing");
                                Integer number5 = Integer.valueOf(str5);
                                if(str5!=null)
                                {
                                     LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String currentDateAsString = currentDate.format(formatter);
        
                                
                                    
                                if(number5==1)
                                {
                                  int q=  managerPlot.find(number3).getPlotSize();
                                    plot.setPlotNo(number3);
                                    plot.setPlotOwner(asd);
                                    plot.setPlotSize(q);
                                    plot.setKindofPlot("isletme");
                                    managerPlot.update(plot);
                                   
                                    business.setPlotNo(number3);
                                    business.setLevelBusinees(1);
                                    business.setBusinessType("emlak");
                                    business.setBusinessLevelNowStartDate(currentDateAsString);
                                    business.setBusineesNmbrStaff(0);
                                     business.setManagerOperatingFee(400);
                                      business.setUserOperatingFee(300);
                                    managerBusiness.insert(business);
                                    
                                    
                                }
                                if(number5==2)
                                {
                                     int q=  managerPlot.find(number3).getPlotSize();
                                    plot.setPlotNo(number3);
                                    plot.setPlotOwner(asd);
                                    plot.setPlotSize(q);
                                    plot.setKindofPlot("isletme");
                                    managerPlot.update(plot);
                                    
                                   business.setPlotNo(number3);
                                    business.setLevelBusinees(1);
                                    business.setBusinessType("market");
                                    business.setBusinessLevelNowStartDate(currentDateAsString);
                                    business.setBusineesNmbrStaff(0);
                                     business.setManagerOperatingFee(400);
                                      business.setUserOperatingFee(300);
                                   
                                    managerBusiness.insert(business);
                                    
                                    
                                }
                                if(number5==3)
                                {
                                     int q=  managerPlot.find(number3).getPlotSize();
                                    plot.setPlotNo(number3);
                                    plot.setPlotOwner(asd);
                                    plot.setPlotSize(q);
                                    plot.setKindofPlot("isletme");
                                    managerPlot.update(plot);
                                    
                                    
                                    business.setPlotNo(number3);
                                    business.setLevelBusinees(1);
                                    business.setBusinessType("magaza");
                                    business.setBusinessLevelNowStartDate(currentDateAsString);
                                    business.setBusineesNmbrStaff(0);
                                     business.setManagerOperatingFee(400);
                                      business.setUserOperatingFee(300);
                                   
                                    managerBusiness.insert(business);
                                    
                                }
                                }
                                
                            }
                            
                        }   } catch (SQLException ex) {
                        Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                
                }
      
                   
           }
   });
        
        
        
        
        
        
        
        
        
        
        
        rentestate.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              
              
             //  RegistarGUI g=new RegistarGUI();
            
                 String str=JOptionPane.showInputDialog("Which real estate agent would you like to trade with?");
                if(str!=null)
                {
                    Integer number = Integer.valueOf(str);
                
                     try {
                         if(managerBusiness.find(number).getBusinessType().equals("emlak"))
                         {
                             
                             
                             String str2=JOptionPane.showInputDialog("Which Plot no would you like to rent?");
                             
                           Integer number2 = Integer.valueOf(str2);
                           
                             if(str2!=null)
                             {
                                
                                 
                                
                                 if(managerPlot.find(number2).getKindofPlot().equals("isletme"))
                                 {
                                     if(number!=0)
                                     {
                                     
                                     
                                      int PriceEstate= managerrental.find(number2).getRentalBusineesPrice()+managerestateTrans.find(number).getEstateCommission();
                                     String s=Integer.toString(PriceEstate);
                                     JOptionPane.showMessageDialog(panel,"This Plots Rental Price: "+s,"MY İNFORMATİON",JOptionPane.INFORMATION_MESSAGE);
                                         
                                         
                                         
                                         int sel=JOptionPane.showConfirmDialog(panel,"Do you want to Rent İt","RENT",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                                     
                                         
                                          if(sel==JOptionPane.YES_OPTION)
                                          {
                                    
                                           
                                  
                                              if(managerUserGameInfo.find(userNo).getAmountofUserMoney()>=PriceEstate)
                                              {
                                                  
                                            String name=  managerPlot.find(number2).getPlotOwner();
                                            int NO=0;
                                          for(User u:manageruser.list())
                                          {
                                              if(u.getUserName().equals(name))
                                              {
                                                NO=  u.getUserNo();//eski sahibinin NO su
                                                break;
                                              }
                                          }
                                 /*                     
                                  Plot p=   managerPlot.find(number2);
                                String r=  manageruser.find(userNo).getUserName();
                                  p.setPlotOwner(r);
                                  managerPlot.update(p);
                                  //alan kişi sahip yapılır
                                  */
                                  
                                UserGameInformation h=  managerUserGameInfo.find(userNo);
                              int moneyh=  h.getAmountofUserMoney();
                             int gh= moneyh-PriceEstate;
                             //alan kişinin parası azalır
                              h.setAmountofUserMoney(gh);
                              managerUserGameInfo.update(h);
                              
                              //ESKİ SAHİBİNE PARASI EKLENİR
                          UserGameInformation NOh= managerUserGameInfo.find(NO);
                         int moneyk= NOh.getAmountofUserMoney();
                       int Last=  moneyk+managerrental.find(number2).getRentalBusineesPrice();
                       NOh.setAmountofUserMoney(Last);
                       managerUserGameInfo.update(NOh);
                             
                                              }
                                              else
                                              {
                                                  JOptionPane.showMessageDialog(panel,"You Dont Have Enough Money","MY WARNİNG",JOptionPane.WARNING_MESSAGE);
                                              }
                                          }
                                     
                                 }
                                 }
                                 
                                 
                                 
                                 
                             }
                             
                             
                             
                         }  
                     } catch (SQLException ex) {
                         Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
                     }
                
                }
                
      
                   
           }
   });
        
        
        
         buyestate.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              
              
             //  RegistarGUI g=new RegistarGUI();
            
                 String str=JOptionPane.showInputDialog("Which real estate agent would you like to trade with?");
                if(str!=null)
                {
                    
                Integer number = Integer.valueOf(str);
                     try {
                         if(managerBusiness.find(number).getBusinessType().equals("emlak"))
                         {
                             
                             String str2=JOptionPane.showInputDialog("Which Plot no would you like to buy ?");
                             
                             Integer number2 = Integer.valueOf(str2);
                             if(str2!=null)
                             {
                                 if(managerPlot.find(number2).getKindofPlot().equals("arsa"))
                                 {
                                     System.out.println("skdksl");
                                     if(managerPlot.find(number2).getPlotOwner().equals("yonetici"))
                                     {
                                         System.out.println("vvvvvvvvvvvvvvv");
                                         JOptionPane.showMessageDialog(panel,"This Plots Price: 600","MY İNFORMATİON",JOptionPane.INFORMATION_MESSAGE);
                                         
                                         
                                         
                                         int sel=JOptionPane.showConfirmDialog(panel,"Do you want to Buy İt","BUY",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(sel==JOptionPane.YES_OPTION)
                {
                   if(managerUserGameInfo.find(userNo).getAmountofUserMoney()>=600)
                   {
                       
                     String r=  manageruser.find(userNo).getUserName();
                       
                    int zx= managerPlot.find(number2).getPlotSize();
                     plot.setKindofPlot("arsa");
                     plot.setPlotSize(zx);
                     plot.setPlotNo(number2);
                     plot.setPlotOwner(r);
                     managerPlot.update(plot);
                     //---------------------------------
                     //PARA MİKTARINI GÜNCELLEME
                     usergameınfo.setUserNo(userNo);
                    int mk=managerUserGameInfo.find(userNo).getAmountofUserMoney();
                    mk=mk-600;
                            
                    usergameınfo.setAmountofUserMoney(mk);
                    
                  int goodmk=managerUserGameInfo.find(userNo).getAmountofUserGoods();
                    
                    usergameınfo.setAmountofUserGoods(goodmk);
                    
                    int foodmk=managerUserGameInfo.find(userNo).getAmountofUserFood();
                            
                            usergameınfo.setAmountofUserFood(foodmk);
                            
                            managerUserGameInfo.update(usergameınfo);
                     
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(panel,"You Dont Have Enough Money","MY WARNİNG",JOptionPane.WARNING_MESSAGE);
                       
                   }
                       
                }
                if(sel==JOptionPane.NO_OPTION)
                {
                    
                }
                if(sel==JOptionPane.CANCEL_OPTION)
                {
                    
                }
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                     }
                                 }
                                 
                                 if(managerPlot.find(number2).getKindofPlot().equals("isletme"))
                                 {
                                     
                                     if(number!=0)
                                     {
                                         
                                     int PriceEstate= managersales.find(number2).getBusineesPrice()+managerestateTrans.find(number).getEstateCommission();
                                     String s=Integer.toString(PriceEstate);
                                     JOptionPane.showMessageDialog(panel,"This Plots Price: "+s,"MY İNFORMATİON",JOptionPane.INFORMATION_MESSAGE);
                                         
                                         
                                         
                                         int sel=JOptionPane.showConfirmDialog(panel,"Do you want to Buy İt","BUY",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                                     
                                         
                                          if(sel==JOptionPane.YES_OPTION)
                                          {
                                    
                                           
                                  
                                              if(managerUserGameInfo.find(userNo).getAmountofUserMoney()>=PriceEstate)
                                              {
                                                  
                                            String name=  managerPlot.find(number2).getPlotOwner();
                                            int NO=0;
                                          for(User u:manageruser.list())
                                          {
                                              if(u.getUserName().equals(name))
                                              {
                                                NO=  u.getUserNo();//eski sahibinin NO su
                                                break;
                                              }
                                          }
                                                      
                                  Plot p=   managerPlot.find(number2);
                                String r=  manageruser.find(userNo).getUserName();
                                  p.setPlotOwner(r);
                                  managerPlot.update(p);
                                  //alan kişi sahip yapılır
                                  
                                  
                                UserGameInformation h=  managerUserGameInfo.find(userNo);
                              int moneyh=  h.getAmountofUserMoney();
                             int gh= moneyh-PriceEstate;
                             //alan kişinin parası azalır
                              h.setAmountofUserMoney(gh);
                              managerUserGameInfo.update(h);
                              
                              //ESKİ SAHİBİNE PARASI EKLENİR
                          UserGameInformation NOh= managerUserGameInfo.find(NO);
                         int moneyk= NOh.getAmountofUserMoney();
                       int Last=  moneyk+managersales.find(number2).getBusineesPrice();
                       NOh.setAmountofUserMoney(Last);
                       managerUserGameInfo.update(NOh);
                             
                                              }
                                              else
                                              {
                                                  JOptionPane.showMessageDialog(panel,"You Dont Have Enough Money","MY WARNİNG",JOptionPane.WARNING_MESSAGE);
                                              }
                                          }
                                     }
                                       if(number==0)
                                       {
                                        
                                           int PriceEstate2= managersales.find(number2).getBusineesPrice()+600;
                                     String s2=Integer.toString(PriceEstate2);
                                     JOptionPane.showMessageDialog(panel,"This Plots Price: "+s2,"MY İNFORMATİON",JOptionPane.INFORMATION_MESSAGE);
                                         
                                         
                                         
                                         int sel2=JOptionPane.showConfirmDialog(panel,"Do you want to Buy İt","BUY",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                                     
                                         
                                           if(sel2==JOptionPane.YES_OPTION)
                                          {
                                    
                                           
                                  
                                              if(managerUserGameInfo.find(userNo).getAmountofUserMoney()>=PriceEstate2)
                                              {
                                                  
                                            String name=  managerPlot.find(number2).getPlotOwner();
                                            int NO=0;
                                          for(User u:manageruser.list())
                                          {
                                              if(u.getUserName().equals(name))
                                              {
                                                NO=  u.getUserNo();//eski sahibinin NO su
                                                break;
                                              }
                                          }
                                                      
                                  Plot p=   managerPlot.find(number2);
                                String r=  manageruser.find(userNo).getUserName();
                                  p.setPlotOwner(r);
                                  managerPlot.update(p);
                                  //alan kişi sahip yapılır
                                  
                                  
                                UserGameInformation h=  managerUserGameInfo.find(userNo);
                              int moneyh=  h.getAmountofUserMoney();
                             int gh= moneyh-PriceEstate2;
                             //alan kişinin parası azalır
                              h.setAmountofUserMoney(gh);
                              managerUserGameInfo.update(h);
                              
                              //ESKİ SAHİBİNE PARASI EKLENİR
                          UserGameInformation NOh= managerUserGameInfo.find(NO);
                         int moneyk= NOh.getAmountofUserMoney();
                       int Last=  moneyk+managersales.find(number2).getBusineesPrice();
                       NOh.setAmountofUserMoney(Last);
                       managerUserGameInfo.update(NOh);
                             
                                              }
                                              else
                                              {
                                                  JOptionPane.showMessageDialog(panel,"You Dont Have Enough Money","MY WARNİNG",JOptionPane.WARNING_MESSAGE);
                                              }
                                              
                                              
                                       
                                              
                                          }
                                           
                                           
                                           
                                       }
                                          
                                      
                                  
                                  
                                 }
                                 if(managerPlot.find(number2).getKindofPlot().equals("arsa"))
                                 {
                                     
                                     if(!managerPlot.find(number2).getPlotOwner().equals("yonetici"))
                                     {
                                         
                                         
                                         int PriceEstate= managersales.find(number2).getBusineesPrice()+managerestateTrans.find(number).getEstateCommission();
                                     String s=Integer.toString(PriceEstate);
                                     JOptionPane.showMessageDialog(panel,"This Plots Price: "+s,"MY İNFORMATİON",JOptionPane.INFORMATION_MESSAGE);
                                         
                                         
                                         
                                         int sel=JOptionPane.showConfirmDialog(panel,"Do you want to Buy İt","BUY",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                                     
                                         
                                          if(sel==JOptionPane.YES_OPTION)
                                          {
                                    
                                           
                                  
                                              if(managerUserGameInfo.find(userNo).getAmountofUserMoney()>=PriceEstate)
                                              {
                                                  
                                            String name=  managerPlot.find(number2).getPlotOwner();
                                            int NO=0;
                                          for(User u:manageruser.list())
                                          {
                                              if(u.getUserName().equals(name))
                                              {
                                                NO=  u.getUserNo();//eski sahibinin NO su
                                                break;
                                              }
                                          }
                                                      
                                  Plot p=   managerPlot.find(number2);
                                String r=  manageruser.find(userNo).getUserName();
                                  p.setPlotOwner(r);
                                  managerPlot.update(p);
                                  //alan kişi sahip yapılır
                                  
                                  
                                UserGameInformation h=  managerUserGameInfo.find(userNo);
                              int moneyh=  h.getAmountofUserMoney();
                             int gh= moneyh-PriceEstate;
                             //alan kişinin parası azalır
                              h.setAmountofUserMoney(gh);
                              managerUserGameInfo.update(h);
                              
                              //ESKİ SAHİBİNE PARASI EKLENİR
                          UserGameInformation NOh= managerUserGameInfo.find(NO);
                         int moneyk= NOh.getAmountofUserMoney();
                       int Last=  moneyk+managersales.find(number2).getBusineesPrice();
                       NOh.setAmountofUserMoney(Last);
                       managerUserGameInfo.update(NOh);
                       
                     
                           
                             
                                              }
                                              else
                                              {
                                                  JOptionPane.showMessageDialog(panel,"You Dont Have Enough Money","MY WARNİNG",JOptionPane.WARNING_MESSAGE);
                                              }
                                             
                                          }
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                     }
                                 }
                                 
                                 
                                 
                             }
                             
                         }  
                     } catch (SQLException ex) {
                         Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
                     }
                
                
                }
                
      
                   
           }
   });
        
        
         workestate.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              
              
             //  RegistarGUI g=new RegistarGUI();
            
                 String str=JOptionPane.showInputDialog("Enter Estate Agent plot no that you want to work");
                if(str!=null)
                {
                    
                 Integer number = Integer.valueOf(str);
                try {
                         Saveworkingplace(number);
                     } catch (SQLException ex) {
                         Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
                     }
                
                
                }
                
      
                   
           }
   });
        
        
        
        
        estatec.add(workestate);
        estatec.add(buyestate);
        estatec.add(rentestate);
        estatec.add(SetBusiness);
        
    }
    public void groceryFrame()
    {
         groceryc.setLayout(null);
        groceryc.setBackground(brown);
        groceryframe.setBounds(900,0, 500, 700);
       
        groceryframe.setResizable(false);
        groceryc.setVisible(true);
        groceryframe.setVisible(true);
        
        
        workgrocery.setBounds(150,100,200,100);
        buygrocery.setBounds(150,300,200,100);
        workgrocery.setFont(font3);
        buygrocery.setFont(font3);
        
        
        
         workgrocery.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              
              
             //  RegistarGUI g=new RegistarGUI();
            
                 String str=JOptionPane.showInputDialog("Enter grocery plot no that you want to work");
                if(str!=null)
                {
                    Integer number = Integer.valueOf(str);
                try {
                         Saveworkingplace(number);
                     } catch (SQLException ex) {
                         Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
                     }
                
                
                }
                
      
                   
           }
   });
        
        
        
          buygrocery.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              
              
             //  RegistarGUI g=new RegistarGUI();
            
                 String str=JOptionPane.showInputDialog("Enter grocery plot no that you want to buy food");
                if(str!=null)
                {
                    
                int m=  Integer.parseInt(str); 
                     try {
                         buyFood(m);
                     } catch (SQLException ex) {
                         Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
                     }
                
                }
                
      
                   
           }
   });
        
        
        
        
        
        
        
        
        groceryc.add(workgrocery);
        groceryc.add(buygrocery);
    }
    public void goodsFrame()
    {
        
        goodsc.setLayout(null);
        goodsc.setBackground(brown);
        goodsframe.setBounds(900,0, 500, 700);
       
        goodsframe.setResizable(false);
        goodsc.setVisible(true);
        goodsframe.setVisible(true);
        
        workgoods.setBounds(150,100,200,100);
        buygoods.setBounds(150,300,200,100);
        workgoods.setFont(font3);
        buygoods.setFont(font3);
        
        
        
         workgoods.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              
              
             //  RegistarGUI g=new RegistarGUI();
            
                 String str=JOptionPane.showInputDialog("Enter Clothing House plot no that you want to work");
                if(str!=null)
                {
                    Integer number = Integer.valueOf(str);
                    
                     try {
                         Saveworkingplace(number);
                     } catch (SQLException ex) {
                         Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
                     }
                
                
                
                }
                
      
                   
           }
   });
        
        
        
         buygoods.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
              
              
             //  RegistarGUI g=new RegistarGUI();
            
                 String str=JOptionPane.showInputDialog("Enter Clothing House plot no that you want to buy goods");
                if(str!=null)
                {
                    
              int m=  Integer.parseInt(str);  
                     try {
                         buyGoods(m);
                     } catch (SQLException ex) {
                         Logger.getLogger(PlayingFieldGUI.class.getName()).log(Level.SEVERE, null, ex);
                     }
                
                }
                
      
                   
           }
   });
        
        
        
        
        
        
        
        
        
        
        
        goodsc.add(workgoods);
        goodsc.add(buygoods);
    }
    
   
    public void SaveBusinessInfo() throws SQLException
    {
       
        buton[0].setIcon(icon2);
        buton[2].setIcon(icon3);
        buton[4].setIcon(icon4);
        
     int v=   managerBusiness.find(0).getPlotNo();
           int u=     managerBusiness.find(2).getPlotNo();
                 int k=       managerBusiness.find(4).getPlotNo();
        
          
         managerBusiness.delete(v);
      
            managerBusiness.delete(u);
             managerBusiness.delete(k);
       
        
        
        for(Plot x:managerPlot.list())
        {
           if(x.getPlotNo()==0)
           {
               business.setPlotNo(0);
               business.setUserOperatingFee(300);
               business.setManagerOperatingFee(400);
               business.setBusinessType("emlak");
               business.setLevelBusinees(1);
               business.setBusineesNmbrStaff(1000);
               business.setBusinessLevelNowStartDate("20-05-2023");
               managerBusiness.insert(business);
               
           }
           
           if(x.getPlotNo()==2)
           {
               business.setPlotNo(2);
               business.setUserOperatingFee(300);
               business.setManagerOperatingFee(400);
               business.setBusinessType("market");
               business.setLevelBusinees(1);
               business.setBusineesNmbrStaff(1000);
               business.setBusinessLevelNowStartDate("20-05-2023");
                managerBusiness.insert(business);
               
           }
           if(x.getPlotNo()==4)
           {
               business.setPlotNo(4);
               business.setUserOperatingFee(300);
               business.setManagerOperatingFee(400);
               business.setBusinessType("magaza");
               business.setLevelBusinees(1);
               business.setBusineesNmbrStaff(1000);
               business.setBusinessLevelNowStartDate("20-05-2023");
                managerBusiness.insert(business);
               
           }
           
        }
        
        
      
    }
    public void quitejob() throws SQLException
    {
        
        managerwork.delete(userNo);
    }
    public void Saveworkingplace(int getcontenttengelen) throws SQLException//her çalış butonuna basınca oraya ekle
    {
      int level=  managerBusiness.find(getcontenttengelen).getLevelBusinees();
        
                int s=    managerBusiness.find(getcontenttengelen).getBusineesNmbrStaff();
                   
                    if(s<(3*level))
                    {
                        work.setUserNo(userNo);
        work.setPlotNo(getcontenttengelen);
        managerwork.insert(work);
        
        s++;
                    BusinessInformation m=    managerBusiness.find(getcontenttengelen);
                    m.setBusineesNmbrStaff(s);
                    
                        managerBusiness.update(m);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(panel,"Working Capasity is Full","MY WARNİNG",JOptionPane.WARNING_MESSAGE);
                    }
                     
                    
               
        
        
        
        
    }
    public void working(int userNo) throws SQLException
    {
        int h=0;
        try
        {
             int workingplace = managerwork.find(userNo).getPlotNo();
       h=  managerBusiness.find(0).getManagerOperatingFee();
        long daysbetween= date.SubstractionDate(userNo);
        
        String s=Integer.toString(managerwork.find(userNo).getPlotNo());
      job.setBounds(900, 600, 50, 50);
      job.setText(s);
      panel.add(job);
     for(BusinessInformation c:managerBusiness.list())
     {
         if(c.getPlotNo()==workingplace)
         {
             if(c.getBusinessType().equals("emlak"))
             {
                 int money=(managerUserGameInfo.find(userNo).getAmountofUserMoney())+((managerdailey.find(1).getDailyMoneyExpanse())*((int)daysbetween))+((h)*((int)daysbetween));
                  int food=(managerUserGameInfo.find(userNo).getAmountofUserFood());
                  int goods=(managerUserGameInfo.find(userNo).getAmountofUserGoods());
                  
                   
                    usergameınfo.setUserNo(userNo);
      usergameınfo.setAmountofUserFood(food);
      usergameınfo.setAmountofUserMoney(money);
      usergameınfo.setAmountofUserGoods(goods);
      managerUserGameInfo.update(usergameınfo); 
             }
             if(c.getBusinessType().equals("magaza"))
             {
                 int goods=(managerUserGameInfo.find(userNo).getAmountofUserGoods())+((managerdailey.find(1).getDailyGoodsExpanse())*((int)daysbetween));
                 
                  int money=(managerUserGameInfo.find(userNo).getAmountofUserMoney())+((h)*((int)daysbetween));
                  int food=(managerUserGameInfo.find(userNo).getAmountofUserFood());
                 
                  
                    usergameınfo.setUserNo(userNo);
      usergameınfo.setAmountofUserFood(food);
      usergameınfo.setAmountofUserMoney(money);
      usergameınfo.setAmountofUserGoods(goods);
      managerUserGameInfo.update(usergameınfo); 
             }
             if(c.getBusinessType().equals("market"))
             {
                 int food=(managerUserGameInfo.find(userNo).getAmountofUserFood())+((managerdailey.find(1).getDailyFoodExpanse())*((int)daysbetween));
                 
                  int money=(managerUserGameInfo.find(userNo).getAmountofUserMoney())+((h)*((int)daysbetween));
                
                  int goods=(managerUserGameInfo.find(userNo).getAmountofUserGoods());
                  
                   
                    usergameınfo.setUserNo(userNo);
      usergameınfo.setAmountofUserFood(food);
      usergameınfo.setAmountofUserMoney(money);
      usergameınfo.setAmountofUserGoods(goods);
      managerUserGameInfo.update(usergameınfo); 
             }
            
         }
         
         
         
         
        
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
     }
      
            
        }
        catch(java.lang.NullPointerException ex)
        {
            System.out.println("girilen kisi çalışmıyor");
        }
      
      
        
        
    }
    
        public void BuyEstate()
         {
             
         }
        
         public void workingSpeed(int userNo,String str) throws SQLException
    {
        int h=0;
        try
        {
             int workingplace = managerwork.find(userNo).getPlotNo();
       h=  managerBusiness.find(0).getManagerOperatingFee();
       int daysbetween=    (int) abs(date.SubstractionDateSpeed(str));
        
        String s=Integer.toString(managerwork.find(userNo).getPlotNo());
      job.setBounds(900, 600, 50, 50);
      job.setText(s);
      panel.add(job);
     for(BusinessInformation c:managerBusiness.list())
     {
         if(c.getPlotNo()==workingplace)
         {
             if(c.getBusinessType().equals("emlak"))
             {
                 int money=(managerUserGameInfo.find(userNo).getAmountofUserMoney())+((managerdailey.find(1).getDailyMoneyExpanse())*(daysbetween))+((h)*(daysbetween));
                  int food=(managerUserGameInfo.find(userNo).getAmountofUserFood());
                  int goods=(managerUserGameInfo.find(userNo).getAmountofUserGoods());
                  
                   
                    usergameınfo.setUserNo(userNo);
      usergameınfo.setAmountofUserFood(food);
      usergameınfo.setAmountofUserMoney(money);
      usergameınfo.setAmountofUserGoods(goods);
      managerUserGameInfo.update(usergameınfo); 
             }
             if(c.getBusinessType().equals("magaza"))
             {
                 int goods=(managerUserGameInfo.find(userNo).getAmountofUserGoods())+((managerdailey.find(1).getDailyGoodsExpanse())*(daysbetween));
                 
                  int money=(managerUserGameInfo.find(userNo).getAmountofUserMoney())+((h)*(daysbetween));
                  int food=(managerUserGameInfo.find(userNo).getAmountofUserFood());
                 
                  
                    usergameınfo.setUserNo(userNo);
      usergameınfo.setAmountofUserFood(food);
      usergameınfo.setAmountofUserMoney(money);
      usergameınfo.setAmountofUserGoods(goods);
      managerUserGameInfo.update(usergameınfo); 
             }
             if(c.getBusinessType().equals("market"))
             {
                 int food=(managerUserGameInfo.find(userNo).getAmountofUserFood())+((managerdailey.find(1).getDailyFoodExpanse())*(daysbetween));
                 
                  int money=(managerUserGameInfo.find(userNo).getAmountofUserMoney())+((h)*(daysbetween));
                
                  int goods=(managerUserGameInfo.find(userNo).getAmountofUserGoods());
                  
                   
                    usergameınfo.setUserNo(userNo);
      usergameınfo.setAmountofUserFood(food);
      usergameınfo.setAmountofUserMoney(money);
      usergameınfo.setAmountofUserGoods(goods);
      managerUserGameInfo.update(usergameınfo); 
             }
            
         }
         
         
         
         
        
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
     }
      
            
        }
        catch(java.lang.NullPointerException ex)
        {
            System.out.println("girilen kisi çalışmıyor");
        }
      
      
        
        
    }
    
         
         public void Money() throws SQLException
         {
             
             
            int b= managerUserGameInfo.find(userNo).getAmountofUserMoney();
             
            String s=Integer.toString(b);
            
            moneyLabel.setText(s);
            moneyLabel.setForeground(Color.red);
            moneyLabel.setBounds(1200, 450, 200, 50);
            moneyLabel.setFont(font5);
            panel.add(moneyLabel);
                    
             
         }
         public void Food() throws SQLException
         {
           int b=   managerUserGameInfo.find(userNo).getAmountofUserFood();
              
              String s=Integer.toString(b);
            
            foodLabel.setText(s);
            foodLabel.setForeground(Color.red);
            foodLabel.setBounds(1200, 250, 200, 50);
            foodLabel.setFont(font5);
            panel.add(foodLabel);
         }
         public void Goods() throws SQLException
         {
            int b=  managerUserGameInfo.find(userNo).getAmountofUserGoods();
              
              String s=Integer.toString(b);
            
            goodsLabel.setText(s);
            goodsLabel.setForeground(Color.red);
            goodsLabel.setBounds(1200, 50, 200, 50);
            goodsLabel.setFont(font5);
            panel.add(goodsLabel);
         }
         
         public void buyGoods(int id) throws SQLException
         {
           int p=  managerUserGameInfo.find(userNo).getAmountofUserMoney();
           if(managerBusiness.find(id).getBusinessType().equals("magaza"))
           {
             int v= p-(managerBusinessIncome.find(id).getClothingGoodPrice());
             
           
            usergameınfo.setAmountofUserMoney(v);
            
          int z=  managerUserGameInfo.find(userNo).getAmountofUserGoods()+200;
         usergameınfo.setAmountofUserGoods(z);
          
          usergameınfo.setUserNo(userNo);
          
         int y= managerUserGameInfo.find(userNo).getAmountofUserFood();
         usergameınfo.setAmountofUserFood(y);
         
         managerUserGameInfo.update(usergameınfo);
         
         
         if(!(id==0||id==2||id==4))
         {
             
         
         
          for(User u:manageruser.list())
         {
             if(u.getUserName().equals(managerPlot.find(id).getPlotOwner()))
             {
              int mon=   managerUserGameInfo.find(u.getUserNo()).getAmountofUserMoney();
             int total= mon+managerBusinessIncome.find(id).getClothingGoodPrice();
             
            UserGameInformation us= managerUserGameInfo.find(u.getUserNo());
            us.setAmountofUserMoney(total);
            managerUserGameInfo.update(us);
            break;
             }
         }
         
         }
           }
           
           
         }
         
         
         
         public void buyFood(int id) throws SQLException
         {
           int p=  managerUserGameInfo.find(userNo).getAmountofUserMoney();
           if(managerBusiness.find(id).getBusinessType().equals("market"))
           {
             int v= p-(managerBusinessIncome.find(id).getMarketFoodPrice());
             
           
            usergameınfo.setAmountofUserMoney(v);
            
          int z=  managerUserGameInfo.find(userNo).getAmountofUserFood()+200;
         usergameınfo.setAmountofUserFood(z);
          
          usergameınfo.setUserNo(userNo);
          
         int y= managerUserGameInfo.find(userNo).getAmountofUserGoods();
         usergameınfo.setAmountofUserGoods(y);
         
         managerUserGameInfo.update(usergameınfo);
         
         if(!(id==0||id==2||id==4))
                 {
                     
                 
         for(User u:manageruser.list())
         {
             if(u.getUserName().equals(managerPlot.find(id).getPlotOwner()))
             {
              int mon=   managerUserGameInfo.find(u.getUserNo()).getAmountofUserMoney();
             int total= mon+managerBusinessIncome.find(id).getMarketFoodPrice();
             
            UserGameInformation us= managerUserGameInfo.find(u.getUserNo());
            us.setAmountofUserMoney(total);
            managerUserGameInfo.update(us);
            break;
             }
         }
         
                 }
         
         
         
         
           }
           
           
         }
         
         public void loser() throws SQLException
         {
             
           if(managerUserGameInfo.find(userNo).getAmountofUserMoney()<0||managerUserGameInfo.find(userNo).getAmountofUserGoods()<0||managerUserGameInfo.find(userNo).getAmountofUserFood()<0)
           {
               JOptionPane.showMessageDialog(panel,"You Have Lost the Game","Loser",JOptionPane.WARNING_MESSAGE);
           }
               
         }
         
         
         public void MyEstates() throws SQLException
         {
             
              butonMyEstate=new JButton[100];
      int bn=900;
      int i=0;
     for(Plot cv: managerPlot.list())
     {
        String str= manageruser.find(userNo).getUserName();
        
         if(cv.getPlotOwner().equals(str))
         {
             
         
          butonMyEstate[i]=new JButton();
          
           butonMyEstate[i].setSize(50,50);
       butonMyEstate[i].setLocation(bn,500);
       
      String s= Integer.toString(cv.getPlotNo());
       butonMyEstate[i].setText(s);
       
        panel.add(butonMyEstate[i]);
       bn=bn+60;
       i++;
         }
     }
      
     
             
             
         }
         
         public void showBusiness() throws SQLException
         {
             
             
            for(BusinessInformation ml: managerBusiness.list())
            {
               int b=ml.getPlotNo();
               System.out.print("ldfdk"+b);
                if(ml.getBusinessType().equals("market"))
                {
                    buton[b].setIcon(icon3);
                    
                }
                 if(ml.getBusinessType().equals("emlak"))
                {
                    buton[b].setIcon(icon2);
                    System.out.print("çslcmdkxmcçfmxö ");
                    
                }
                  if(ml.getBusinessType().equals("magaza"))
                {
                     buton[b].setIcon(icon4);
                }
                
               
                
               
              
                 
            }
            
         }
         
         public void DaileyBusinessIncome(String str) throws SQLException
         {
          int x=  (int)date.SubstractionDateSpeed(str);
       
     for (Plot n:managerPlot.list())
     {
        if(n.getKindofPlot().equals("isletme"))
        {
            for(User bu:manageruser.list())
            {
                try
                {
                    
                
                        if( bu.getUserName().equals(n.getPlotOwner()))
                        {
                             UserGameInformation use=   managerUserGameInfo.find(bu.getUserNo());
      BusinessIncomeInfo  ıncome=managerBusinessIncome.find(n.getPlotNo());
      BusinessInformation b=managerBusiness.find(n.getPlotNo());
      
      
      int money=use.getAmountofUserMoney();
          
     int g= b.getLevelBusinees()*x*ıncome.getBusinessFixedIncomeAmount();
     
    int total= g+money;
    
    
          use.setAmountofUserMoney(total);
          
          managerUserGameInfo.update(use);
          
                        }
                }
                catch(java.lang.NullPointerException ex)
                {
                    
                }
            }
            
            
           
            
        }
     }
          
      
          
         }
                 
         public void IncreaseLevel(String str) throws SQLException
         {
             int x=  (int)date.SubstractionDateSpeed(str);
             
             
             
             for (Plot n:managerPlot.list())
     {
        if(n.getKindofPlot().equals("isletme"))
        {
            for(User bu:manageruser.list())
            {
                try
                {
                    
                
                        if( bu.getUserName().equals(n.getPlotOwner()))
                        {
                             UserGameInformation use=   managerUserGameInfo.find(bu.getUserNo());
      BusinessIncomeInfo  ıncome=managerBusinessIncome.find(n.getPlotNo());
      BusinessInformation b=managerBusiness.find(n.getPlotNo());
      
      
      
         
                 if(b.getBusineesNmbrStaff()==3||b.getBusineesNmbrStaff()==6||b.getBusineesNmbrStaff()==9)
                 {
                     if(x==7)
                     {
                      int le=  b.getLevelBusinees();
                      le++;
                      b.setLevelBusinees(le);
                      managerBusiness.update(b);
                     }
                 }
    
     
   
    
    
     
          
          
          
                        }
                }
                catch(java.lang.NullPointerException ex)
                {
                    
                }
            }
            
            
           
            
        }
     }
          
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
         }
}
