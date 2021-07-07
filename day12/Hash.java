package com.day12;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Hash {
	 public static void main(String[] args) {
		 
		    String str;
		 
		    
		    Hashtable<String, String> hashtable = new Hashtable<String, String>();
		 
		   
		    hashtable.put("1", "ajay");
		    hashtable.put("2", "akash");
		    hashtable.put("3", "mano");
		    hashtable.put("4", "vino");
		    hashtable.put("5", "vikash");
		 
		    System.out.println("Hashtable contains:");
		 
		   
		    Set<String> keys = hashtable.keySet();
		
		    Iterator<String> itr = keys.iterator();
		 
		    while (itr.hasNext()) { 
		      
		       str = itr.next();

		       System.out.println("Key: "+str+" & Value: "+hashtable.get(str));
		    } 
		 }

}
