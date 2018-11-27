package com.biz.ex02;

public class Exec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b( Integer.valueOf( a() ) );
		
		String s = a();
		int i = Integer.valueOf(s);
		b( i );

	}
	
	public static String a() {
		return "1";
	}
	
	public static int b(int num) {
		return num + num;
	}

}
