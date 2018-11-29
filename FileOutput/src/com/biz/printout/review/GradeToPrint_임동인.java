package com.biz.printout.review;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.printout.vo.GradeVO;

public class GradeToPrint_임동인 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 성적정보를 저장할 List 선언,생성
		List<GradeVO> gradeList = new ArrayList();
		
		// 성적정보 30개 생성
		for(int i = 0 ; i < 30 ; i++) {
			
			// i 변수를 사용 학번생성
			String strNum = "" + (i+1);
			
			// 50부터 100까지 범위의 수를 랜덤하게 발생해 각 과목의 점수를 생성
			int intK = (int)(Math.random() * (100-50+1))+50;
			int intE = (int)(Math.random() * (100-50+1))+50;
			int intM = (int)(Math.random() * (100-50+1))+50;
			
			// 리스트에 성적정보를 추가하기위해 학생정보 초기화
			GradeVO gradeVo = new GradeVO();
			
			// 새로 생성된 학생의 정보를 셋팅
			gradeVo.setStrNum(strNum);
			gradeVo.setIntKor(intK);
			gradeVo.setIntEng(intE);
			gradeVo.setIntMath(intM);
			
			// 세팅된 학생 성적을 List에 추가
			gradeList.add(gradeVo);
			
		}
		String printFile = "D:\\bizwork\\workspace\\ExFiles\\gradeList.txt";
		
		PrintWriter pw;
		
		try {
			// printFile을 저장하기위한 용도로 open하고 관련정보를 pw에 저장한다
			pw = new PrintWriter(printFile);
			for(int i = 0 ; i < gradeList.size();i++) {
				GradeVO vo = gradeList.get(i);
			
				pw.println(vo.getStrNum()+":"
						+vo.getIntKor()+":"
						+vo.getIntEng()+":"
						+vo.getIntMath());
			 
			}
			pw.close();
			System.out.println("저장 완료!!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*
		 * 위에서 생성된 gradeList를 활용하여 .../gradeList.txt 파일을 생성하시오
		 * 각 라인의 구성은 학번:국어점수:영어점수:수학점수 
		 * 형식으로 저장하시오
		 */
		

		}
	}



