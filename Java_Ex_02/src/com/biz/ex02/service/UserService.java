package com.biz.ex02.service;

import java.util.Scanner;

import com.biz.ex02.vo.UserVO;

public class UserService {
	
	UserVO userVO ;
	Scanner scanner;
	
	public UserService() {
		userVO = new UserVO();
		scanner = new Scanner(System.in);
	}
	
	public void makeUser() {
		System.out.print("학번>>");
		String strNum = scanner.nextLine();
		userVO.setStrNum(strNum);
		
		System.out.print("이름>>");
		String strName = scanner.nextLine();
		userVO.setStrName(strName);		
	}

}
