

import java.awt.*;  
import java.awt.event.*;  
public class Demo extends Frame implements KeyListener{  
    Label l;  
    TextArea area;  
    Demo(){  
          
    	  l=new Label();  
          l.setBounds(30,60,90,10);  
          area=new TextArea();  
          area.setBounds(10,90,200, 200);  
          area.addKeyListener(this);   
          
        add(l);add(area);  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void keyPressed(KeyEvent e) {  
        l.setText("Key Pressed");  
    }  
    public void keyReleased(KeyEvent e) {  
        l.setText("Key Released");  
    }  
    public void keyTyped(KeyEvent e) {  
        l.setText("Key Typed");  
    }  
  
    public static void main(String[] args) {  
        new Demo();  
    }  
}