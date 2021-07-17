package com.day23;


//static method
interface TestInterface {
	   boolean test(int a);
	}
	class Test {
	   
	   static boolean check(TestInterface ti, int b) {
	      return ti.test(b);
	   }
	}
	public class Lambdaexpression {
	   public static void main(String arg[]) {
	      boolean result = Testdemo.check((x) -> (x%2) == 0, 10);
	      System.out.println("The result is: "+ result);
	   }
	}
