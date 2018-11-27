package com.biz.ex02;

import com.biz.ex02.vo.TestVO;

public class Exec01 {

	// Ctrl + F11(Run)을 해서 코드를 테스트 해보려면
	// 현재 보고있는 클래에서 main method가 있어야 한다
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a ;
		String s;
		
		a = 100;
		s = "Korea";

		TestVO testVO; // TestVO라는 클래스(바구니)를
					   // testVO라는 객체선언
		
		testVO = new TestVO(); 
		// 초기화 : testVO에 포함된 변수에서 값을 읽거나
		// 		저장하기 위해 실행하는 명령
		
		TestVO testVO1 = new TestVO();
		testVO1.strTest1 = "Korea";
		testVO1.strTest2 = "대한민국";
		
		System.out.println(a);
		System.out.println(s);
		System.out.println(testVO1.strTest1);
		System.out.println(testVO1.strTest2);
		
	}

}
