package com.biz.printout.review;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.printout.vo.GradeVO;

public class GradeToPrint_조동혁{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// gradeList 선언 및 초기화
		List<GradeVO> gradeList = new ArrayList();
		
		// for문을 이용해서 30명분 학번과 국어,영어,수학 점수를 50~100점사이 점수 생성
		// 학번 : String형 , 3과목 점수 : int형
		for (int i = 0; i < 30; i++) {
			String strNum = "" + (i + 1);
			int intKor = (int) (Math.random() * (100 - 50 + 1)) + 50;
			int intEng = (int) (Math.random() * (100 - 50 + 1)) + 50;
			int intMath = (int) (Math.random() * (100 - 50 + 1)) + 50;

			// gradeList에 성적정보를 추가하기 위해서
			// 한 학생의 성적정보 (gradeVO) 객체 생성 및 초기화
			GradeVO gradeVO = new GradeVO();

			// 위의 for문에서 얻은 변수값들을 gradeVO 클래스에 저장
			gradeVO.setStrNum(strNum);
			gradeVO.setIntKor(intKor);
			gradeVO.setIntEng(intEng);
			gradeVO.setIntMath(intMath);

			// gradeVO 클래스에 저장된 값들을 gradeList에 저장
			gradeList.add(gradeVO);

		}   // for end  
		    // 30명 학생들의 성적정보를 gradeList에 저장완료

		/*
		 * 위에서 생성된 gradeList를 활용하여 .../gradeList.txt 파일을 생성하시오. 
		 * 각 라인의 구성은 학번:국어점수:영어점수:수학점수 형식으로 저장하시오.
		 */
		
		// 문자열 변수 printFile에 파일이 저장될 위치와 이름을 지정
		String printFile = "D:/bizwork/workutf/ExFiles/gradeList.txt";

		// PrintWriter를 이용한 pw 객체 선언
		PrintWriter pw;
		
		// PrintWriter를 이용한 객체를 생성할 때는 try...catch문으로 감싸줘야함
		// printWriter를 저장하기 용도로 open(create)하고 관련 정보를
		// pw에 저장 해 놓는다.
		try {
			
			// 객체 pw 초기화
			pw = new PrintWriter(printFile);

			// for문을 이용해서 gradeList에 저장된 값들을 불러오기(읽기 = getter)
			// 굳이 gradeList개수가 30개라고 표현하지않고 gradeList.size() method를 활용해서
			// 30이라는 값을 연산해서 추출
			for (int j = 0; j < gradeList.size(); j++) {

				// 위에서 학번은 String형으로 저장되어 있기때문에 학번이 담긴 값을 int형으로 변환시켜줘야함
				// String형 변수를 int형으로 변환시키려면 Integer.valueOf()를 이용한다.
				// 출력부분 => printf를 이용해서 gradeList에 저장되어있는 값들을 읽고난 후 파일내에 출력
				int index = Integer.valueOf(gradeList.get(j).getStrNum());
				pw.printf("%d:%d:%d:%d\r\n", index, gradeList.get(j).getIntKor(), 
						gradeList.get(j).getIntEng(), gradeList.get(j).getIntMath());

			}
			// 파일내에 출력 후 파일을 닫아서 완료
			pw.close();
			
			// console에 완료라는 문구를 출력해주어서 실행이 되었나 안 되었나 확인.
			System.out.println("완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
