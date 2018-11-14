package com.biz.method.classes.wrapper;

public class String02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNation = "Repulbic of Korea";
		String strLower = strNation.toLowerCase();
		String strUpper = strNation.toUpperCase();
		
		String strWord = strNation.substring(0,7);
		System.out.println(strWord);
		
		String strKorea = strNation.substring(12,13);
		System.out.println(strKorea);
		
		String strOf = strNation.substring(9,11);
		
		System.out.println(strNation.split(" "));
		
		String strNum1 = "30";
		String strNum2 = "40";
		System.out.println(strNum1 + strNum2);
				
				

	}

}






