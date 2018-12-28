package com.biz.bbs.vo;

/*
 * BBsMainVO는 DB와 연계하여 게시판 데이터를 이동할때
 * 사용할 Cart 역할을 하는 클래스
 * 
 * DB와 연계하여 VO를 생성할때는
 * member 변수를 table의 칼럼명과 일치하도록 만드는 것이 좋다.
 */
public class BBsMainVO {
	/*
	 b_id NUMBER PRIMARY KEY, -- ID 키
     b_date CHAR(10) NOT NULL, -- 작성일자
     b_auth nVARCHAR2(20) NOT NULL, -- 작성자
     b_subject nVARCHAR2(50) NOT NULL, -- 제목
     b_text nVARCHAR2(255) NOT NULL -- 내용
	 */
	
    private long b_id ;
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







