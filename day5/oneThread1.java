package com.test.day5;

public class oneThread1 extends Thread {
    public void run()
    {
        System.out.println("running ");
        try {
            Thread.sleep(2000);
            for(int i=0;i<5;i++){
            	System.out.println(i);
            }
        }
        catch (InterruptedException ie) {
        }
       
    }
    public static void main(String[] args)
    {
        oneThread1 c1 = new oneThread1();
        oneThread1 c2 = new oneThread1();
        c1.start();
  
        try {
            c1.join(); // Waiting for c1 to finish
        }
        catch (InterruptedException ie) {
        }
  
        c2.start();
       
    }
}