package com.day11;

import java.util.Hashtable;

public class HashDemo {  
	   public static void main(String args[]) {  
	  Hashtable<Integer,String> map=new Hashtable<Integer,String>();        
	     map.put(100,"arun");    
	     map.put(102,"karthik");   
	     map.put(101,"sundar");    
	     map.put(103,"kavi");    
	     System.out.println("Before remove: "+ map);    
	      // Remove value for key 102  
	       map.remove(102);  
	       System.out.println("After remove: "+ map);  
	       Object res=map.clone();
	       System.out.println("cloning the object="+res);
	         map.clear();
	       System.out.println("after using clear method="+map);
	   }      
	}  
