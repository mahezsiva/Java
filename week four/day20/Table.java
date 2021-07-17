package com.day20;

import java.sql.*;


//displaying the data
public class Table {
	public static void main(String[] args) throws ClassNotFoundException {
		  
		ResultSet rs=null;
		try {
		  Class.forName("com.mysql.jdbc.Driver");              
		  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_database","root", "mahezsiva8940@");
		   String s="select * from login";
		   PreparedStatement st=con.prepareStatement(s);
		   st.execute();
		   st.close();
		   Statement stmt=con.createStatement(); 
		   rs=stmt.executeQuery("select * from login");  
		    while(rs.next())  
		    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)); 
	
		
		} catch (SQLException e) {
		  System.out.println(e);
		}
	
		}
		}
	