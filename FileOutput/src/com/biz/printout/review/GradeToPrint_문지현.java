package com.biz.printout.review;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.printout.vo.GradeVO;

public class GradeToPrint_문지현 {
	public static void main(String[] args) {

		List<GradeVO> gradeList = new ArrayList();

		for (int i = 0; i < 30; i++) {
			String strNum = "" + (i + 1);
			int intKor = (int) (Math.random()*(100 - 50 + 1)) + 50;
			int intEng = (int) (Math.random()*(100 - 50 + 1))+ 50;
			int intMat = (int) (Math.random()*(100 - 50 + 1))+ 50;

			GradeVO gradeVO = new GradeVO();
			gradeVO.setStrNum(strNum);
			gradeVO.setIntKor(intKor);
			gradeVO.setIntEng(intEng);
			gradeVO.setIntMath(intMat);
			gradeList.add(gradeVO);
		}

		String printFile = "D:/bizwork/workspace/ExFiles/gradeList.txt";
		FileWriter fw;
		PrintWriter pw;
		
	
		try {
			fw = new FileWriter(printFile);
			pw = new PrintWriter(fw);
		for(int i = 0 ; i  < gradeList.size(); i++) {
			GradeVO vo = gradeList.get(i) ;
			String strNum = vo.getStrNum() ;
			int intKor = vo.getIntKor() ;
			int intEng = vo.getIntEng();
			int intMat = vo.getIntMath();
		
				pw.println(strNum+":"+intKor+":"+intEng+":"+intMat);

			}
			pw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}