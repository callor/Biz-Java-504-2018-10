package com.biz.ex02;

import com.biz.ex02.vo.TestVO;

public class Exec04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 클래스를 객체로 생성한 후
		// 메서드에 매개변수로 전달할 경우
		// 메서드에서 객체의 member 변수를 변경(저장)하면
		// 그 값을 return 받지 않아도
		// 변경된 값을 사용할수 있다.
		TestVO testVO = new TestVO();
		testVO.strTest1 = "KOREA";
		System.out.println(testVO.strTest1);
		
		testMethod(testVO);
		System.out.println(testVO.strTest1);
	
		
	}
	
	public static void testMethod(TestVO vo) {
		vo.strTest1 = "대한민국";
	}
	
	

}
