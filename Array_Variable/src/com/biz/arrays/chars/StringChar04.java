package com.biz.arrays.chars;

public class StringChar04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strText = "나는 자랑스러운 태극기 앞에";
		strText += " 자유롭고 정의로운 대한민국의";
		strText += "무궁한 영광을 위하여 충성을";
		strText += "다 할 것을 굳게 다짐합니다" ;
		
		// strText 문자열을 char 배열로 생성
		// String형을 char[] 형으로 변환
		char[] charText = strText.toCharArray();
		for(char c : charText) {
			System.out.print(c + ", ");
		}
		System.out.println();
		
		// charText 배열을 다시 문자열로 변환
		strText = "" ; // strText를 비우기
		strText = new String(charText,0,charText.length);
		
		// 수동으로 char배열을 String으로 변환시키기
		strText = "";
		for(int i = 0 ; i < charText.length ; i++) {
			strText += String.valueOf(charText[i]);
		}
		System.out.println(strText);
		
	}

}





