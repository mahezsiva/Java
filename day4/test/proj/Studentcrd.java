package com.test.proj;

import java.util.Scanner;

class Department extends Exception{
	private String dept;
	Department(String dept){
		this.dept=dept;
	}
	public String toString() {
		return ("dept is mismatching"+" "+dept);
	}
}

class Student  {
	private int rollno;
	private String name;
	private int mark;
	private String dept;
	Student(int rollno,String name,int mark,String dept){
		this.rollno=rollno;
		this.name=name;
		this.mark=mark;
		this.dept=dept;
	}
	public void display() {
		try {
		System.out.println("Roll No:"+rollno);
		System.out.println("Name:"+name);
		if(dept!="programmer"){
			throw new Department(dept);
		}
		System.out.println("dept="+dept);
		}
		catch(Department e){
			System.out.println(e);
		}
	}
	
	
}
public class Studentcrd{

	public static void main(String[] args) {
		
		Scanner s=new Scanner (System.in) ;
		Scanner s1=new Scanner (System.in) ;
        int rollno,mark;
        String name;
        String dept;
        System.out.println("Enter the roll no");
        rollno=s.nextInt();
        System.out.println("Enter the name");
        name=s1.nextLine();
        System.out.println("Enter the Marks obtained");
        mark=s.nextInt();
        System.out.println("enter the Dept");
        dept=s1.nextLine();
        
		 Student obj=new Student(rollno,name,mark,dept);
	      obj.display();
		
	}

}