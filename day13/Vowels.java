package com.day13;

import java.util.Scanner;

public class Vowels {
	public static void main(String[]args){
		Scanner ref=new Scanner(System.in);
		System.out.println("enter the string");
		String res=ref.nextLine();
		char ch[]=res.toCharArray();
		
		int i=0;
		int count=0;
		while(i<ch.length){
			
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='E'||ch[i]=='A'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
				
				System.out.println("the vowels are="+ch[i]);
				count++;
				
				
			}
			i++;
			
			
			
		}
		System.out.println("the no of elements are="+count);
		
	}

}
