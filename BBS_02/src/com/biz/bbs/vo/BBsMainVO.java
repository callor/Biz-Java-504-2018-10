package com.biz.bbs.vo;

/*
	B_ID      NOT NULL NUMBER         
	B_DATE    NOT NULL CHAR(10)       
	B_AUTH    NOT NULL NVARCHAR2(20)  
	B_SUBJECT NOT NULL NVARCHAR2(50)  
	B_TEXT    NOT NULL NVARCHAR2(255) 
 */

public class BBsMainVO {

	private long b_id;
	private String b_date;
	private String b_auth;
	private String b_subject;
	private String b_text;
	public long getB_id() {
		return b_id;
	}
	public void setB_id(long b_id) {
		this.b_id = b_id;
	}
	public String getB_date() {
		return b_date;
	}
	public void setB_date(String b_date) {
		this.b_date = b_date;
	}
	public String getB_auth() {
		return b_auth;
	}
	public void setB_auth(String b_auth) {
		this.b_auth = b_auth;
	}
	public String getB_subject() {
		return b_subject;
	}
	public void setB_subject(String b_subject) {
		this.b_subject = b_subject;
	}
	public String getB_text() {
		return b_text;
	}
	public void setB_text(String b_text) {
		this.b_text = b_text;
	}
	
	@Override
	public String toString() {
		return "BBsMainVO [b_id=" + b_id + ", b_date=" + b_date + ", b_auth=" + b_auth + ", b_subject=" + b_subject
				+ ", b_text=" + b_text + "]";
	}


	
	


}