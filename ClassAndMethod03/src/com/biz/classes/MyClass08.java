package com.biz.classes;

public class MyClass08 {

	public void show(char c1, char c2) {
		for(int i = c1 ; i <= c2 ; i++) {
			System.out.print((char)i);
		}
		
		
		String s = "";
		for(int i = c1 ; i <= c2 ; i++) {
			char c = (char)i;
			s += String.valueOf(c);
		}
		System.out.println(s);
	}
	
}
