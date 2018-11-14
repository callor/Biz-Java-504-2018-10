package com.biz.method.classes.vo;

public class MemberVO {
	
	public String strId;
	public String strName;
	
	private String strTel;
	private String strAddr;
	private int intAge;
	
	public void setIntAge(int intAge) {
		if(intAge < 1) {
			System.out.println("나이는 0세 보다 많아야 합니다");
			return ;
		}
		if(intAge > 100) {
			System.out.println("나이는 100세보다 적어야합니다");
			return ;
		}
		this.intAge = intAge;
	}
	
	public void setStrTel(String strTel) {
		this.strTel = strTel;
	}
	


}





