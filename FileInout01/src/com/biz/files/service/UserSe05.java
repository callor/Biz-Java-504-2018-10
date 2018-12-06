package com.biz.files.service;

import java.awt.BufferCapabilities;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserSe05 {
	List<String> strList;
	String strFileName;
	
	public UserSe05(String strFileName) {
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
				strList.add(names[0]);
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
