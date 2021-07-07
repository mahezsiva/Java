package com.day13;

public class objclass {

	public static void main(String[] args) {
		String ex1="ajay";
		System.out.println(ex1);
		StringBuffer ex4=new StringBuffer(ex1);
		System.out.println(ex4.length());
		System.out.println(ex4.hashCode());
		
		String ex2="akash";
		System.out.println(ex2.toString());
		
		String ex3="akshay";
		System.out.println(ex3.toString());
		
		System.out.println(ex1.hashCode());
		System.out.println(ex2.hashCode());
		System.out.println(ex3.hashCode());
		
		System.out.println(ex1.getClass());


	}

}