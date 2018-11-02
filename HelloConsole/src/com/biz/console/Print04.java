package com.biz.console;

public class Print04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("hello");
		System.out.printf("" , 30);
		System.out.printf("" , 30+40);
		System.out.printf("", 30, 40, 30+40);
		System.out.printf("");
		
		System.out.println("================");
		System.out.printf("%d\n" , 30);
		System.out.printf("%d\n" , 30+40);
		System.out.printf("%d\n", 30, 40, 30+40);
		System.out.printf("%d + %d\n", 30, 40, 30+40);
		System.out.printf("%d + %d = %d\n", 30, 40, 30+40);
		System.out.printf("%d + %d = %d , %d\n", 30, 40, 30+40,0);
		
	}

}
