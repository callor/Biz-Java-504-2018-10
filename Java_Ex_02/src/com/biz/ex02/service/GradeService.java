package com.biz.ex02.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.ex02.vo.GradeVO;

public class GradeService {

	public List<GradeVO> gradeList ;
	private Scanner scanner;

	public GradeService() {
		gradeList = new ArrayList();
		scanner = new Scanner(System.in);
	}

	public void makeScore(int intNum) {
		
		GradeVO gradeVO = new GradeVO();
		System.out.print("학번 >> ");
		System.out.println(intNum + 1);
		gradeVO.setStrNum("" + (intNum + 1));

		System.out.print("국어 >> ");
		String strKor = scanner.nextLine();
		int intKor = Integer.valueOf(strKor);
		gradeVO.setIntKor(intKor);

		System.out.print("영어 >> ");
		String strEng = scanner.nextLine();
		int intEng = Integer.valueOf(strEng);
		gradeVO.setIntEng(intEng);

		System.out.print("수학 >> ");
		String strMath = scanner.nextLine();
		int intMath = Integer.valueOf(strMath);
		gradeVO.setIntMath(intMath);

		int intSum = gradeVO.getIntKor();
		intSum += gradeVO.getIntEng();
		intSum += gradeVO.getIntMath();
		gradeVO.setIntSum(intSum);

		float floatAvg = (float) intSum / 3;
		gradeVO.setFloatAvg(floatAvg);
		
		gradeList.add(gradeVO);
	}

	public void viewScore() {
		System.out.println("==================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------");
		
		for(GradeVO gradeVO : gradeList) {
			System.out.print(gradeVO.getStrNum() + "\t");
			System.out.print(gradeVO.getIntKor() + "\t");
			System.out.print(gradeVO.getIntEng() + "\t");
			System.out.print(gradeVO.getIntMath() + "\t");
			System.out.print(gradeVO.getIntSum() + "\t");
			System.out.print(gradeVO.getFloatAvg() + "\n");
		}
	}

}
