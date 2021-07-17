package com.day20;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Update {
	public static void main(String[] args) {
		Connection con=null;
	    try{  
	    Class.forName("com.mysql.cj.jdbc.Driver");  
	     con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_database", "root", "mahezsiva8940@");  
	    
	    Statement stmt=con.createStatement(); 
	ResultSet rs=null;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter EmployeeNumber to Update details");
	int emp_no2=s.nextInt();
	String username=s.next();
	String email=s.next();
	
	stmt.executeUpdate("update login SET username='"+username+"' WHERE id="+emp_no2);
	stmt.executeUpdate("update login SET email='"+email+"' WHERE id="+emp_no2);
	
	System.out.println("Updated...");
		
	}catch(Exception e){
		
	}
}
}
