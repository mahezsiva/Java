package com.day23;


interface sayable{  
    void say(String msg);  
}  
public class Demo implements sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        Demo fie = new Demo();  
        fie.say("hello");  
    }  
}  