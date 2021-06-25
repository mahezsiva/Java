package com.test.proj.timeconverter;

public class TimeConverter {
	static void ConvertHours(int n)
	{
	 int minutes, seconds;
	 
	    minutes = n * 60;
	    seconds = n * 3600;
	 
	    System.out.println( "Minutes = " + minutes
	        + ", Seconds = " + seconds);
	}
	 
	
	    public static void main (String[] args) {
	    int n = 5;
	    ConvertHours(n);
	    int min=120;
	    int hours=min/60;
	    int sec=min*3600;
	    System.out.println("hours="+hours+" second="+sec);
	    }
	     
	}


