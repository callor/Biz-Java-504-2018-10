package com.biz.ex02;

import java.util.ArrayList;
import java.util.List;

import com.biz.ex02.service.UserService;

public class UserExec04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<UserService> gsList = new ArrayList();
		
		for(int i = 0 ; i < 5 ; i++) {
			UserService us = new UserService();
			gsList.add(us);
		}
		
		

	}

}
