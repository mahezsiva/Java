package com.day23;


//predefined functional interfaces
interface Square
{
    int calculate(int x);
}
  
class Testdemo
{
    public static void main(String args[])
    {
        int a = 5;
        Square s = (int x)->x*x;
        int ans = s.calculate(a);
        System.out.println(ans);
    }
}
