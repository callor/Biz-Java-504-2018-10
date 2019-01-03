package com.biz.grade.exec;

public class GradeExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		String sample = "0000000";
		int sLength = sample.length();
		
		for(int i = 0 ; i < 10 ; i++) {
			String num = sample + (i+1);
			int sEnd = num.length();
			int sStart = sEnd - sLength ;
			num = num.substring(sStart, sEnd);
			System.out.println(num);
		}
		
		
		
	}
}



