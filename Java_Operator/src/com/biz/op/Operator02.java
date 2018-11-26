package com.biz.op;

public class Operator02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// &&  : AND ( x ), 둘다참일때 참
		boolean boolA = (30 == 40) && (40 <= 50);
		
		// || : OR ( + ), 둘중 1개만 참이어도 참
		boolean boolB = (30 <= 40) || (40 >= 50);

		// p 78, 79 연산 우선순위 참조
		boolean boolC = ((30 < 40) || (40 >=50)) && (50 > 60);
		System.out.println(boolC);

	}
}
