package com.biz.method.classes.oop01;

import com.biz.method.classes.dao.MemberDAO;
import com.biz.method.classes.vo.MemberVO;

public class MemberExec03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberVO vo = new MemberVO();
		vo.setStrTel("010-222-9999");
		vo.setIntAge(16);
		vo.setStrAddr("남원시");
		vo.setStrId("001");
		vo.setStrName("이몽룡");
		
		MemberDAO dao = new MemberDAO(vo);
		dao.viewMember();

	}

}
