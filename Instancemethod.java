package com.demo;

//instance method,instance variable
public class Instancemethod {
	int ivalue=0;
	public void set(int ival){
		
		ivalue=ival;
		
	}
	public int get(){
		return ivalue;
	}
	
	public static void main(String[]args){
		Instancemethod ref=new Instancemethod();
		ref.set(10);
		int value=ref.get();
		System.out.println(value);
		
	}

}
