package com.biz.come.vo;

public class IoListVO {
	
	private String strDate;
	private int intIO;
	private String strCName;
	private int intPrice;
	private int intQuan;

	public String getStrDate() {
		return strDate;
	}


	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}

	public int getIntIO() {
		return intIO;
	}

	public void setIntIO(int intIO) {
		this.intIO = intIO;
	}


	public String getStrCName() {
		return strCName;
	}




	public void setStrCName(String strCName) {
		this.strCName = strCName;
	}




	public int getIntPrice() {
		return intPrice;
	}




	public void setIntPrice(int intPrice) {
		this.intPrice = intPrice;
	}




	public int getIntQuan() {
		return intQuan;
	}




	public void setIntQuan(int intQuan) {
		this.intQuan = intQuan;
	}




	@Override
	public String toString() {
		return "IoListVO [strDate=" + strDate + ", intIO=" + intIO + ", strCName=" + strCName + ", intPrice=" + intPrice
				+ ", intQuan=" + intQuan + "]";
	}
	
	
	
	
}
