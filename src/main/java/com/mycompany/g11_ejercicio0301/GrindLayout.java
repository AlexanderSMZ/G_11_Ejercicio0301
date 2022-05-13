/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g11_ejercicio0301;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author alexa
 */
public class GrindLayout extends JFrame{
    
    private JPanel jPanel1;
    private List<JLabel> jLabelList;    
    
    public GrindLayout(String title) {
        super(title);
        this.setSize(300,150);
        this.setLocation(400,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }

    public void iniciarComponentes(){
        this.iniciarPanel();
        this.iniciarEtiquetas();
    }
   
    public void iniciarPanel(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setBackground(Color.GRAY);
        this.jPanel1.setLayout(new GridLayout(3,2));
    }  
    
   public void iniciarEtiquetas(){
       
       this.jLabelList = new ArrayList<>();
       for(var i=0;i<5;i++){
           this.jLabelList.add(new JLabel());
           this.jLabelList.get(i).setOpaque(true);
           this.jLabelList.get(i).setHorizontalAlignment(SwingConstants.CENTER);
           this.jLabelList.get(i).setBorder(BorderFactory.createTitledBorder(""));           
           
       }
       //this.jLabelList.add(new JLabel());
       //this.jLabelList.get(i).setOpaque(true);
       //this.jLabelList.get(0).setHorizontalAlignment(SwingConstants.CENTER);
       //this.jLabelList.get(0).setBorder(BorderFactory.createTitledBorder(""));       
       
       this.jLabelList.get(0).setBackground(Color.GRAY);
       this.jLabelList.get(0).setText("Button 1");
       
       
       this.jLabelList.get(1).setBackground(Color.GRAY);
       this.jLabelList.get(1).setText("2");      
      
       this.jLabelList.get(2).setBackground(Color.GRAY);
       this.jLabelList.get(2).setText("Button 3");      
       
       this.jLabelList.get(3).setBackground(Color.GRAY);
       this.jLabelList.get(3).setText("Long-Named Button 4");      
       
       this.jLabelList.get(4).setBackground(Color.GRAY);
       this.jLabelList.get(4).setText("Button 5");
       
       
       for(var a=0;a<5;a++)
           this.jPanel1.add(this.jLabelList.get(a));
       //this.jPanel1.add(this.jLabelList.get(1));
       
       
   }     
   
}
