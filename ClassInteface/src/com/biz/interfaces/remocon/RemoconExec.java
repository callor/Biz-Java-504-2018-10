package com.biz.interfaces.remocon;

/*
 * 프로젝트 지시서
 * 	1. TvRCom 클래스를 tvRCom 객체로 생성하라
 * 	2. tvRCom 객체에 있는
 * 		volUp(), volDown(), chUp(), chDown(), power()
 * 		메서드를 사용해서 나머지 코드를 구현 
 */
public class RemoconExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TvRCom tvRCom = new TvRCom();
		
		tvRCom.volUp();
		tvRCom.volDown();
		tvRCom.chUp();
		tvRCom.chDown();
		tvRCom.power();

		
	}

}
