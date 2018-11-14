package com.biz.method.classes.statics;

public class StaticExec01 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println(Nations.KOREA);
		System.out.println(Nations.USA);
		System.out.println(Nations.UAE);
		System.out.println(Nations.CHINA);
		
		String strNum = "30";
		int intNum = Integer.valueOf(strNum);
		
		String strName = "대한민국";
		if(strName.equals("대한 민국")) {
			
		}
		
		if(strName.equals(Nations.KOREA)) {
			
		}
		
		// Nations.KOREA 변수는 final이어서
		// 값을 변경 할 수 없다.
		// Nations.KOREA = "우리나라";
		if(strName.equals(Nations.KOREA)) {
			
		}
		

	}

}
