package com.biz.files.vo;

public class UserVO {
	
	private String strId;
	private String strPassword;
	private String strName;
	public String getStrId() {
		return strId;
	}
	public void setStrId(String strId) {
		this.strId = strId;
	}
	public String getStrPassword() {
		return strPassword;
	}
	public void setStrPassword(String strPassword) {
		this.strPassword = strPassword;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	@Override
	public String toString() {
		return "UserVO [strId=" + strId + ", strPassword=" + strPassword + ", strName=" + strName + "]";
	}
	
	

}
