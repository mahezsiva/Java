package com.demo;


interface tvremote{
	public abstract void remote();
}
interface smartv extends tvremote{
	public abstract void inches();
	
}

class television implements smartv{

	@Override
	public void remote() {
		System.out.println("laser and touch screen remote");
		
	}

	@Override
	public void inches() {
		System.out.println("56 inches tv");
		
	}
	
}
public class Tv {

	public static void main(String[] args) {
		television ref= new television();
		ref.remote();
		ref.inches();
		
		

	}

}
