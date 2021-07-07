package com.day13;

public class Classclass {  
    public static void main(String[] args) throws ClassNotFoundException{  
        // returns the Class object for the class with the given name  
        Class class1 = Class.forName("java.lang.String");  
        Class class2 = int.class;  
        System.out.print("class1: ");  
        System.out.println(class1.toString());  
        System.out.print("class2: ");  
        System.out.println(class2.toString());     
    }  
}  
