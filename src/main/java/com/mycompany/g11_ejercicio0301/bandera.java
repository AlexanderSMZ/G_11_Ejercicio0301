/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g11_ejercicio0301;

import java.awt.BorderLayout;
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
public class bandera extends JFrame{
    
    private JPanel jPanel1;
    private JPanel jPanelBandera;
    private List<JLabel> jLabelList;
    private List<JLabel> jLabelBanderaList;
    
    
   public bandera (String title) {
        super(title);
        this.setSize(450, 300);
        this.setLocation(175, 325);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }

   public void iniciarComponentes(){
        this.iniciarPanel();
        this.iniciarBandera();
        this.iniciarEtiquetas();
   }
   
   public void iniciarPanel(){
       this.jPanel1 = new JPanel();
       this.jPanel1.setBackground(Color.WHITE);
       this.jPanel1.setLayout(new BorderLayout());
   }
   
   public void iniciarEtiquetas(){
       this.jLabelList = new ArrayList<>();
       for(var i=0;i<6;i++){
           this.jLabelList.add(new JLabel());
           this.jLabelList.get(i).setHorizontalAlignment(SwingConstants.CENTER);
           this.jLabelList.get(i).setBorder(BorderFactory.createTitledBorder(""));
           this.jLabelList.get(i).setOpaque(true);
       }
       
       //this.jLabelList.add(new JLabel());
       //this.jLabelList.get(0).setHorizontalAlignment(SwingConstants.CENTER);
       //this.jLabelList.get(0).setBorder(BorderFactory.createTitledBorder(""));
       //this.jLabelList.get(0).setOpaque(true);
       
       /////////////////////
       this.jLabelList.get(0).setBackground(Color.GRAY);
       this.jLabelList.get(0).setText("Button1");
       /////////////////////
       this.jLabelList.get(1).setBackground(Color.GRAY);
       this.jLabelList.get(1).setText("Long-Named Button 4");    
       /////////////////////
       this.jLabelList.get(2).setBackground(Color.GRAY);
       this.jLabelList.get(2).setText("Button 5");      
       /////////////////////
       this.jLabelList.get(3).setBackground(Color.GRAY);
       this.jLabelList.get(3).setText("2");
       /////////////////////
       this.jLabelList.get(4).setBackground(Color.GRAY);
       this.jLabelList.get(4).setText("Button 3");      
       /////////////////////
       
       this.jPanel1.add(this.jLabelList.get(0),BorderLayout.NORTH);
       this.jPanel1.add(this.jLabelList.get(1),BorderLayout.SOUTH);
       this.jPanel1.add(this.jLabelList.get(2),BorderLayout.EAST);
       this.jPanel1.add(this.jPanelBandera,BorderLayout.CENTER);
       this.jPanel1.add(this.jLabelList.get(4),BorderLayout.WEST);
       
       
   }
   
