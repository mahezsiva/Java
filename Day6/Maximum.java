package com.day6;

import java.util.Arrays;
import java.util.Collections;

public class Maximum {
	public static <T extends Comparable<T>> T maxValue(T[] array){       
	     T max = array[0];
	     for(T data: array){
	          if(data.compareTo(max)>0)
	              max =data;                
	     }
	     return max;
	}
		
	 public static void main(String[] args) {
		System.out.println(Collections.max(Arrays.asList(1, 3, 6, 2, 4, 5)));
	 System.out.println(Collections.max(Arrays.asList(1.7D, 3.2D, 2.5D, 2.1D, 0.05D, 1.84D)));
	
	   }

}