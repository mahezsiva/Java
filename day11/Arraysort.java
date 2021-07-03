package com.day11;

import java.util.Arrays;

public class Arraysort {
   public static void main(String[] args) {

     
      Object arr[] = {113,45,76,89};

     
      Arrays.sort(arr);

    
      System.out.println("The sorted array is:");
      for (Object number : arr) {
         System.out.println("Number = " + number);
      }

      int searchVal = 89;

      int retVal = Arrays.binarySearch(arr,searchVal);

      System.out.println("The index of element 89 is : " + retVal);
   }
}