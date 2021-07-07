package com.day12;


import java.util.Arrays;
import java.util.TreeSet;


 class Duplicate {
	   public static void main(String[] args) {
	        String[] array = new String[]{"mahesh", "siva", "siva"};
	        System.out.println("Input Array is : " + (Arrays.toString(array)));
	        TreeSet<String> treeSet = new TreeSet<String>();
	        for (String str : array) {
	            if (!treeSet.add(str)) {
	                System.out.println("Duplicate Entry is: " + str);
	            }
	        }
	        System.out.println("TreeSet is : " + treeSet);
	    }
	}