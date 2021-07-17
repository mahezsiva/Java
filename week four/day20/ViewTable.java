package com.day20;

import java.util.*;
import java.sql.*;  
  public  class ViewTable{  
    public static void main(String args[]){  
	Connection con=null;
    try{  
    Class.forName("com.mysql.cj.jdbc.Driver");  
     con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_database", "root", "mahezsiva8940@");  
    
    Statement stmt=con.createStatement(); 
ResultSet rs=null;
Scanner s=new Scanner(System.in);

int val=1;
do{
	System.out.println("1. View Table \n2.Insert Record\n3.Delete Record\n4.Update Record\nEnter Your Choice!!!");
int i=s.nextInt();

switch(i)
{
case 1:
	rs=stmt.executeQuery("select * from login");  
    while(rs.next())  
    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)); 
	break;
case 2:
	System.out.println("Enter EmployeeNo, FirstName, LastName,Gender");
	int emp_no1=s.nextInt();
	String first_name=s.next();
	String last_name=s.next();
	String gender=s.next();
	int result = stmt.executeUpdate("insert into studentdetails(EmolyeeNo,FirstName,LastName,Gender) values("+emp_no1+",'"+first_name+",'"+last_name+",'"+gender+"')");
	if (result > 0)
        System.out.println("successfully inserted");
	else
        System.out.println("unsucessful insertion "); 
	break;

case 3:
	System.out.println("Enter EmployeeNumber to delete");
	int emp_no=s.nextInt();
     stmt.executeUpdate("delete from employees where emp_no="+emp_no);
	System.out.println("deleted"); 
	break;
case 4:
	System.out.println("Enter EmployeeNumber to Update details");
	int emp_no2=s.nextInt();
	String first_name1=s.next();
	String last_name1=s.next();
	String gender1=s.next();
	stmt.executeUpdate("update employees SET first_name='"+first_name1+"' WHERE emp_no="+emp_no2);
	stmt.executeUpdate("update employees SET last_name='"+last_name1+"' WHERE emp_no="+emp_no2);
	stmt.executeUpdate("update employees SET  genderr='"+gender1+"' WHERE emp_no="+emp_no2);
	System.out.println("Updated...");
case 5:
	val=-1;
	break;
default:
	System.out.println("Invalid Choice");
}
}while (val!=-1);
            
    
     
    }catch(Exception e){ System.out.println(e);
System.out.println("database not connected");}  
finally{
try{con.close(); }
catch(Exception e){}}
    } 
    }