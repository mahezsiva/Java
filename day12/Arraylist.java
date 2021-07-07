package com.day12;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
	
	
	
	public static void main(String args[]){
	
	     ArrayList<String> list = new ArrayList<String>();
	     list.add("vinoth");
	     list.add("vignesh");
	     list.add("surya");
	     list.add("akash");
	            
	    
	     
	     Iterator<String> it = list.iterator();
	     while(it.hasNext()) {
	      if(it.next().length()%2==0) {
	        it.remove();
	       }
	     }
	     System.out.println(list);
	    
	    }
	
	
}
