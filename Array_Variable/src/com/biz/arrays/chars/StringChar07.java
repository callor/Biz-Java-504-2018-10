package com.biz.arrays.chars;

public class StringChar07 {

	
	/*
	 * 문자열 strNation을 char 배열로 바꾼 후
	 * 문자열을 거꾸로 콘솔에 출력하시오
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNation = "Republic of Korea";
		char[] charN = strNation.toCharArray();
		char[] charR = new char[charN.length];
		
		int intCount = charN.length;
		for(char c : charN ) {
			charR[--intCount] = c;
		}
		
		for(int i = 0 ; i < charN.length ;i++) {
			int intR = charN.length - i -1 ;
			charR[intR] = charN[i];
		}
		
		for(int i  : charR) {
			System.out.print((char)i + ", ");
		}
		System.out.println();
		
		// 역순이된 문자열로 재 생성
		String strRNation = new String(charR,0,charR.length);
		System.out.println(strRNation);
		
		
		
		
	}

}
