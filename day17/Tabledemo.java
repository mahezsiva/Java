package com.day17;


import javax.swing.*; 

public class Tabledemo {    
    JFrame f;    
    Tabledemo(){    
    f=new JFrame();    
    String data[][]={ {"ajay","finance","hosur"},    
                       {"anil","logistics","andra"},    
                       };    
    String column[]={"Name","Desigination","Location"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(300,400);    
    f.setVisible(true);    
}     
public static void main(String[] args) {    
    new Tabledemo();    
}    
}