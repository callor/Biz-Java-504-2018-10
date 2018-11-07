package com.biz.control;

public class Control10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 100; i++) {
			int m = (i % 5);
			if(m == 0) {
				System.out.println(i + "는 5의 배수");
			} else if(i % 4 == 0) {
				System.out.println(i + "는 4의 배수");
			} else if(i % 3 == 0) {
				System.out.println(i + "는 3의 배수");
			} else if(i % 2 == 0) {
				System.out.println(i + "는 2의 배수");
			} else {
				System.out.println("몰라");
			}
		}

	}

}
