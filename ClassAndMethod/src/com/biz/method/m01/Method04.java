package com.biz.method.m01;

public class Method04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5부터 10까지의 난수 발생
		for(int i = 0 ; i < 5 ; i++) {
			double dRND = Math.random();
			double dRND1 = dRND * 100; // 0 부터 99까지
			dRND1 = dRND * 50; // 0 부터 49.xx 까지
			
			dRND1 = dRND * 30; // 0 부터 29.xx 까지
			int intRND = (int)dRND1 ; // 0 부터 29까지
			intRND += 1; // 1부터 30까지
			intRND += 20; // 21부터 50까지
			
			int intStars 
			= (int)(dRND*(10-5+1)) + 5; // 5부터 10까지	
			
			intStars = (int)(dRND * (100-50 +1)) + 50;
			// 50부터 100까지 숫자를 만들어내기
			
			System.out.println(intStars);
		}

	
// 		makeStars(intStars);
	
	}

}
