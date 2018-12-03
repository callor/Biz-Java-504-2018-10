package com.biz.grade.exec;

import java.util.List;

import com.biz.grade.classes.GradeReader01;
import com.biz.grade.vo.StudentVO;

public class GradeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strFile = "src/com/biz/grade/우리말이름.txt";
		GradeReader01 gr = new GradeReader01(strFile);
		
		// 파일을 읽어서 List에 저장하는 부분 실행하도록
		gr.studentInfoRead();
		// GradeReader01은 우리말이름.txt 파일에서 
		// 내용일 읽어 이름 부분만 추출한 후
		// stList에 담아 놓을 것이다.
		
		// stList를 추출해서 사용해 보자
		List<StudentVO> stList = gr.getStList();
		for(StudentVO v : stList) {
			System.out.println(v);
		}

		
		
	}
}




