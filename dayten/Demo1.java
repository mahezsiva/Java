package com.dayten;

import java.util.*;

class detail{
	private int age;
	private String name;
	String getName(){
		return name;
	}
	detail(int age,String name){
		this.age=age;
		this.name=name;
	}
	public String toString(){
		return("Age "+age+" "+"Name: "+name);
	}
	
}
class demo implements Comparator<detail>{

	
	public int compare(detail o1, detail o2) {
		
		String a1=o1.getName();
		String a2=o2.getName();
		return (a1.compareTo(a2));
	}
		
}
public class Demo1 {
	public static void main(String[]args){
		TreeSet<detail> s=new TreeSet<detail>(new demo());
		s.add(new detail(90,"Arun"));
		s.add(new detail(89,"yash"));
		s.add(new detail(67,"sarath"));
		
		//System.out.println(s);
		for(detail a:s){
			System.out.println(a);
		}
		
		
		
	}
}