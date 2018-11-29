package com.biz.printout.review;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.printout.vo.GradeVO;

public class GradeToPrint_이종환 {
	/*
	 * 위에서 생성된 gradeList를 활용하여
	 * ../gradeList.txt 파일을 생성하시오
	 * 각 라인의 구성은 학번:국어점수:영어점수:수학점수
	 * 형식으로 저장하시오
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<GradeVO> gradeList = new ArrayList();
		String printFile = "D:/bizwork/workspace/ExFiles/gradeList.txt";
		PrintWriter pw;
		
		for(int i = 0 ; i < 30 ; i ++ ) {
			String strNum = "" + (i+1);
			int intKor = (int)(Math.random() * (100-50+1)) + 50;
			int intEng = (int)(Math.random() * (100-50+1)) + 50;
			int intMath = (int)(Math.random() * (100-50+1)) + 50;
			
			GradeVO vo = new GradeVO();
			vo.setStrNum(strNum);
			vo.setIntKor(intKor);
			vo.setIntEng(intEng);
			vo.setIntMath(intMath);
			gradeList.add(vo);
			
		}
		try {
			pw = new PrintWriter(printFile);
			for(int i = 0 ; i < gradeList.size() ; i ++) {
				pw.println(gradeList.get(i).getStrNum() + ":" 
							+ gradeList.get(i).getIntKor() + ":"
							+ gradeList.get(i).getIntEng() + ":"
							+ gradeList.get(i).getIntMath()
							);
			}
			
			pw.close();
			System.out.println("저장 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
