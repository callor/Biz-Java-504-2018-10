package com.biz.hello;

public class Hello06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strName = "Korea";
		
		Sub02 s2 = new Sub02();
		
		strName = "대한민국";
		System.out.println(strName);
		
		s2.strName = "Republic of Korea";
		
		System.out.println(strName);
		System.out.println(s2.strName);
		
		

	}

}
