package com.biz.var;

public class Variable06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum1 = 0;
		int intSum = 0;
		
		intNum1 = intNum1 + 1;
		intSum += intNum1; // intSum = intSum + intNum1
		intNum1 += 1; // num1 => 2
		intSum += intNum1;
		
		intNum1 += 1;
		intSum += intNum1;
		
		// 특별히 += 1 일때는
		intNum1 ++ ;
		intSum += intNum1;
		
		intNum1 ++;
		intSum += intNum1;

		++intNum1 ;
		intSum += intNum1;
		
		// 변수 앞에 ++가 나오면
		// 가장먼저 변수 = 변수 + 1을 실행
		// 그리고 그 결과를 intSum에 누적한다.
		intSum += ++intNum1 ;
		
		// ※ ※  
		intSum += intNum1++;
		// 만약 = 뒤쪽의 변수 뒤에 ++가 나오면
		// 문장이 끝나기 바로 직전에
		// 변수 = 변수 + 1을 실행한다.
	
	}

}
