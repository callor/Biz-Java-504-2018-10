package com.biz.method.classes.oop01;

import com.biz.method.classes.dao.MemberDAO;

public class MemberExec02 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		MemberDAO dao = new MemberDAO();
		dao.viewMember();
		
		
		
		dao.memberVO.strId = "001";
		dao.memberVO.strName = "홍길동";
		dao.memberVO.setStrTel("010-111-1234");
		dao.memberVO.setStrAddr("서울특별시");
		dao.memberVO.setIntAge(30);
		dao.viewMember();

	}
}




