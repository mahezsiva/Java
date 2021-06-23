package com.demo;

public class This {
	int ival=9;
	
	public void get(int ivalue){
		this.ival=ivalue;
	}
	

	public static void main(String[] args) {
		This ref=new This();
		ref.get(24);
		System.out.println(ref.ival);

	}

}
