package com.biz.printout;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.printout.vo.GradeVO;

public class GradeToPrint01 {

	public static void main(String[] args) {

		// GradeVO(성적정보)를 저장할 List 객체를 선언, 생성
		// gradeList 개수는 ? : 0 개
		List<GradeVO> gradeList = new ArrayList();
		
		// 성적정보 30개를 생성하는 부분
		for(int i = 0 ; i < 30 ; i++) {
			
			// i 변수를 사용해서 학번을 문자열로 생성
			// i 변수 값에 1을 더해서 학번 1부터 30까지 만들어지도록
			// 문자열로 변환하기 위해서 "" +
			String strNum = "" + (i+1);
			
			// 50 부터 100까지 범위의 임의 난수를 발생해서
			// 각 과목의 점수를 임의로 생성
			int intKor = (int)(Math.random() * (100-50+1)) + 50;
			int intEng = (int)(Math.random() * (100-50+1)) + 50;
			int intMath = (int)(Math.random() * (100-50+1)) + 50;
			
			// 리스트에 성적정보를 추가 하기 위해서
			// 한 학생의 성적정보를 새로 생성
			GradeVO gradeVO = new GradeVO();
			
			// 새로 생성된 학생의 성적정보에
			// 학번과 과목점수를 setting
			gradeVO.setStrNum(strNum);
			gradeVO.setIntKor(intKor);
			gradeVO.setIntEng(intEng);
			gradeVO.setIntMath(intMath);
			
			// 세팅된 한 학생의 성적정보를 gradeList에 추가
			gradeList.add(gradeVO);
			
		} // for end
		
		// 30명 학생의 성적 정보가 담긴 gradeList를 이제 확보완료!!
		
		/*
		 * 위에서 생성된 gradeList 를 활용하여
		 * ../gradeList.txt 파일을 생성하시오
		 * 
		 * 각 라인의 구성은
		 * 학번:국어점수:영어점수:수학점수
		 * 1:90:80:70
		 * 형식으로 저장하시오
		 */
		
		// 파일에 저장하기 위한 준비시작
		String saveFile = "D:/bizwork/workspace/ExFiles/gradeList.txt";
		PrintWriter pw ;
		
		try {
			// saveFile을 저장하기 용도로 open(create) 하고
			// 관련 정보를 pw에 정장 해 놓는다.
			pw = new PrintWriter(saveFile);
			// 학번:국어:영어:수학
			for(int i = 0 ; i < gradeList.size(); i++) {
				GradeVO vo = gradeList.get(i);
				String strNum = vo.getStrNum();
				int intKor = vo.getIntKor();
				int intEng = vo.getIntEng();
				int intMath = vo.getIntMath();
				
				// vo로 부터 getter해서 임시 변수에 담아놓은
				// 학번, 성적들을 파일에 기록
				pw.print(strNum + ":");
				pw.print(intKor + ":");
				pw.print(intEng + ":");
				pw.println(intMath );
			}
			// 기록이 완료된후 파일을 닫아서 완료
			pw.close();
			
			// 사용자에게 모두 완료 되었다는 메시지를 전달
			System.out.println("성적표 파일 저장 완료");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// gradeList에 포함된 vo의 개수만큼 반복
		// 굳이 gradList개수가 30개라고 표현하지 않고
		// gradeList.size() 메서드를 활용해서
		// 30이라는 값을 연산해서 추출
		for( int i = 0 ; i < gradeList.size();i++) {
			// gradeList로 부터 vo를 추출
			// gradeList로 부터 i번째(i: 0 ~ 29)
			GradeVO vo = gradeList.get(i);
			
			// 추출된 vo에서 학번과 성적들을 다시 getter
			String strNum = vo.getStrNum();
			
			int intKor = vo.getIntKor();
			int intEng = vo.getIntEng();
			int intMath = vo.getIntMath();
		}
		
		

	}

}


