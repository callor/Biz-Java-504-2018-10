package com.biz.ex02;

import java.util.List;

import com.biz.ex02.vo.GradeVO;
import com.biz.ex02.vo.TestVO;

public class Exec07 {

	List<GradeVO> gradeVO ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestVO testVO = new TestVO();
		testVO.strTest1 = "Korea";
		testVO.strTest2 = "대한민국";
		
		testVO.intEng = 1000;
		testVO.setIntKor(1000);

	}
	

}
