package com.biz.method.classes.statics;

public class Nations {
	
	/*
	 * static으로 변수를 선언하면
	 * Nations클래스는 Dynamic에서 Static으로 성질
	 * 변경된다.
	 * 
	 * Static class는 프로젝트가 시작됨과 동시에
	 * 생성되어서 메모리 어딘가에 자동으로 등록된다.
	 * 그리고, 프로젝트가 종료될때까지 유지된다.
	 * 즉, 메모리를 차지하고 있다.
	 * 
	 * 다만,
	 * Static class는
	 * 생성자(new...)를 사용해서 객체로 만들지 않아도
	 * 언제든지 사용이 가능하다.
	 * 
	 * 특히 변수에 final static 키워드를 같이 사용하면
	 * 프로젝트 어디서도 
	 * 그 변수에 다른 값을 저장할수 없다.
	 * 마치 상수처럼 사용된다.
	 */
	public final static String KOREA = "대한민국";
	public static String USA = "미합중국";
	public static String UAE = "아랍에미레이트 연합";
	public static String RUSIA = "러시아";
	public static String CHINA = "중화인민공화국";

}




