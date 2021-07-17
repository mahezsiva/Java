package com.day22;

interface Gen<T>{
	T rev(T t);
}
public class Generic {

	public static void main(String[] args) {
		Gen<String> f;
		f=(s)->{
			String rs="";
			for(int i=s.length()-1;i>=0;i--)
				rs=rs+s.charAt(i);
			return rs;
			
		};
		System.out.println("Reverse of welcome "+f.rev("mahesh"));
		System.out.println("Reverse of hello "+f.rev("hello"));
		

	}

}