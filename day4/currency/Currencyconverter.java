package com.currency;

import java.text.DecimalFormat;
import java.util.Scanner;
//dollars to inr

public class Currencyconverter {
 
	public static void main(String[] args) {
 
		double amount, dollar, pound, code, euro,rupees;
 
		DecimalFormat f = new DecimalFormat("##.##");
 
		Scanner sc = new Scanner(System.in);
 
		System.out.println("enter the currency");
		
		System.out.println("1:Ruppes \t2:Dollar \t3:Pound \n4:Euro  ");
		code = sc.nextInt();
		
		System.out.println("How much Money you want to convert ?");
		amount = sc.nextFloat();
 
		// For amounts Conversion
		if (code == 1) {
 
			dollar = amount / 70;
			System.out.println("Your " + amount + " Rupee is : " + f.format(dollar) + " Dollar");
 
			pound = amount / 88;
			System.out.println("Your " + amount + " Rupee is : " + f.format(pound) + " Pound");
 
			euro = amount / 80;
			System.out.println("Your " + amount + " Rupee is : " + f.format(euro) + " Euro");
		}
			if(code==2){
			
			// For Dollar Conversion
 
			rupees= amount * 70;
			System.out.println("Your " + amount + " Dollar is : " + f.format(rupees) + " Ruppes");
 
			pound = amount * 0.78;
			System.out.println("Your " + amount + " Dollar is : " + f.format(pound) + " Pound");
 
			euro = amount * 0.87;
			System.out.println("Your " + amount + " Dollar is : " + f.format(euro) + " Euro");
 
			
		} else if (code == 3) {
			// For Pound Conversion
 
			rupees = amount * 88;
			System.out.println("Your " + amount + " pound is : " + f.format(rupees) + " Ruppes");
 
			dollar = amount * 1.26;
			System.out.println("Your " + amount + " pound is : " + f.format(dollar) + " Dollar");
 
			euro = amount * 1.10;
			System.out.println("Your " + amount + " pound is : " + f.format(euro) + " Euro");
 
		
		} else if (code == 4) {
			// For Euro Conversion
 
			rupees = amount * 80;
			System.out.println("Your " + amount + " euro is : " + f.format(rupees) + " Ruppes");
 
			dollar = amount * 1.14;
			System.out.println("Your " + amount + " euro is : " + f.format(dollar) + " Dollar");
 
			pound = amount * 0.90;
			System.out.println("Your " + amount + " euro is : " + f.format(pound) + " Pound");
 
			
		} 
		
	}
	}
