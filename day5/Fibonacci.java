package com.test.day5;

class  Fibon extends Thread {
	
	   private String threadName;
	   
	   Fibon( String name) {
	      threadName = name;
	      System.out.println("the thread name is"+threadName );
	   }
	   
	   public void run() {
		   int n1=0,n2=1,n3,i,count=20;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
	      try {
	    	  
	    		 
	    		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
	    		 {    
	    		  n3=n1+n2;    
	    		  System.out.print(" "+n3); 
	    		  Thread.sleep(300);
	    		  n1=n2;    
	    		  n2=n3;    
	    		 }    
	            
	         }
	      catch (InterruptedException e) {
	         
	      }

	   }
}	  

	public class Fibonacci {

	   public static void main(String args[]) {
		   Fibon  R1 = new Fibon("thread10" );
	     R1.start();
	     
	      
	   } 
}