package com.biz.ex02;

import com.biz.ex02.service.UserService01;

public class UserExec05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService01 us = new UserService01();
		
		for(int i = 0 ; i < 5 ; i++) {
			us.makeUser();
		}

	}

}
