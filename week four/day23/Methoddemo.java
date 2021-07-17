package com.day23;

public class Methoddemo{  
    public void printnMsg(){  
        System.out.println("from instance method");  
    }  
    public static void main(String[] args) {  
    Thread t2=new Thread(new Methoddemo()::printnMsg);  
        t2.start();       
    }  
}  
