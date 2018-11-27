package com.biz.ex02;

import com.biz.ex02.vo.UserVO;

public class UserExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserVO userVO = new UserVO();
		userVO.setStrNum("01001");
		userVO.setStrName("홍길동");
		userVO.setStrGrade("1");
		userVO.setStrAddr("광주광역시");
		userVO.setStrTel("00101");
		String toString = userVO.toString();
		
		System.out.println(toString);

	}

}
