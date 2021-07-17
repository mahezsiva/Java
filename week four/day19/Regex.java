package com.day19;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your Email: ");
	      String phone = sc.next();
	      String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	      boolean result = phone.matches(regex);
	      if(result) {
	         System.out.println("email-id is valid");
	      } else {
	         System.out.println("email-id is not valid");
	      }
	   }
	}
