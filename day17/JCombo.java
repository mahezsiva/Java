package com.day17;

import java.awt.Color;

import javax.swing.*;    
public class JCombo {    
JFrame f;    
JCombo(){    
    f=new JFrame("Details");    
    String city[]={"LA","NYC","OHIO"};        
    JComboBox cb=new JComboBox(city);    
    cb.setBounds(100, 100,100,50);    
    f.add(cb);        
    f.setLayout(null);    
    f.setSize(400,500);    
    f.setVisible(true); 
    cb.setBackground(Color.MAGENTA);
}    
public static void main(String[] args) {    
    new JCombo();         
}    
}   
