package com.biz.bank.vo;

public class BankVO {
	
	// VO member 변수들.. 
	// 요소값을 갖는 변수들
	// 필드, 칼럼
	String strID; // 계좌번호
	int intBalance; // 최종잔액
	String strLastDate; // 최종거래

	/*
	원장저장 
	계좌번호:잔액:최종거래일자
	
	개인들 거래 내역
	계좌번호:거래일자:입출구분:입금액:출금액:잔액
	*/
	String strIO; // 입출구분
	int intIOCash; // 입출금액
	
	public String getStrID() {
		return strID;
	}
	public void setStrID(String strID) {
		this.strID = strID;
	}
	public int getIntBalance() {
		return intBalance;
	}
	public void setIntBalance(int intBalance) {
		this.intBalance = intBalance;
	}
	public String getStrLastDate() {
		return strLastDate;
	}
	public void setStrLastDate(String strLastDate) {
		this.strLastDate = strLastDate;
	}
	public String getStrIO() {
		return strIO;
	}
	public void setStrIO(String strIO) {
		this.strIO = strIO;
	}
	
	public int getIntIOCash() {
		return intIOCash;
	}
	
	public void setIntIOCash(int intIOCash) {
		this.intIOCash = intIOCash;
	}
	
	@Override
	public String toString() {
		return "BankVO [strID=" + strID + ", intBalance=" + intBalance + ", strLastDate=" + strLastDate + ", strIO="
				+ strIO + ", intIOCash=" + intIOCash + "]";
	}
	
	
	

}
