package com.day13;

import java.util.Scanner;
public class Palindromestring {
	
	public static void ispalin(String ref){
		
		String reverse="";
		char ar[]=ref.toCharArray();
		String res=ref;
		String res1=ref;
		String word="";
		for(int i=0;i<ar.length;i++){
			while(i<ar.length){
				word=ar[i]+word;
				i++;
				
			}
			if(word.equals(res1)){
				System.out.println("palindromeword  is="+word);
				
			}
		}
	}
	  
	   public static void main(String args[]) { 
	     
		   String name="lol radar mom level";
		   String arr[]=name.split(" ");
		   int count=arr.length;
		   for(int i=0;i<arr.length;i++){
			   String ref=arr[i];
			   ispalin(ref);
		   }
		   System.out.println(count);
		  
	   }  
	}