package com.day21;

import java.sql.*;  
public class Commit{  
public static void main(String args[])throws Exception{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_database","root","mahezsiva8940@");  
con.setAutoCommit(false);  
  
Statement stmt=con.createStatement();  
stmt.executeUpdate("insert into login values(89,'ajay','ajay@gmail.com')");
stmt.executeUpdate("insert into login values(90,'rahul','rahul@gmail.com')");
    
con.commit();  
con.close();  
}
}
