package com.test.proj.converter;

import java.util.Scanner;

public class KmAndMeter
{
 public static void main(String[] args) 
 {
  //Program to convert km to m and vice versa
  System.out.println("k to convert km to m");
  System.out.println(" m to convert m to km");
  
  Scanner scan = new Scanner(System.in);
  String ch = scan.next();
   
  if (ch.charAt(0)=='k')
  {
   System.out.println("enter km value");
   double km = scan.nextDouble();
   double meter= km*1000;
   System.out.println("meter: "+meter);
 
  }
   
  else if(ch.charAt(0)=='m')
  {
   System.out.println("enter meter value");
   double meter = scan.nextInt();
   double km = meter/1000;
   System.out.println("km: "+km);
  }
   
  else
  {
   System.out.println("invalid entry");
  }
 }
}
