package com.biz.arrays.ext;

public class ArrayString02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열하고 문자열의 관계에서 
		// 문자열을 배열로 바꾸는 몇가 사항에 대해 살펴보자
		String strNation = "Republic of Korea";
		String[] arrWord = strNation.split(" ");
		for(int i = 0 ; i < arrWord.length ; i++) {
			System.out.println(arrWord[i]);
		}
		
		strNation ="대 한 민 국 만세";
		arrWord = strNation.split(" ");
		
		System.out.println(arrWord.length);
		for(int i = 0 ; i < arrWord.length;i++) {
			System.out.println(arrWord[i]);
		}
		
		String strGrade = "001:홍길동:98:88:87:67";
		String[] arrGrade = strGrade.split(":");
		
		System.out.println("학번:" + arrGrade[0]);
		System.out.println("이름:" + arrGrade[1]);
		System.out.println("국어:" + arrGrade[2]);
		System.out.println("수학:" + arrGrade[3]);
		System.out.println("영어:" + arrGrade[4]);
		System.out.println("과학:" + arrGrade[5]);
		
		int intKor = Integer.valueOf(arrGrade[2]);
		int intEng = Integer.valueOf(arrGrade[3]);
		int intMath = Integer.valueOf(arrGrade[4]);
		int intSci = Integer.valueOf(arrGrade[5]);
		
		int intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		intSci += intSci;
		
		intSum = 0 ;
		for(int i = 2; i < 6;i++) {
			intSum += Integer.valueOf(arrGrade[i]);
		}
		

	}

}





