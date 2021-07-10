package com.day17;

import javax.swing.*;    
import java.awt.event.*; 

public class Demo implements ActionListener{    
   JFrame f;    
   JMenuBar mb;    
   JMenu file,edit,help,insert;    
   JMenuItem cut,copy,paste,save,saveAs,image,text;   
   JTextArea ta;

  Demo(){   
	  
        f=new JFrame();    
         cut=new JMenuItem("cut");    
         copy=new JMenuItem("copy");    
         paste=new JMenuItem("paste");  
         save=new JMenuItem("save"); 
         saveAs=new JMenuItem("saveAs"); 
         image=new JMenuItem("image");
         text=new JMenuItem("text");
       
         cut.addActionListener(this);    
         copy.addActionListener(this);    
         paste.addActionListener(this); 
         save.addActionListener(this);
         saveAs.addActionListener(this);
         image.addActionListener(this);
         text.addActionListener(this);
        

        
        
        mb=new JMenuBar();    
        file=new JMenu("File");    
        edit=new JMenu("Edit");    
        help=new JMenu("Help");   
        insert=new JMenu("insert");
        edit.add(cut);edit.add(copy);edit.add(paste); 
       file.add(save);     
       file.add(saveAs);
       insert.add(image);
       insert.add(text);

        mb.add(file);mb.add(edit);mb.add(help); 
        mb.add(insert);
         
     ta=new JTextArea();    
    ta.setBounds(5,5,360,320);    
    f.add(mb);f.add(ta);    
      f.setJMenuBar(mb);  
     f.setLayout(null);    
      f.setSize(400,400);    
     f.setVisible(true);    
  }
     
public void actionPerformed(ActionEvent e) {    
          
          
      }     
public static void main(String[] args) {    
    new Demo();   
    
       }    
}    
