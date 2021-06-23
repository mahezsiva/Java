package com.demo;

public class ElectricityBill {
	String Ebconnection; 
	double currentbillpay;
	int Consumerno;
	String consumername;
	int previousmonthreading; 
	int currentmonthreading; 
		public void bill(String type){
			if(type=="domestic"){
			
			if(currentmonthreading<100){
				currentbillpay=currentmonthreading*1;
				
			}
			else if(currentmonthreading<=200&&currentmonthreading>=101){
				currentbillpay=currentmonthreading*2.50;
			}
			else{
				if(currentmonthreading<=500&&currentmonthreading>=201){
					currentbillpay=currentmonthreading*4;
				}
				
			}
	            System.out.println("domestic pay for the month="+currentbillpay);
	            System.out.println("consumer name="+consumername);
	            System.out.println("consumer no="+Consumerno);
	            System.out.println("connection type="+Ebconnection);
	       
	            
		}else{
			if(currentmonthreading<100){
				currentbillpay=currentmonthreading*2;
				
			}
			else if(currentmonthreading<=200&&currentmonthreading>=101){
				currentbillpay=currentmonthreading*4.5;
			}
			else{
				if(currentmonthreading<=500&&currentmonthreading>=201){
					currentbillpay=currentmonthreading*6;
				}
				else{
					
					currentbillpay=currentmonthreading*7;
				}
				
					
				
			}
			    System.out.println("pay for the month="+currentbillpay);
	            System.out.println("consumer name="+consumername);
	            System.out.println("consumer no="+Consumerno);
	            System.out.println("connection type="+Ebconnection);
	           
			
			
		}
			
		}
	
	public static void main(String[]args){
		ElectricityBill ref=new ElectricityBill();
		
		ref.Ebconnection="commercial";
		ref.Consumerno=11234;
		ref.consumername="vivek";
		ref.previousmonthreading=400; 
		ref.currentmonthreading=300; 
	    ref.bill(ref.Ebconnection);
		
		
		
	}

}
