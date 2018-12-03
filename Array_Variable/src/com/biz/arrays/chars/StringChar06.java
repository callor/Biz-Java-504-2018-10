package com.biz.arrays.chars;

public class StringChar06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strText = "나는 자랑스러운 태극기 앞에";
		strText += " 자유롭고 정의로운 대한민국의";
		strText += "무궁한 영광을 위하여 충성을";
		strText += "다 할 것을 굳게 다짐합니다" ;
		
		// 문자열을 char[] 로
		char[] charText = strText.toCharArray();
		int textLength = charText.length;
		
		char[] secText = new char[textLength];
		
		for(char c : charText) {
			System.out.print(c);
		}
		System.out.println();
		
		for(int i : charText) {
			System.out.print(i+", ");
		}
		System.out.println();
		
		for(int i : charText) {
			System.out.print( (i+'A') + ", " );
		}
		System.out.println();

		for(char c : charText) {
			System.out.print( (char)(c+'A') + ", " );
		}
		System.out.println();

		

	}
}





