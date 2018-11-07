package com.biz.control;

public class Control11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strName = "커피믹스";
		int intValue = 2000;
		
		if(strName == "햇반") {
			System.out.println("VAT는 10% 입니다");
			System.out.println("따라서 세금은: " 
					+ (intValue * 0.1) + "입니다");
		}
		if(strName == "도시락") {
			System.out.println("VAT 7%입니다");
			System.out.println("따라서 세금은:"
					+ (intValue * 0.07) + "입니다");
		}
		if(strName == "커피믹스") {
			System.out.println("VAT 12%입니다");
			System.out.println("따라서 세금은:"
					+ (intValue * 0.12) + "입니다");
		}

		
	}

}
