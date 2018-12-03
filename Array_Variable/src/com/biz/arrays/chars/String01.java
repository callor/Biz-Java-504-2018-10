package com.biz.arrays.chars;

public class String01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strName1 = "홍길동";
		String strName2 = "홍길동";
		
		System.out.println(strName1.hashCode());
		System.out.println(strName2.hashCode());
		
		// 문자열이 저장된 변수의 hashcode가 같냐 라고
		// 물어보는 결과
		// 그래서 어떤때는 같고, 어떤때는 다르다
		// 특히 자바 버전에 따라 그 결과가 완전히 다르다
		if(strName1 == strName2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		// 문자열 변수에 저장된 내용을 비교할때는
		if(strName1.equals(strName2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}

	}

}





