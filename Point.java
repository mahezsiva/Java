package com.demo;

public class Point {
	private int x;
	private int y;
	Point(){
		System.out.println("default constructor");
	}
	 Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void setx(int x){
		this.x=x;
	}
	public void sety(int y){
		this.y=y;
	}
	public void setxy(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void distance(Point p1,Point p2){
		new Point();
		new Point();
		p1.x=10;
		p2.x=20;
		System.out.println(p1.x+" "+p2.x);
		
	}
	
	public static void main(String[] args) {
		Point ref=new Point(2,5);
		Point ref1=new Point();
		Point ref2=new Point();
		
		ref.setx(3);
		ref.sety(6);
		ref.setxy(7, 8);
		ref.distance(ref1, ref2);
		
		
		
		
	}

}
