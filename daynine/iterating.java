package com.daynine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iterating {
	public static void main(String args[])
    {

    ArrayList<Integer> arr = new ArrayList<Integer>();
    arr.add(10);
    arr.add(20);
    arr.add(45);
    arr.add(55);
    System.out.println(arr);
    Iterator<Integer> ite = arr.iterator();
    
    while (ite.hasNext()){
    	System.out.println("iterator values: "+ite.next());
    }
  
    
    ListIterator<Integer> itr =  arr.listIterator();
    while (itr.hasNext()){
    	System.out.println("iterating values: "+itr.next());
    	
    }
    while (itr.hasPrevious()) {
        System.out.println("list iterating values: "+itr.previous());
    }
    
    
    }
}