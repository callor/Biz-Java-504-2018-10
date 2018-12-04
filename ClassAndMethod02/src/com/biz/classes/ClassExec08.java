package com.biz.classes;

public class ClassExec08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 같을 클래스를 사용해서 만든 m1, m2, m3는
		// 마치 새로운 strName 변수를 생성한 것 처럼
		// 서로간에 아무런 간섭이나 영향을 미치지 않는다.
		Method02 m1 = new Method02("홍길동");
		Method02 m2 = new Method02("이몽룡");
		Method02 m3 = new Method02("성춘향");
		
		System.out.println(m1.strName);
		System.out.println(m2.strName);
		System.out.println(m3.strName);

	}
}
