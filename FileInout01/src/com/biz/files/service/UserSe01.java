package com.biz.files.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.biz.files.vo.UserVO;

public class UserSe01 {


	List<UserVO> userList;
	UserVO vo ;
	
	public UserSe01() {
		userList = new ArrayList();
		vo = new UserVO();
	}
	
	public void makeId() {
		List<String> strList = new ArrayList();
		for(int i = 0 ; i < 10 ; i ++) {

			// 10개의 리스트에 담긴 vo는 항상
			// 새로 생성을 해 줘야 한다.
			UserVO v = new UserVO();
			
			int num = (int)(Math.random() * (200-100+1)) + 100;
			strList.add("" + num);

			/*
			vo.setStrId("" + num);
			v.setStrId(""+num);
			userList.add(vo);
			userList.add(v);
			*/
			
		}
		
		strList = new ArrayList(new TreeSet(strList));
		for(String s : strList) {
			UserVO vo = new UserVO();
			vo.setStrId(s);
			userList.add(vo);
		}
	}
	
	public void view() {
		for(UserVO vo : userList) {
			System.out.println(vo);
		}
	}
}







