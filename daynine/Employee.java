package com.daynine;

import java.util.LinkedList;

class details{
	private String eno;
	private String name;

	
	details(String eno,String name){
		this.eno=eno;
		this.name=name;
		
	}
	public String toString(){
		return("Employee no: "+eno+" "+"Employee name: "+name);
	}
	
}
public class Employee {

	public static void main(String[] args) {
		
		LinkedList<details> ref=new LinkedList<details>();
		ref.add(new details("A121","ajay"));
		ref.add(new details("A122","Ashok"));
		
		for(details res:ref){
			System.out.println(res);
		}
		

	}

}