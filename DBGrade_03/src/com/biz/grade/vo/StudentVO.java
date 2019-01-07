package com.biz.grade.vo;
/*    
 	st_num CHAR(5) PRIMARY KEY,
    st_name nVARCHAR2(30) NOT NULL,
    st_tel nVARCHAR2(20),
    st_addr nVARCHAR2(50)
    
 */
public class StudentVO {
	private String st_num;
	private String st_name;
	private String st_tel;
	private String st_addr;
	
	public StudentVO(String st_num, String st_name, String st_tel, String st_addr) {
		super();
		this.st_num = st_num;
		this.st_name = st_name;
		this.st_tel = st_tel;
		this.st_addr = st_addr;
	}

	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getSt_tel() {
		return st_tel;
	}

	public void setSt_tel(String st_tel) {
		this.st_tel = st_tel;
	}

	public String getSt_addr() {
		return st_addr;
	}

	public void setSt_addr(String st_addr) {
		this.st_addr = st_addr;
	}

	@Override
	public String toString() {
		return "StudentVO [st_num=" + st_num + ", st_name=" + st_name + ", st_tel=" + st_tel + ", st_addr=" + st_addr
				+ "]";
	}
	

	
	
	
	
	
}
