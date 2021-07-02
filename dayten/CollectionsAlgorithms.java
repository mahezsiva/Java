package com.dayten;

import java.util.*;

public class CollectionsAlgorithms {

	public static void main(String[] args) {
	
		
	    List<Integer> ref=new LinkedList<Integer>();
		ref.add(10);
		ref.add(56);
		ref.add(90);
		
		Comparator <Integer> rev=Collections.reverseOrder();
		Collections.sort(ref,rev);
		for(int i:ref){
			System.out.println("reverse element are="+i);
		}
		Collections.shuffle(ref);
		for(int i:ref){
			System.out.println("shuffled element are="+i);
		}
		System.out.println("the maximum element="+Collections.max(ref));
		System.out.println("the maximum element="+Collections.min(ref));
		

	}

}
