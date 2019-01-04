package com.biz.grade.vo;

public class ScoreVO {
	
	private String sc_num;
	private int sc_kor;
	private int sc_eng;
	private int sc_math;

	public ScoreVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ScoreVO(String sc_num, int sc_kor, int sc_eng, int sc_math) {
		super();
		this.sc_num = sc_num;
		this.sc_kor = sc_kor;
		this.sc_eng = sc_eng;
		this.sc_math = sc_math;
	}

	
	
	
	
	public String getSc_num() {
		return sc_num;
	}
	public void setSc_num(String sc_num) {
		this.sc_num = sc_num;
	}
	public int getSc_kor() {
		return sc_kor;
	}
	public void setSc_kor(int sc_kor) {
		this.sc_kor = sc_kor;
	}
	public int getSc_eng() {
		return sc_eng;
	}
	public void setSc_eng(int sc_eng) {
		this.sc_eng = sc_eng;
	}
	public int getSc_math() {
		return sc_math;
	}
	public void setSc_math(int sc_math) {
		this.sc_math = sc_math;
	}
	@Override
	public String toString() {
		return "ScoreVO [sc_num=" + sc_num + ", sc_kor=" + sc_kor + ", sc_eng=" + sc_eng + ", sc_math=" + sc_math + "]";
	}

	
	
	
	
}
