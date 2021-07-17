package com.day21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
public static void main(String[] args) throws ClassNotFoundException {
		  
		
		try {
		  Class.forName("com.mysql.jdbc.Driver");              
		  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_database","root", "mahezsiva8940@");
	         //Delete the record
          String sql3 = "DELETE FROM login WHERE username=?";
          PreparedStatement statement1 = con.prepareStatement(sql3);
          statement1.setString(1, "dinesh");

          int rowsDeleted = statement1.executeUpdate();
          if (rowsDeleted > 0)
          {
               System.out.println("A record was deleted successfully!\n");
          }
     
     
	
		
		} catch (SQLException e) {
		  System.out.println(e);
		}
	
		}

}
