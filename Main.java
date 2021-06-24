package com.demo;


class person{
	String Name;
	int Age;
	int Phonenumber;
	String Address;
	int Salary;
	void printsalary(){
		System.out.println("salary="+this.Salary);
	}
}
class Employee extends person{
	String specialization;
	String department;
}
class Manager extends person{
	String specialization;
	String department;	
}
public class Main {

	public static void main(String[] args) {
		Employee ref=new Employee();
		ref.Name="ajay";
	    ref.Age=30;
		ref.Phonenumber=898384984;
		ref.Address="anna nagar chennai";
		ref.specialization="trainer";
		ref.department="training";
		ref.Salary=50000;
		System.out.println("name="+ref.Name);
		System.out.println("age="+ref.Age);
		System.out.println("number="+ref.Phonenumber);
		System.out.println("address="+ref.Address);
		System.out.println("specialization="+ref.specialization);
		System.out.println("department="+ref.department);
		ref.printsalary();
		System.out.println("------------------------------------------------------");
		Manager res=new Manager();
		res.Name="vivek";
	    res.Age=30;
		res.Phonenumber=35325535;
		res.Address="vadapalani chennai";
		res.specialization="Manager";
		res.department="finance";
		res.Salary=100000;
		res.printsalary();
		System.out.println("name="+res.Name);
		System.out.println("age="+res.Age);
		System.out.println("number="+res.Phonenumber);
		System.out.println("address="+res.Address);
		System.out.println("specialization="+res.specialization);
		System.out.println("department="+res.department);
		res.printsalary();
		
		

	}

}