   public void iniciarBandera(){
       this.jPanelBandera = new JPanel();
       this.jPanelBandera.setLayout(new GridLayout(9,16));
       
       this.jLabelBanderaList = new ArrayList<>();
       for(var i=0;i<153;i++){
           this.jLabelBanderaList.add(new JLabel());
           this.jLabelBanderaList.get(i).setOpaque(true);
       }

       ////////////////////////////////////////////////////// -- 1       
       this.jLabelBanderaList.get(0).setBackground(Color.RED);
       this.jLabelBanderaList.get(1).setBackground(Color.RED);
       this.jLabelBanderaList.get(2).setBackground(Color.RED);
       this.jLabelBanderaList.get(3).setBackground(Color.RED);
       this.jLabelBanderaList.get(4).setBackground(Color.RED);
       this.jLabelBanderaList.get(5).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(6).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(7).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(8).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(9).setBackground(Color.RED);
       this.jLabelBanderaList.get(10).setBackground(Color.RED);
       this.jLabelBanderaList.get(11).setBackground(Color.RED);       
       this.jLabelBanderaList.get(12).setBackground(Color.RED);
       this.jLabelBanderaList.get(13).setBackground(Color.RED);
       this.jLabelBanderaList.get(14).setBackground(Color.RED);
       this.jLabelBanderaList.get(15).setBackground(Color.RED);
       this.jLabelBanderaList.get(16).setBackground(Color.RED);
       
       ////////////////////////////////////////////////////// -- 2
       this.jLabelBanderaList.get(17).setBackground(Color.RED);
       this.jLabelBanderaList.get(18).setBackground(Color.RED);
       this.jLabelBanderaList.get(19).setBackground(Color.RED);
       this.jLabelBanderaList.get(20).setBackground(Color.RED);
       this.jLabelBanderaList.get(21).setBackground(Color.RED);
       this.jLabelBanderaList.get(22).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(23).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(24).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(25).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(26).setBackground(Color.RED);
       this.jLabelBanderaList.get(27).setBackground(Color.RED);
       this.jLabelBanderaList.get(28).setBackground(Color.RED);       
       this.jLabelBanderaList.get(29).setBackground(Color.RED);
       this.jLabelBanderaList.get(30).setBackground(Color.RED);
       this.jLabelBanderaList.get(31).setBackground(Color.RED);
       this.jLabelBanderaList.get(32).setBackground(Color.RED);
       this.jLabelBanderaList.get(33).setBackground(Color.RED); 
       
       ////////////////////////////////////////////////////// -- 3
       this.jLabelBanderaList.get(34).setBackground(Color.RED);
       this.jLabelBanderaList.get(35).setBackground(Color.RED);
       this.jLabelBanderaList.get(36).setBackground(Color.RED);
       this.jLabelBanderaList.get(37).setBackground(Color.RED);
       this.jLabelBanderaList.get(38).setBackground(Color.RED);
       this.jLabelBanderaList.get(39).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(40).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(41).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(42).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(43).setBackground(Color.RED);
       this.jLabelBanderaList.get(44).setBackground(Color.RED);
       this.jLabelBanderaList.get(45).setBackground(Color.RED);       
       this.jLabelBanderaList.get(46).setBackground(Color.RED);
       this.jLabelBanderaList.get(47).setBackground(Color.RED);
       this.jLabelBanderaList.get(48).setBackground(Color.RED);
       this.jLabelBanderaList.get(49).setBackground(Color.RED);
       this.jLabelBanderaList.get(50).setBackground(Color.RED);
       
       ////////////////////////////////////////////////////// -- 4
       this.jLabelBanderaList.get(51).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(52).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(53).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(54).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(55).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(56).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(57).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(58).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(59).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(60).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(61).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(62).setBackground(Color.WHITE);       
       this.jLabelBanderaList.get(63).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(64).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(65).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(66).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(67).setBackground(Color.WHITE); 

       ////////////////////////////////////////////////////// -- 5 
       this.jLabelBanderaList.get(68).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(69).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(70).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(71).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(72).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(73).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(74).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(75).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(76).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(77).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(78).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(79).setBackground(Color.BLUE);       
       this.jLabelBanderaList.get(80).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(81).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(82).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(83).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(84).setBackground(Color.BLUE); 

       ////////////////////////////////////////////////////// -- 6
       this.jLabelBanderaList.get(85).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(86).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(87).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(88).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(89).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(90).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(91).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(92).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(93).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(94).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(95).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(96).setBackground(Color.WHITE);       
       this.jLabelBanderaList.get(97).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(98).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(99).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(100).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(101).setBackground(Color.WHITE);        
       
       ////////////////////////////////////////////////////// -- 7     
       this.jLabelBanderaList.get(102).setBackground(Color.RED);
       this.jLabelBanderaList.get(103).setBackground(Color.RED);
       this.jLabelBanderaList.get(104).setBackground(Color.RED);
       this.jLabelBanderaList.get(105).setBackground(Color.RED);
       this.jLabelBanderaList.get(106).setBackground(Color.RED);
       this.jLabelBanderaList.get(107).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(108).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(109).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(110).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(111).setBackground(Color.RED);
       this.jLabelBanderaList.get(112).setBackground(Color.RED);
       this.jLabelBanderaList.get(113).setBackground(Color.RED);       
       this.jLabelBanderaList.get(114).setBackground(Color.RED);
       this.jLabelBanderaList.get(115).setBackground(Color.RED);
       this.jLabelBanderaList.get(116).setBackground(Color.RED);
       this.jLabelBanderaList.get(117).setBackground(Color.RED);
       this.jLabelBanderaList.get(118).setBackground(Color.RED);    
       
       ////////////////////////////////////////////////////// -- 8  
       this.jLabelBanderaList.get(119).setBackground(Color.RED);
       this.jLabelBanderaList.get(120).setBackground(Color.RED);
       this.jLabelBanderaList.get(121).setBackground(Color.RED);
       this.jLabelBanderaList.get(122).setBackground(Color.RED);
       this.jLabelBanderaList.get(123).setBackground(Color.RED);
       this.jLabelBanderaList.get(124).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(125).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(126).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(127).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(128).setBackground(Color.RED);
       this.jLabelBanderaList.get(129).setBackground(Color.RED);
       this.jLabelBanderaList.get(130).setBackground(Color.RED);       
       this.jLabelBanderaList.get(131).setBackground(Color.RED);
       this.jLabelBanderaList.get(132).setBackground(Color.RED);
       this.jLabelBanderaList.get(133).setBackground(Color.RED);
       this.jLabelBanderaList.get(134).setBackground(Color.RED);
       this.jLabelBanderaList.get(135).setBackground(Color.RED); 
       
       ////////////////////////////////////////////////////// -- 9  
       this.jLabelBanderaList.get(136).setBackground(Color.RED);
       this.jLabelBanderaList.get(137).setBackground(Color.RED);
       this.jLabelBanderaList.get(138).setBackground(Color.RED);
       this.jLabelBanderaList.get(139).setBackground(Color.RED);
       this.jLabelBanderaList.get(140).setBackground(Color.RED);
       this.jLabelBanderaList.get(141).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(142).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(143).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(144).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(145).setBackground(Color.RED);
       this.jLabelBanderaList.get(146).setBackground(Color.RED);
       this.jLabelBanderaList.get(147).setBackground(Color.RED);       
       this.jLabelBanderaList.get(148).setBackground(Color.RED);
       this.jLabelBanderaList.get(149).setBackground(Color.RED);
       this.jLabelBanderaList.get(150).setBackground(Color.RED);
       this.jLabelBanderaList.get(151).setBackground(Color.RED);
       this.jLabelBanderaList.get(152).setBackground(Color.RED);        
            
       
       for(var i=0;i<153;i++)
           this.jPanelBandera.add(this.jLabelBanderaList.get(i));
       
       
   }              
    
}
