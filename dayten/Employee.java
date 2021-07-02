package com.dayten;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class details{
	private String eno;
	private String name;
	private String desi;
	
	details(String eno,String name,String desi){
		this.eno=eno;
		this.name=name;
		this.desi=desi;
	}
	public String toString(){
		return("Employee no: "+eno+" "+"Employee name: "+name+" "+"Designation: "+desi);
	}
	
}
public class Employee {

	public static void main(String[] args) {
		TreeMap<Integer,details> ref=new TreeMap<Integer,details>();
		
		ref.put(1,new details("akash","123","analyst"));
		ref.put(2,new details("ajay","458","logistics"));
		ref.put(3,new details("balu","907","finance"));
		
		
		
		
			System.out.println(ref.get(1));
			System.out.println(ref.get(2));
			System.out.println(ref.get(3));
			
		
		
	}
	}