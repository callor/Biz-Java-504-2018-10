package com.biz.ex02.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.ex02.vo.UserVO;

public class UserService01 {
	
	List<UserVO> userList ;
	Scanner scanner ;
	
	public UserService01() {
		userList = new ArrayList();
		scanner = new Scanner(System.in);
	}
	
	public void makeUser() {
		UserVO vo = new UserVO();
		String strNum = scanner.nextLine();
		vo.setStrNum(strNum);
		userList.add(vo);
	}

}
