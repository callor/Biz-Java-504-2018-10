package com.biz.arrays.chars;

public class StringChar10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strNation = "우리나라 대한민국 만세";
		
		// 문자열을 char배열로 변환
		char[] charNation = strNation.toCharArray();
		
		// 문자(1글자) 를 문자열로 변환
		String s1 = String.valueOf('C');
		
		// 문자를 덧셈연결해서 문자열로 변환시킬수 없을까?
		String s2 = "" + 'C' + 'D' ;
		String s3 = String.valueOf('C' + 'D') ;
		// 97 + 98을 덧셈 수행한 후 결과를 문자열로 바꾼것
		
		String s4 = String.valueOf('C') 
				  + String.valueOf('D');
		
		System.out.println("s2 :" + s2);
		System.out.println("s3 :" + s3);
		System.out.println("s4 :" + s4);
		
		// char[] 배열을 문자열로 바꾸기
		String char2str 
			= new String(charNation,0,charNation.length);
		
		char2str = new String(charNation,3,6);
		// char2str.substring(3,6)
		
		System.out.println(char2str);

	}

}
