package com.day23;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
//Generics
public class Main{
  public static void main(String[] argv){
    Function<String[],List<String>> asList = Arrays::<String>asList;
    
    System.out.println(asList.apply(new String[]{"ajay","arun","akash"}));
  }
}