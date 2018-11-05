package com.biz.var;

public class Variable07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 선행연산자
		// 변수명 앞에 ++,-- 연산자가 먼저 오는경우
		int intNum1 = 0;
		
		++intNum1; // intNum1 을 1 증가시켜라
		intNum1 += 1;
		intNum1 = intNum1 + 1;

		--intNum1; // intNum1을 1 감소시켜라
		intNum1 -= 1;
		intNum1 = intNum1 - 1;
		
		// 후행 연산자
		// 변수명 뒤에 
		// ++, -- 연산자가 나중에 오는경
		intNum1++ ;
		intNum1 += 1;
		intNum1 = intNum1 + 1;
		
		intNum1-- ;
		intNum1 -= 1;
		intNum1 = intNum1 - 1;
		
		int intSum = 0;
		intNum1 = 0;
		
		intNum1 += 1;
		intSum += intNum1 ; // intSum > 1
		
		
		intNum1 = 0;
		intSum = 0;
		intSum += ++intNum1 ;
		System.out.println("intNum : " + intNum1);
		System.out.println("intSum : " + intSum);
		
		intSum += intNum1++ ;
		System.out.println("intNum : " + intNum1);
		System.out.println("intSum : " + intSum);
		
		
		intSum = ++intNum1;
		// 아래와 같은 코드
		intNum1 += 1;
		intSum = intNum1;
		
		intSum = intNum1++;
		intSum = intNum1;
		intNum1 +=1 ;
		
		intNum1 = 0;
		System.out.println(++intNum1);
		System.out.println(++intNum1);
		System.out.println(++intNum1);
		
		System.out.println(intNum1++);
		System.out.println(intNum1);
		
		// 먼저 intNum1을 1 증가 시킨후
		// 증가된 값을 intSum 에 누적
		intSum = ++intNum1;
		
		// 여기서는 intNum1 의 값 변화는
		// intSum의 영향을 미치지 않는다.
		intSum = intNum1 ++;
		
		
		
		
		
		
		
		
	}

}
