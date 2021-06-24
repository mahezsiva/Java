package com.demo;

abstract class pen{
	abstract void write();
	abstract void refill();

	
}
 class fountainpen extends pen{

	@Override
	void write() {
		System.out.println("it can be used for a long time");
		
	}

	@Override
	void refill() {
		System.out.println("dont need to refill for one year");
		
	}
	void changenib(){
		System.out.println("change the nib for every 6 months");
	}
	
}


public class writting {

	public static void main(String[] args) {
		fountainpen ref=new fountainpen();
		ref.changenib();
        ref.refill();
        ref.write();
	}

}
