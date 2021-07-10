package day14;

import java.awt.Component;
import java.awt.Frame;
import java.awt.TextArea;
 
public class Simpleframe {
 
  public static void main(String[] args) {
 
Frame frame = new Frame("Simple Frame");
 
Component textArea = new TextArea(" Welcome ");
 	 
frame.add(textArea);
 
frame.setSize(200, 300);
 
frame.setVisible(true);
 
  }
}