package com.biz.ex02.vo;

public class TestVO {
	
	public String strTest1;
	public String strTest2;
	
	private String strTest3;
	
	private int intKor ;
	public int intEng;
	
	public void setIntKor(int intKor) {
		if(intKor < 0 || intKor > 100) {
			System.out.println("점수범위 오류");
			return ;
		}
		this.intKor = intKor;
	}
	
}
