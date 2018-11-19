package com.biz.collects;

public class Arrays02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arrays02 arrays02 = new Arrays02();
		MyAddr myAddr = arrays02.new MyAddr();
		myAddr.strName = "홍길동";
		myAddr.strAddr = "서울시";
		MyBook myBook = new Arrays02.MyBook();
		
	}
	
	private class MyAddr {
		String strName;
		String strAddr;
	}
	
	private static class MyBook {
		String strTitle;
		String strAuth;
	}

}
