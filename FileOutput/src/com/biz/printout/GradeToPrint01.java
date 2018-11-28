package com.biz.printout;

import java.util.ArrayList;
import java.util.List;

import com.biz.printout.vo.GradeVO;

public class GradeToPrint01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<GradeVO> gradeList = new ArrayList();
		
		for(int i = 0 ; i < 30 ; i++) {
			String strNum = "" + (i+1);
			int intKor = (int)(Math.random() * (100-50+1)) + 50;
			int intEng = (int)(Math.random() * (100-50+1)) + 50;
			int intMath = (int)(Math.random() * (100-50+1)) + 50;
			
			GradeVO gradeVO = new GradeVO();
			gradeVO.setStrNum(strNum);
			gradeVO.setIntKor(intKor);
			gradeVO.setIntEng(intEng);
			gradeVO.setIntMath(intMath);
			gradeList.add(gradeVO);
		}
		
		/*
		 * 위에서 생성된 gradeList 를 활용하여
		 * ../gradeList.txt 파일을 생성하시오
		 * 각 라인의 구성은
		 * 학번:국어점수:영어점수:수학점수
		 * 1:90:80:70
		 * 형식으로 저장하시오
		 */
		for( int i = 0 ; i < gradeList.size();i++) {
			GradeVO vo = gradeList.get(i);
			String strNum = vo.getStrNum();
			int intKor = vo.getIntKor();
			
		}
		
		

	}

}


