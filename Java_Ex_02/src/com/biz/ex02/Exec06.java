package com.biz.ex02;

public class Exec06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( e( d( c( b( a(10) ) ) ) ) );
		System.out.println(10 + 1 +1 + 1 + 1 + 1);
	}
	
	public static int a(int a) {
		return a;
	}
	public static int b(int a) {
		return a+1;
	}
	public static int c(int a) {
		return a+1;
	}

	public static int d(int a) {
		return a+1;
	}

	public static int e(int a) {
		return a+1;
	}

	
	
	
}
