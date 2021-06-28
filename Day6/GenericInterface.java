package com.day6;



interface g<y>{
	void setvalue(y t);
	void getvalue();
}
 class gclass<T> implements g<T>{
	private T t;
	 public void setvalue(T t) {
		this.t=t;
	}
	public void getvalue() {
		System.out.println(t);
		
	}
	 
 }
public class GenericInterface {

	public static void main(String[] args) {
		
		gclass<Integer> obj = new gclass<Integer>();
		obj.setvalue(555);
		obj.getvalue();
	}

}