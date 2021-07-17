package com.day22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Menudriven
{
public static void main(String[] args) throws ClassNotFoundException, NumberFormatException, IOException, SQLException
{
System.out.println();

while(true)
{
System.out.println("1. Insert  Record");
System.out.println("2. Update  Record");
System.out.println("3. Show  Record");
System.out.println("4. Delete Record");
System.out.println("** Enter Your choice**");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_database", "root", "mahezsiva8940@");
Statement stmt = conn.createStatement();

int choice;
choice = Integer.parseInt(br.readLine());
switch(choice)
{
case 1:
//void AddStudent();
//System.out.println("Inserting Records.");
System.out.println("Enter  Id.");
int id=Integer.parseInt(br.readLine());

System.out.println("Enter Student Name.");
String username =(br.readLine());

System.out.println("Enter email");
String email = (br.readLine());

//stmt.executeUpdate("insert into details (id,name,department,year,address) values ("+id+",'"+name+"','"+department+"','"+year+"','"+address+"')");
stmt.executeUpdate("insert into login (id,username,email) values ("+id+",'"+username+"','"+email+"')");

System.out.println("Data is Sucessfully Inserted");
break;

case 2:
//void UpdateStudent();
System.out.println("Enter  Id.");
id=Integer.parseInt(br.readLine());

System.out.println("Enter  Name.");
username =(br.readLine());

System.out.println("Enter email.");
email = (br.readLine());


//update stud set name='Raju',city='Ranchi', mobile=99999999 where id=2
stmt.executeUpdate("update login set name='"+username+"', department='"+email+"','");

System.out.println("Data is Sucessfully Updated");

break;

case 3:
System.out.println("Showing Student");
ResultSet rs = stmt.executeQuery("select * from login");
while(rs.next())
{

System.out.println( id =rs.getInt(1));
System.out.println(username = rs.getString(2));
System.out.println(email= rs.getString(3));

//System.out.println(mobile = rs.getInt(4));

}
rs.close();
stmt.close();
conn.close();
break;

case 4:

System.out.println("Enter the ID of student to be deleted ");
id=Integer.parseInt(br.readLine());
//delete from stud where id=3
stmt.executeUpdate("delete from login where id='"+id+"'");
System.out.println(" Deleted Sucessfull.. ");

}

}
}
}
