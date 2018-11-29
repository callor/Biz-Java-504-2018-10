package com.biz.printout.review;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.printout.vo.GradeVO;

public class GradeToPrint_고재범 {
	public static void main(String[] args) {
		List<GradeVO> gradeList = new ArrayList();

		for (int i = 0; i < 30; i++) {
			GradeVO gradeVO = new GradeVO();
			int intKor = (int) (Math.random() * (100 - 50 + 1));
			int intEng = (int) (Math.random() * (100 - 50 + 1));
			int intMath = (int) (Math.random() * (100 - 50 + 1));

			gradeVO.setStrNum(""+(i + 1));// 학번
			gradeVO.setIntKor(intKor);//국어점수
			gradeVO.setIntEng(intEng);//영어점수
			gradeVO.setIntMath(intMath);//수학점수
			gradeList.add(gradeVO);//gradeList에 gradeVO 값 넣어줌
			int intSum1 = gradeVO.getIntKor() 
					+ gradeVO.getIntEng() + gradeVO.getIntMath();
			//intSum1에 국어,영어,수학점수들의 합 저장
			gradeVO.setIntSum(intSum1);//gradeVO의 intSum에 intSum1의 값 저장
			gradeVO.setFloatAvg(intSum1 / 3);//gradeVO의 fNum에 intSum1을 3으로 나눈 값 저장
		}

		String printFile = "D:/workspace/project1/Exfiles/gradeList.txt";
		//String형 printFile에 gradeList.txt위치 저장
		PrintWriter pw ;//PrintWriter클래스의 객체 pw 선언
		try {
			pw = new PrintWriter(printFile);//pw초기화
			

			for (int i = 0; i < gradeList.size(); i++) {
				pw.print(gradeList.get(i).getStrNum() + ":");
				pw.print(gradeList.get(i).getIntKor() + ":");
				pw.print(gradeList.get(i).getIntEng() + ":");
				pw.println(gradeList.get(i).getIntMath());

			}
			pw.close();
			System.out.println("완료");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
