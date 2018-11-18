package com.biz.arrays.ext;

public class Array04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrN1 = new int[10];
		
		int[] arrN2 = arrN1;
		int[] arrN3 = arrN2;
		
		arrN1[0] = 30;
		System.out.println(arrN1[0]);
		System.out.println(arrN2[0]);
		System.out.println(arrN3[0]);

	}
}


