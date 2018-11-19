package com.biz.classex.children;

public class BookVO extends Object {
	
	private String strTitle;
	private String strAuth;
	private String strComp;
	
	public String getStrTitle() {
		return strTitle;
	}
	public void setStrTitle(String strTitle) {
		this.strTitle = strTitle;
	}
	public String getStrAuth() {
		return strAuth;
	}
	public void setStrAuth(String strAuth) {
		this.strAuth = strAuth;
	}
	public String getStrComp() {
		return strComp;
	}
	public void setStrComp(String strComp) {
		this.strComp = strComp;
	}
	
	@Override
	public String toString() {
		return "BookVO [strTitle=" + strTitle + ", strAuth=" + strAuth + ", strComp=" + strComp + "]";
	}
	

	
	
	
	/*
	@Override // 재 정의
	public String toString() {
		// TODO Auto-generated method stub
		// return super.toString();
		String strRet = "제목:" + this.strTitle + "\n";
		strRet += "저자:" + this.strAuth + "\n";
		strRet += "출판사:" + this.strComp;
		return strRet;
	} 
	*/
	

	
}
