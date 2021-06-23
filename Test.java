package com.demo;

//constructor overloading,object creation
public class Test {
	
	
	Test(){
		System.out.println("this is constructor");
	}
	Test(int ival){
		System.out.println(ival);
	}
	
	Test(int ival,int cval){
		System.out.println(ival+cval);
	}
	
	public static void main(String[]args){
		Test ref=new Test(15);
		Test re1f=new Test(15,13);
		
		
		
	}

}
