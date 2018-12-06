package com.biz.input;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.input.vo.GradeVO;

public class GradeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List<GradeVO> gradeList = new ArrayList();
		
		for(int i = 0; i < 5 ; i++) {
			System.out.print((i+1)+"번 이름 >> ");
			String strName = scanner.nextLine();

			System.out.print("국어 >> ");
			String strKor = scanner.nextLine();
			
			System.out.print("영어 >> ");
			String strEng = scanner.nextLine();

			System.out.print("수학 >> ");
			String strMath = scanner.nextLine();
			
			GradeVO vo = new GradeVO();
			vo.setIntNum(i+1);
			vo.setStrName(strName);
			try {
				
				// 문자열로 입력받은 점수를 정수형으로 변환
				int intKor = Integer.valueOf(strKor);
				int intEng = Integer.valueOf(strEng);
				int intMath = Integer.valueOf(strMath);
				
				vo.setIntKor(intKor);
				vo.setIntEng(intEng);
				vo.setIntMath(intMath);
				
			} catch (Exception e) {
				// TODO: handle exception
				
				// 개발단계에서 try 문 내에서
				// 오류가 발생하면
				// 어디에서 어떤 오류가 발생했는가
				// 추적해서 알려주는 명령 구문
				// 개발이 완료된후 배포할때는 삭제해도 된다.
				e.printStackTrace();
				
				System.out.println((i+1) + "학생 점수 오류");
				System.out.println((i+1) + "번 다시 입력");
				i--;
				continue;
				
			}
			gradeList.add(vo);
			
		} // for end
		
		for(GradeVO vo : gradeList) {
			System.out.println(vo.toString());
		}

	}

}






