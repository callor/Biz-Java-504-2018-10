package com.biz.hello;

public class Hello07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strName = "홍길동";
		int intKor = 90;
		int intEng = 80;
		int intMath = 100;
		
		GradeVO gradeVO = new GradeVO();
		gradeVO.strName = "이몽룡";
		gradeVO.intKor = 90;
		gradeVO.intEng = 80;
		gradeVO.intMath = 70;
		
		// viewScore() 메서드에게 홍길동의
		// 과목점수를 전달하고
		// 총점을 구해서 console 보여라 !!
		viewScore(strName, intKor,intEng, intMath) ;
		
		// viewScore() 메서드에게 이몽룡의 
		// 과목점수를 전달하고
		// 총점을 구해서 console 보여라 !!!
		viewScore(gradeVO);
	}
	
	public static void viewScore(String strName,
			int intKor, int intEng, int intMath) {
		
		// 매개변수로 받은 intKor에 100이라는 값을 저장하면
		// main에서 전달해준 점수는 아무런 의미가 없다
		intKor = 100;
		
		int intSum = intKor + intEng + intMath;
		System.out.println(strName + "의 총점 : " + intSum);
	}
	
	
	public static void viewScore(GradeVO vo) {
		int intSum = vo.intKor + vo.intEng + vo.intMath;
		System.out.println(vo.strName + "의 총점 : " + intSum);
	}
	
	
	
	
	
	
		

}
