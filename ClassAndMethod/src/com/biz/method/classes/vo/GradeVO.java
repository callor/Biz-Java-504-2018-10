package com.biz.method.classes.vo;

/*
 * 성적처리를 할때 사용할
 * 학생의 학번, 이름
 * 국어, 영어, 수학, 과학, 국사 과목의 점수와
 * 총점, 평균의 데이터를 저장할 변수를 갖는
 * Value Object(DTO:Data Transfer Object)
 */
public class GradeVO {
	
	/*
	 * 클래스에 선언된 변수들
	 * 속성(property), member 변수
	 * => 기본 성질을 private으로 설정한다.
	 */
	private String strNum;
	private String strName;
	
	private int intKor,intEng, intMath, intSci, intHis;
	
	private int intSum ;
	private float floatAvg ;
	
	// private으로 선언된 변수(속성)들을
	// 외부에서 접근할수 있는 통로를 선언
	//	   new 를 사용해서 객체로 생성한 후
	//	   읽기, 쓰기를 시도하는 곳
	// => getter and setter
	
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public int getIntKor() {
		return intKor;
	}

	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}

	public int getIntEng() {
		return intEng;
	}

	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}

	public int getIntMath() {
		return intMath;
	}

	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}

	public int getIntSci() {
		return intSci;
	}

	public void setIntSci(int intSci) {
		this.intSci = intSci;
	}

	public int getIntHis() {
		return intHis;
	}

	public void setIntHis(int intHis) {
		this.intHis = intHis;
	}

	public String getStrNum() {
		return strNum;
	}

	public int getIntSum() {
		return intSum;
	}

	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}

	public float getFloatAvg() {
		return floatAvg;
	}

	public void setFloatAvg(float floatAvg) {
		this.floatAvg = floatAvg;
	}
	
	
	
	
	
	
	
	

}







