package com.day12;

import java.util.Properties;
import java.util.Set;

public class Properities {
	 
	public static void main(String[] args)throws Exception{  
	  
	Properties p=new Properties();  
	
	p.put("1", "blue");
	p.put("2", "yellow");
	p.put("3", "red");
//
	
	Set s=p.keySet();
	for(Object n:s){
		System.out.println("key: "+n+"value :"+p.getProperty((String)n));
	}
	
	  
	}

}