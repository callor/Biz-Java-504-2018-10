package com.biz.printout.review;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.printout.vo.GradeVO;

public class GradeToPrint_이주현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<GradeVO> gradeList = new ArrayList();
		
		for(int i = 0 ; i < 30 ; i++) {
			String strNum = ""+(i+1);
			int intKor = (int)(Math.random() * (100 - 50 + 1)) + 50;
			int intEng = (int)(Math.random() * (100 - 50 + 1)) + 50;
			int intMath = (int)(Math.random() * (100 - 50 + 1)) + 50;
			
			GradeVO gradeVO = new GradeVO();
			gradeVO.setStrNum(strNum);
			gradeVO.setIntKor(intKor);
			gradeVO.setIntEng(intEng);
			gradeVO.setIntMath(intMath);
			gradeList.add(gradeVO);
			
			
		}
		System.out.println(gradeList);
		
		/*
		 * 위에서 생성된 gradeList 를 활용하여
		 * ../gradeList.txt 파일을 생성하시오
		 * 각 라인의 구성은
		 * 학번 : 국어점수 : 영어점수 : 수학점수
		 * 1:90:80:70
		 * 형식으로 저장하시오
		 */
		
		String printFile 
	    = "E:\\bizwork\\workspace\\ExFiles\\gradeList.txt";
		
		PrintWriter pw;
	    
		
		
		try {
		    pw = new PrintWriter(printFile);
		
			for(int i = 0 ; i < gradeList.size() ; i++) {
				
				GradeVO gradeVO = gradeList.get(i);
				
			pw.print(gradeVO.getStrNum() + ":");
			pw.print(gradeVO.getIntKor() + ":");
			pw.print(gradeVO.getIntEng() + ":");
			pw.println(gradeVO.getIntMath() );
			}
			pw.close();
			System.out.println("완료");
		}
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
