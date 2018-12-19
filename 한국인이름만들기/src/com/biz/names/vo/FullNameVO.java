package com.biz.names.vo;

public class FullNameVO {

	private String str1stName;
	private String str2ndName;
	public String getStr1stName() {
		return str1stName;
	}
	public void setStr1stName(String str1stName) {
		this.str1stName = str1stName;
	}
	public String getStr2ndName() {
		return str2ndName;
	}
	public void setStr2ndName(String str2ndName) {
		this.str2ndName = str2ndName;
	}
	@Override
	public String toString() {
		return "FullNameVO [str1stName=" + str1stName + ", str2ndName=" + str2ndName + "]";
	}
	
	
	
}
