package com.biz.inout.vo;

import java.text.SimpleDateFormat;

public class InoutVO extends Object {

	// member변수 영역
	private String strDate;
	private String strIO;
	private int intDanga;
	private int intSu;
	private byte vat;
	private int intTotal;
	
	// getter, setter 영역
	
	// 날짜값을 문자열로 저장하려고 하는데
	// 변수에 값을 직접 저장하면
	// 날짜값이 유효한지 아닌지 알수가 없다.
	public String getStrDate() {
		return strDate;
	}
	
	public boolean setStrDate(String strDate) {
		// boolean retOk = true;
		SimpleDateFormat sd 
			= new SimpleDateFormat("yyyyMMdd");
		sd.setLenient(false);
		try {
			// 날짜 유효성검사를 시도
			sd.parse(strDate);
			this.strDate = strDate;
		} catch (Exception e) {
			// 만약 유효성에 어긋나면
			System.out.println("날짜형식 오류");
			return false;
			// TODO: handle exception
			// retOk = false;
		}
		return true;
		// return retOk;
	}
	
	public String getStrIO() {
		return strIO;
	}
	public void setStrIO(String strIO) {
		this.strIO = strIO;
	}
	public int getIntDanga() {
		return intDanga;
	}
	public void setIntDanga(int intDanga) {
		this.intDanga = intDanga;
	}
	public int getIntSu() {
		return intSu;
	}
	public void setIntSu(int intSu) {
		this.intSu = intSu;
	}
	public byte getVat() {
		return vat;
	}
	public void setVat(byte vat) {
		this.vat = vat;
	}
	public int getIntTotal() {
		return intTotal;
	}
	public void setIntTotal(int intTotal) {
		this.intTotal = intTotal;
	}
	
	// Object 클래스에 정의된 toString() 메서드를
	// 임의로 다 정의(재작성)한 것
	@Override
	public String toString() {
		return "InoutVO [strDate=" + strDate + ", strIO=" + strIO + ", intDanga=" + intDanga + ", intSu=" + intSu
				+ ", vat=" + vat + ", intTotal=" + intTotal + "]";
	}
	
	

	
	
}
