package com.day19;



import java.util.regex.*;

class Validate{

 
 public static boolean isValidUsername(String name)
 {

    
     String regex = "^[A-Za-z]\\w{5,29}$";
     String regex1 = "^(?=.*[0-9])"
             + "(?=.*[a-z])(?=.*[A-Z])"
             + "(?=.*[@#$%^&+=])"
             + "(?=\\S+$).{8,20}$";
     Pattern p = Pattern.compile(regex);
     if (name == null) {
         return false;
     }
     Matcher m = p.matcher(name);
     return m.matches();
 }

 public static boolean isValidPassword(String name)
 {

   
     String regex = "^(?=.*[0-9])"
             + "(?=.*[a-z])(?=.*[A-Z])"
             + "(?=.*[@#$%^&+=])"
             + "(?=\\S+$).{8,20}$";
     Pattern p = Pattern.compile(regex);
     if (name == null) {
         return false;
     }
     Matcher m = p.matcher(name);
     return m.matches();
 }


 public static void main(String[] args)
 {
     String str1 = "mahesh";
     System.out.println(isValidUsername(str1));
     String str5 = "snmn120@";
     System.out.println(isValidPassword(str5));
 }
}
