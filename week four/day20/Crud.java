package com.day20;


import java.sql.Connection;
import java.sql.*;


//inserting the data
public class Crud {
	public static void main(String[] args) throws ClassNotFoundException {
		  
		
		try {
		  Class.forName("com.mysql.jdbc.Driver");              
		  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_database","root", "mahezsiva8940@");
		   String s="insert into login values(18,'mahesh','mahezsiva007@hmail.com')";
		   PreparedStatement st=con.prepareStatement(s);
		   st.execute();
		   st.close();
		
	
		
		} catch (SQLException e) {
		  System.out.println(e);
		}
	
		}
		}
	
