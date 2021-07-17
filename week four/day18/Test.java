package com.day18;


import java.io.*;
  
class Demo implements Serializable
{
    public int a;
    public String b;
  
   
    public Demo(int a, String b)
    {
        this.a = a;
        this.b = b;
    }
  
}
  
class Test
{
    public static void main(String[] args)
    {   
        Demo object = new Demo(10, "mahesh");
       
          
       
        try
        {   
           
            FileOutputStream file = new FileOutputStream("filename");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(object);
              
            out.close();
            file.close();
              
            System.out.println("serialized");
            System.out.println("a = " + object.a);
            System.out.println("b = " + object.b);
  
        }
          
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
  
  
        Demo object1 = null;
  
     
        try
        {   
         
            FileInputStream file = new FileInputStream("filename");
            ObjectInputStream in = new ObjectInputStream(file);
              
         
            object1 = (Demo)in.readObject();
              
            in.close();
            file.close();
              
            System.out.println("deserialized ");
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);
          
        }
          
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
          
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
  
    }
}
