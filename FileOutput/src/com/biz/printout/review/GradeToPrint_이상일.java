package com.biz.printout.review;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.printout.vo.GradeVO;

public class GradeToPrint_이상일 {
	
	public static void main(String[] args) {
		
		List<GradeVO> gradeList=new ArrayList<>();
		
		for(int i=0; i<30; i++) {
			String strNum=""+(i+1);
			int intKor=(int)(Math.random()*(100-50+1))+50;
			int intEng=(int)(Math.random()*(100-50+1))+50;
			int intMat=(int)(Math.random()*(100-50+1))+50;
			
			GradeVO vo=new GradeVO();
			vo.setStrNum(strNum);
			vo.setIntKor(intKor);
			vo.setIntEng(intEng);
			vo.setIntMath(intMat);
			gradeList.add(vo);
			
		}
		String fileName="d:/bizwork/workutf/ExFiles/gradeList.txt";
		PrintWriter pw;
		
		try {
			pw=new PrintWriter(fileName);
			
			for(GradeVO e : gradeList) {
				pw.println(e);
			}
			pw.close();
			System.out.println("End");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
























