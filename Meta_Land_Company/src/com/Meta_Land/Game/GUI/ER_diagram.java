/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Meta_Land.Game.GUI;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author izemd
 */
public class ER_diagram extends JPanel{
    private JFrame frame=new JFrame();
    private Image ımage=new ImageIcon("C:\\Users\\izemd\\Pictures\\Screenshots\\Ekran Görüntüsü (96).png").getImage();
    
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawImage(ımage,0,0,1600,900,frame);
    }
    
}
