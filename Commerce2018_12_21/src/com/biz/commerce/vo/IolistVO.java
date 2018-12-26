package com.biz.commerce.vo;

/*
 * 매입매출데이터.txt 파일로부터
 * 데이터를 읽어서 List를 만들때
 * 사용할 데이터클래스(VO) 선언
 */
public class IolistVO {
	
	/*
	 * 거래일자:상품코드:거래구분:단가:수량 형식의
	 * 데이터를 읽어서
	 * 각 member 변수에 저장
	 * 
	 * 각 member 변수는 정보은닉과 캡슐화를 하기 위해
	 * private으로 선언한다.
	 */
	private String io_date; // 거래일자
	private String io_ccode; // 상품코드
	private String io_inout; //거래구분
	private int io_price; // 단가
	private int io_quan; // 수량
	
	/*
	 * private 으로 선언된 변수는
	 * 외부에서 직접 접근 할 수 없으므로
	 * getter와 setter 메서드를 생성해서
	 * 변수에 값을 저장하고, 읽을 수 있도록
	 * 통로를 만든다.
	 */

	public String getIo_date() {
		return io_date;
	}
	public void setIo_date(String io_date) {
		this.io_date = io_date;
	}
	public String getIo_ccode() {
		return io_ccode;
	}
	public void setIo_ccode(String io_ccode) {
		this.io_ccode = io_ccode;
	}
	public String getIo_inout() {
		return io_inout;
	}
	public void setIo_inout(String io_inout) {
		this.io_inout = io_inout;
	}
	public int getIo_price() {
		return io_price;
	}
	public void setIo_price(int io_price) {
		this.io_price = io_price;
	}
	public int getIo_quan() {
		return io_quan;
	}
	public void setIo_quan(int io_quan) {
		this.io_quan = io_quan;
	}

	/*
	 * VO에 데이터를 저장한 후
	 * 데이터를 확인하는 디버깅용 메서드를
	 * 재 정의한다. 
	 */
	@Override
	public String toString() {
		return "IolistVO [io_date=" + io_date + ", io_ccode=" + io_ccode + ", io_inout=" + io_inout + ", io_price="
				+ io_price + ", io_quan=" + io_quan + "]";
	}

	
 	
	
	
	
	
}
