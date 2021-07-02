package com.dayten;

import java.util.TreeMap;

public class Phone {

	public static void main(String[] args) {
		
		TreeMap<String,String> ref=new TreeMap<String,String>();
		ref.put("akash", "38926247628");
		ref.put("ajay", "839747677676");
		ref.put("sarath", "1234567890");
		System.out.println(ref);
		System.out.println("Phone Number: "+ref.get("sarath"));
		ref.put("krishna", "38732984739");
		System.out.println(ref);
	
	}

}

