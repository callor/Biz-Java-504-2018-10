package com.biz.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.ex02.vo.GradeVO;

public class GradeExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List<GradeVO> gradeList = new ArrayList();
		
		for(int i = 0 ; i < 5 ; i++) {
			GradeVO vo = new GradeVO();
			
			System.out.print("학번 >> ");
			System.out.println(i + 1);
			vo.setStrNum("" + i+1);
			
			System.out.print("국어 >> ");
			String strKor = scanner.nextLine();
			int intKor = Integer.valueOf(strKor);
			vo.setIntKor(intKor);

			System.out.print("영어 >> ");
			String strEng = scanner.nextLine();
			int intEng = Integer.valueOf(strEng);
			vo.setIntEng(intEng);

			System.out.print("수학 >> ");
			String strMath = scanner.nextLine();
			int intMath = Integer.valueOf(strMath);
			vo.setIntMath(intMath);

			int intSum = vo.getIntKor();
			intSum += vo.getIntEng();
			intSum += vo.getIntMath();
			vo.setIntSum(intSum);
			
			float floatAvg = (float) intSum / 3;
			vo.setFloatAvg(floatAvg);
		}
		
		System.out.println("==================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------");
		
		int intListSize = gradeList.size();
		for(int i = 0 ; i < intListSize ; i++) {
			System.out.print(gradeList.get(i).getStrNum()+"\t");
			System.out.print(gradeList.get(i).getIntKor()+"\t");
			System.out.print(gradeList.get(i).getIntEng()+"\t");
			System.out.print(gradeList.get(i).getIntMath()+"\t");
			System.out.print(gradeList.get(i).getIntSum()+"\t");
			System.out.print(gradeList.get(i).getFloatAvg()+"\n");
		}
		
		for(int i = 0 ; i < intListSize ; i++) {
			GradeVO v = gradeList.get(i);
			System.out.print(v.getStrNum()+"\t");
			System.out.print(v.getIntKor()+"\t");
			System.out.print(v.getIntEng()+"\t");
			System.out.print(v.getIntMath()+"\t");
			System.out.print(v.getIntSum()+"\t");
			System.out.print(v.getFloatAvg()+"\n");
		}
		
		for(GradeVO v : gradeList) {
			System.out.print(v.getStrNum() + "\t");
			System.out.print(v.getIntKor() + "\t");
			System.out.print(v.getIntEng() + "\t");
			System.out.print(v.getIntMath() + "\t");
			System.out.print(v.getIntSum() + "\t");
			System.out.print(v.getFloatAvg() + "\n");
		}
		System.out.println("==================================");
				
		

	}

}
