package com.biz.come;

public class ComeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getRndDate());

	}
	
	public static String getRndDate() {
		int[] iMaxDay = {
				31,//1
				28,//2
				31,//3
				30,//4
				31,//5
				30,//6
				31,//7
				31,//8
				30,//9
				31,//10
				30,//11
				31//12
		};
		
		// 1~12
		int iMonth = (int)(Math.random() * (iMaxDay.length)) + 1;
		int iDays = (int)(Math.random() 
				* (iMaxDay[iMonth-1])-1) + 1;
		
		String rndDate 
		= String.format("2018-%02d-%02d", iMonth, iDays);
		return rndDate;
		
	}

}
