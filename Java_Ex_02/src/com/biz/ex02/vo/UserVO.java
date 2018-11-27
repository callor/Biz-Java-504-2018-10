package com.biz.ex02.vo;

public class UserVO { // extends Object {
	
	// member변수를 private으로 선언
	// 외부에서 직접 member변수에 접근하지 못하도록 하는 것
	private String strNum;
	private String strName;
	private String strGrade;
	private String strAddr;
	private String strTel;

	// private으로 선언된 member변수에 접근할 수 있는 통로
	// getter and setter

	
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrGrade() {
		return strGrade;
	}
	public void setStrGrade(String strGrade) {
		this.strGrade = strGrade;
	}
	public String getStrAddr() {
		return strAddr;
	}
	public void setStrAddr(String strAddr) {
		this.strAddr = strAddr;
	}
	public String getStrTel() {
		return strTel;
	}
	public void setStrTel(String strTel) {
		this.strTel = strTel;
	}

	
	// 재 정의, 다시 만들겠다
//	@Override
//	public String toString() {
//		return "나는 UserVO 입니다";
//	}
	
	// VO를 만들때 toString()을 자동 재정의해서
	// VO에 값을 세팅한다음
	// 값이 잘 세팅되었는지 확인하는 용도로 사용하는 것
	@Override
	public String toString() {
		return "UserVO [strNum=" + strNum + ", strName=" + strName + ", strGrade=" + strGrade + ", strAddr=" + strAddr
				+ ", strTel=" + strTel + "]";
	}
	

}
