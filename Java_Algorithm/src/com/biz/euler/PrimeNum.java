package com.biz.euler;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 아래 숫자가 소수인지 판별하라
		int intNum = 3324;
		for(int i = 2 ; i < 3324 ;i++) {
			if(intNum % i == 0) {
				System.out.println("소수 아님");
				break;
			}
		}
		
		intNum = (int)(Math.random() * (100-2 + 1)) + 2 ;
		int j = 2;
		for(; j < intNum; j++) {
			if(intNum % j == 0 ) break;
		}
		// 위의 for 문이 중단되거나 완료되었을때
		// j의 값을 검사하면
		// intNum가 소수인지 아닌지를 판단할 수 있다.
		if(j >= intNum) {
			System.out.println(intNum + "는 소수입니다");
		} else {
			System.out.println(intNum + "는 소수가 아닙니다");
		}
		System.out.println(j);
		
		int primeNum = 0;
		for(int num = 2; num < 987456; num++) {
			int index = 0;
			for(index = 2 ; index < num ; index++) {
				if(num % index == 0) break;
			}
			if(index >= num) {
				primeNum = num;
				// System.out.println(num + "는 소수");
			}
		}
		System.out.println("가장큰 소수:" + primeNum);
	}

}
