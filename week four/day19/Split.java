package com.day19;


import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Split {

	public static void main(String[] args) {
		
		Pattern p=Pattern.compile("[ .]");
		String s[]=p.split("how.you.doing.");
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
		}
			  
			Pattern b=Pattern.compile("hi"); 
		        
		        Matcher m=b.matcher("hihellohi"); 
		        
		        while(m.find())  
		    System.out.println("Start :"+m.start()+", End : "+m.end()+", Group "+m.group()); 
	        
	        String regex = "ah";
	        Pattern pattern= Pattern.compile(regex);    
	        String stringToBeMatched = "mahesh";
		    Matcher matcher = pattern.matcher(stringToBeMatched);	  	      
	        System.out.println("matches="+matcher.find());
	
	}

	}

