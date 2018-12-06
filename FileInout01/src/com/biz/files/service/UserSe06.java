package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.files.vo.UserVO;

public class UserSe06 {
	List<UserVO> strList;
	String strFileName;
	
	public UserSe06(String strFileName) {
		this.strList = new ArrayList();
		this.strFileName = strFileName;
	}
	
	public void readFile() {
		
		FileReader fr ;
		BufferedReader buffer;
		try {
			fr = new FileReader(this.strFileName);
			buffer = new BufferedReader(fr);
			while(true) {
				String reader = buffer.readLine();
				if(reader == null) break;
				String[] names = reader.split(":");
				UserVO vo = new UserVO();
				vo.setStrName(names[0]);
			}
			buffer.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
