package com.day16;

import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.lang.Exception;  
  
//create CreateLoginForm class to create login form  
//class extends JFrame to create a window where our component add  
//class implements ActionListener to perform an action on button click  
class CreateLoginForm extends JFrame implements ActionListener  
{  
    
    JButton b1;  
    JPanel newPanel;  
    JLabel userLabel, passLabel;  
    final JTextField  textField1, textField2;  
      
    //calling constructor  
    CreateLoginForm()  
    {     
          
      
        userLabel = new JLabel();  
        userLabel.setText("Username");       
          
          
        textField1 = new JTextField(15);     
  
       
        passLabel = new JLabel();  
        passLabel.setText("Password");       
          
       
        textField2 = new JPasswordField(15);   
          
        
        b1 = new JButton("SUBMIT"); 
          
         
        newPanel = new JPanel(new GridLayout(3, 1));  
        newPanel.add(userLabel);     
        newPanel.add(textField1);   
        newPanel.add(passLabel);     
        newPanel.add(textField2);    
        newPanel.add(b1);            
        b1.setBackground(Color.green);
          
        
        add(newPanel, BorderLayout.CENTER);  
          
          
        b1.addActionListener(this);     
        setTitle("LOGIN FORM");         
    }  
      
    
    public void actionPerformed(ActionEvent ae)     
    {  
        String userValue = textField1.getText();        
        String passValue = textField2.getText();       
          
        //check whether the credentials are authentic or not  
        if (userValue.equals("mahesh") && passValue.equals("mahesh")) {  
              
            //create instance of the NewPage  
            NewPage page = new NewPage();  
              
            //make page visible to the user  
            page.setVisible(true);  
              
            //create a welcome label and set it to the new page  
            JLabel wel_label = new JLabel("Welcome: "+userValue);  
            page.getContentPane().add(wel_label);  
        }  
        else{  
            //show error message  
            System.out.println("Please enter valid username and password");  
        }  
    }  
}  

class LoginFormDemo  
{  
   
    public static void main(String arg[])  
    {  
        try  
        {  
            
            CreateLoginForm form = new CreateLoginForm();  
            form.setSize(300,100);  
            form.setVisible(true); 
        }  
        catch(Exception e)  
        {     
         
            JOptionPane.showMessageDialog(null, e.getMessage());  
        }  
    }  
}  
class NewPage extends JFrame  
{  
    
    NewPage()  
    {  
        setDefaultCloseOperation(javax.swing.  
        WindowConstants.DISPOSE_ON_CLOSE);  
        setTitle("Welcome");  
        setSize(400, 200);  
    }  
}  