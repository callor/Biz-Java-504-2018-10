package com.biz.ex02;

import java.util.Scanner;

import com.biz.ex02.vo.GradeVO;

public class GradeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		GradeVO gradeVO = new GradeVO();
		
		System.out.print("학번 >> ");
		gradeVO.setStrNum(scanner.nextLine());

		// 국어, 영어, 수학 성적은 변수가 int 형인데
		// scanner.nextLine() 읽어들인 값은 String 형이다.
		// String형을 int 형으로 변환시켜야 한다.
		
		System.out.print("국어>> ");
		
		String strKor = scanner.nextLine();
		int intKor = Integer.valueOf(strKor);
		gradeVO.setIntKor(intKor);
		
		
		System.out.print("영어>> ");
		// gradeVO.setIntEng(Integer.valueOf(scanner.nextInt()));
		String strEng = scanner.nextLine();
		int intEng = Integer.valueOf(strEng);
		gradeVO.setIntEng(intEng);
		
		
		
		
		System.out.print("수학>> ");
		String strMath = scanner.nextLine();
		int intMath = Integer.valueOf(strMath);
		gradeVO.setIntMath(intMath);
		
		int intSum = gradeVO.getIntKor();
		intSum += gradeVO.getIntEng();
		intSum += gradeVO.getIntMath();
		gradeVO.setIntSum(intSum);
		
		float floatAvg = intSum / 3.0f;
		floatAvg = (float) intSum / 3;
		
		gradeVO.setFloatAvg(floatAvg);
		
		System.out.println(gradeVO);
		System.out.println(gradeVO.toString());
	}

}
