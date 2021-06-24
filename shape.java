package com.demo.test;


class Rectangle {
	
	int length;
    int breadth;

    public Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
        
    }
    void area() {
    	int ar=length*breadth;
    	System.out.println("Area of Rectangle is "+ar);
    }
    void perimeter() {
    	int per=2*(length+breadth);
    	System.out.println("Perimeter of Rectangle is "+per);
    }
	
}
 class Square extends Rectangle {
	static int side;
	Square(int s){
		super(s,s);
		
		this.side=s;
	
	
	int ar=s*s;
	System.out.println("Area of Square is "+ar);
}
}
	public class shape {
	
	public static void main(String[] args) {
		Square s = new Square(5);
		Rectangle r=new Rectangle(6,7);
        r.area();
        r.perimeter();
        s.area();
        
	}

}


