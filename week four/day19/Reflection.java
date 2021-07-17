package com.day19;


import java.lang.reflect.Method;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class vehicle {

	  
	  public int cars() {
	    System.out.println("Cars");
		return 1;
	  }

	  public void bikes() {
	    System.out.println("bikes");
	  }
	}

public	class Reflection {
	  public static void main(String[] args) {
	    try {
	      vehicle s = new vehicle();
	      Class obj = s.getClass();
	      Method[] methods = obj.getDeclaredMethods();
	      for (Method m : methods) {
	        System.out.println("Method Name: " + m.getName());
	        int modifier = m.getModifiers();
	        System.out.println(modifier);
	        System.out.println("Modifier: " + Modifier.toString(modifier));

	       
	        System.out.println("Return Type: " + m.getReturnType());
	        System.out.println(" ");
	      }
	    }
	    catch (Exception e) {
	      e.printStackTrace();
	    }
	  }
	}
