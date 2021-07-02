package com.daynine;

import java.util.ArrayDeque;
import java.util.Deque;

public class stack {

	public static void main(String[] args) {
		ArrayDeque<String> obj = new ArrayDeque<String>();
		
		  obj.push("akash");
	      obj.push("ajay");
	      obj.push("arvind");
	      obj.push("balu");
	      obj.push("bala");
	      obj.push("krishna");
	      System.out.println(obj);
	      obj.pop();
	      System.out.println(obj);
	      obj.pop();
	      System.out.println(obj);
	      obj.addFirst("akash");
	      System.out.println(obj);
	      obj.addLast("ajay");
	      System.out.println(obj);
	      System.out.println( obj.getFirst());
	      System.out.println( obj.getLast());
	      obj.clear();
	      System.out.println(obj);
	}

}