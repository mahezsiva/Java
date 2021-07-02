package com.dayten;

import java.util.*;

class Accdet{
	private int acno;
	private int acbal;
	Accdet(int acno,int acbal){
		this.acno=acno;
		this.acbal=acbal;
	}
	public String toString(){
		return("Account no: "+acno+" "+"Balnnce: "+acbal);
	}
}
public class Account {
	public static void main(String []args){
	
		TreeMap<String,Accdet> ts=new TreeMap<String,Accdet>();
		ts.put("vikki",new Accdet(19,50000));
		ts.put("thiru",new Accdet(0050,60000));
 		ts.put("sathish",new Accdet(0100,80000));
 		
        Set<Map.Entry<String,Accdet>> s=ts.entrySet();
		
		for(Map.Entry<String,Accdet> ref:s){
			System.out.println(ref.getKey()+" "+ref.getValue());
		}
		
		
	}
	}