package com.biz.method.classes.dao;

import com.biz.method.classes.vo.MemberVO;

public class MemberDAO {
	public MemberVO memberVO;
	
	/*
	 * DAO 클래스의 생성자
	 * 생성자는 다른 클래스에서 이 클래스의 
	 * 인스턴스를 생성할때 최초로 호출되는 method
	 * 
	 * 예) MemberDAO dao = new MemberDAO()
	 * 
	 */
	public MemberDAO() {
		this.memberVO = new MemberVO();
		
		this.memberVO.strId = "000";
		this.memberVO.strName = "이름을 입력하세요";
		this.memberVO.setStrTel("전화번호를 입력하세요");
		this.memberVO.setStrAddr("주소를 입력하세요");
		this.memberVO.setIntAge(0);
	}
	
	public MemberDAO(MemberVO memberVO) {
		this.memberVO = memberVO;
	}
	
	public void viewMember() {
		System.out.println("===============");
		System.out.println("회원정보");
		System.out.println("---------------");
		System.out.println("회원이름:" 
				+ memberVO.strName);
		System.out.println("전화번호:" 
				+ memberVO.getStrTel());
		System.out.println("주소:" 
				+ memberVO.getStrAddr());
		System.out.println("나이:" 
				+ memberVO.getIntAge());
		System.out.println("===============");
	}

}



