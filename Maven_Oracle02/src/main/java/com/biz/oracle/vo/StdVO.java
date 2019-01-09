package com.biz.oracle.vo;

//st_num CHAR(5) PRIMARY KEY,
//st_name nVARCHAR2(20) NOT NULL,
//st_grade CHAR(2),
//st_tel nVARCHAR2(20)
public class StdVO {

    private String st_num;
    private String st_name;
    private String st_grade;
    private String st_tel;
    
    public StdVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StdVO(String st_name, String st_grade, String st_tel) {
		super();
		this.st_name = st_name;
		this.st_grade = st_grade;
		this.st_tel = st_tel;
	}

    
	public StdVO(String st_num, String st_name, String st_grade, String st_tel) {
		super();
		this.st_num = st_num;
		this.st_name = st_name;
		this.st_grade = st_grade;
		this.st_tel = st_tel;
	}



	public String getSt_num() {
		return st_num;
	}



	public void setSt_num(String st_num) {
		this.st_num = st_num;
	}



	public String getSt_name() {
		return st_name;
	}



	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}



	public String getSt_grade() {
		return st_grade;
	}



	public void setSt_grade(String st_grade) {
		this.st_grade = st_grade;
	}



	public String getSt_tel() {
		return st_tel;
	}



	public void setSt_tel(String st_tel) {
		this.st_tel = st_tel;
	}



	@Override
	public String toString() {
		return "StdVO [st_num=" + st_num + ", st_name=" + st_name + ", st_grade=" + st_grade + ", st_tel=" + st_tel
				+ "]";
	}
	
    
    
    
}
