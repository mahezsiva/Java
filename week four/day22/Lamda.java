package com.day22;


interface Display{  
    public void dis();  
}  
  
public class Lamda {  
    public static void main(String[] args) {  
        String s="Hello";  
          
        
        Display d=()->{  
            System.out.println(s);  
        };  
        d.dis();  
    }  
}