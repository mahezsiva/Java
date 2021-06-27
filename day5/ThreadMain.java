package com.test.day5;

import java.util.Random;

class Square extends Thread

{

 int x;

 Square(int x)

 {

this.x = x;

 }

 public void run()

 {

 int sqr = x * x;

 System.out.println("Square of " + x + " = " + sqr );

 }

}

class Cube extends Thread

{

 int x;

 Cube(int x){

 this.x = x;

 }

 public void run()

 {

 int cub = x * x * x;

 System.out.println("Cube of " + x + " = " + cub );

 }

}

class Number extends Thread

{

 public void run()

 {

 Random random = new Random();

 for(int i =0; i<10; i++)

 {

 int randomInteger = random.nextInt(10000);

 System.out.println("generating random number : " + randomInteger);
if(randomInteger%2==0) {
 Square s = new Square(randomInteger);

 s.start();
}else {
 Cube c = new Cube(randomInteger);

 c.start();
}
 try {

 Thread.sleep(1000);

} catch (InterruptedException ex) {

 System.out.println(ex);

}

 }

 }

}

public class ThreadMain {

 public static void main(String args[])

 {

 Number n = new Number();

 n.start();

 }
}