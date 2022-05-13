/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g11_ejercicio0301;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author alexa
 */
public class Flow_Layout extends JFrame{
    
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    
   public Flow_Layout(String title) {
        super(title);
        this.setSize(400, 75);
        this.setLocation(200, 250);
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
       this.setLayout(new FlowLayout());
   }
   
   public void iniciarEtiquetas(){
       
       this.jLabelList = new ArrayList<>();
       
       for(var i=0;i<5;i++){
        this.jLabelList.add(new JLabel());
        this.jLabelList.get(i).setOpaque(true);  
        this.jPanel1.add(this.jLabelList.get(i));  
        this.jLabelList.get(i).setBorder(BorderFactory.createTitledBorder("")); 
       }
       
       //this.jLabelList.add(new JLabel());
       //this.jLabelList.get(i).setOpaque(true);  
       //this.jPanel1.add(this.jLabelList.get(i));  
       //this.jLabelList.get(i).setBorder(BorderFactory.createTitledBorder("")); 
       //this.jLabelList.get(1).setHorizontalAlignment(SwingConstants.CENTER);       
              
       
       //////////////       
       this.jLabelList.get(0).setBackground(Color.GRAY);
       this.jLabelList.get(0).setText("Button 1");
       //////////////
       this.jLabelList.get(1).setBackground(Color.GRAY);
       this.jLabelList.get(1).setText("2");
       //////////////
       this.jLabelList.get(2).setBackground(Color.GRAY);
       this.jLabelList.get(2).setText("Button 3");
       //////////////
       this.jLabelList.get(3).setBackground(Color.GRAY);
       this.jLabelList.get(3).setText("Long_Named Button 4");
       //////////////
       this.jLabelList.get(4).setBackground(Color.GRAY);
       this.jLabelList.get(4).setText("Button 5");
   }
    
}
