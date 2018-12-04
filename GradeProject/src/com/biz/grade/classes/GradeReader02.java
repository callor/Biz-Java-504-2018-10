package com.biz.grade.classes;

import java.util.ArrayList;
import java.util.List;

import com.biz.grade.vo.StudentVO;

public class GradeReader02 {

	private String nameFile 
		= "src/com/biz/grade/우리말이름.txt";
	
	// 선언
	List<StudentVO> stList;

	// 생성자
	// 리턴값(void, int, String)이 없는 method
	// 외부에서 클래스를 사용해서 객체를 생성할때
	// 호출되는 method
	//  	GradeReader02 g = new GradeReader02();
	public GradeReader02() {
		
	}
	
	// 2번째 생성자
	//   nameFile 이라는 String형 매개변수를 갖는다.
	//	 GradeReader02 g = new GradeReader02("우리말.txt")
	// 외부에서 파일이름을 전달해서
	// 파일이름에 구속되지 않는 클래스를 만들기 위한
	// 	 방법
	public GradeReader02(String nameFile) {
		this.nameFile = nameFile;
		this.stList = new ArrayList();
	}
	
	// Test를 위한 method
	public void makeNames() {
		StudentVO vo = new StudentVO();
		vo.setStrKorName("홍길동");
		stList.add(vo);
	}
	
}







