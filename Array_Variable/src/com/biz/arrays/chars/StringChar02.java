package com.biz.arrays.chars;

public class StringChar02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strText = "나는 자랑스러운 태극기 앞에";
		strText += " 자유롭고 정의로운 대한민국의";
		strText += "무궁한 영광을 위하여 충성을";
		strText += "다 할 것을 굳게 다짐합니다" ;

		// String에 자주 문자열을 추가하고자 하는경우
		// 사용하는 Upgrade된 String 클래스
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append("나는 자랑스러운 태극기 앞에");
		strBuffer.append(" 자유롭고 정의로운 대한민국의");
		strBuffer.append("무궁한 영광을 위하여 충성을");
		strBuffer.append("다 할 것을 굳게 다짐합니다");
		
		System.out.println(strBuffer);
		
		
		
	}

}




