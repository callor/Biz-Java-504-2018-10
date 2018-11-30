package com.biz.grade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.grade.vo.ScoreVO;
import com.biz.grade.vo.StudentVO;

public class GradeExec07 {

	/*
	 * 영어이름들. txt 파일을 읽어서
	 * 각 라인을 : 기준으로 자른 후
	 * sVO 리스트에 추가하시오
	 * 1:Korea:대한민국
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nameFile
		= "src/com/biz/grade/영어이름들.txt";
		
		List<StudentVO> stList = new ArrayList();
		List<ScoreVO> scoreList = new ArrayList();
		
		FileReader fr;
		BufferedReader buffer;
		
		try {
			fr = new FileReader(nameFile);
			buffer = new BufferedReader(fr);
			while(true) {
				String strLine = buffer.readLine();
				if(strLine == null) break;
				
				String[] strNames = strLine.split(":");
				if(strNames.length > 2) {
					
					StudentVO vo = new StudentVO();
					vo.setStrNum(strNames[0]);
					vo.setStrEngName(strNames[1]);
					vo.setStrKorName(strNames[2]);
					stList.add(vo);

				}
			}
			buffer.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(StudentVO sv : stList) {
			
			ScoreVO scv = new ScoreVO();
			scv.setStrNum(sv.getStrNum());
			
			int intKor 
				= (int)(Math.random() * (100-50 +1 )) + 50;
			int intEng 
				= (int)(Math.random() * (100-50 +1 )) + 50;
			int intMath 
				= (int)(Math.random() * (100-50 +1 )) + 50;
			
			scv.setIntKor(intKor);
			scv.setIntEng(intEng);
			scv.setIntMath(intMath);
			
			int intSum = intKor + intEng + intMath;
			float floatAvg = (float) intSum / 3;
			
			scv.setIntSum(intSum);
			scv.setFloatAvg(floatAvg);
			
			scoreList.add(scv);
			
		}
		
		// stList : 학생정보
		// scoreList : 성적정보
		
		System.out.println("=================================");
		System.out.println("학번\t영어이름\t한글이름\t국어점수\t영어점수");
		System.out.println("=================================");
		for(StudentVO vo : stList) {
			System.out.print(vo.getStrNum() + "\t");
			System.out.print(vo.getStrEngName() + "\t");
			System.out.print(vo.getStrKorName() + "\t");
			for(ScoreVO sc :scoreList) {
				if(vo.getStrNum().equals(sc.getStrNum())) {
					System.out.print(sc.getIntKor() + "\t");
					System.out.print(sc.getIntEng() + "\t");
					System.out.print(sc.getIntMath() + "\t");
					System.out.print(sc.getIntSum() + "\t");
					System.out.print(sc.getFloatAvg());
				}
			}
			System.out.println();
		}
	}

}
