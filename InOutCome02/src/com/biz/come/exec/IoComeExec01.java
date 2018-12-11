package com.biz.come.exec;

import com.biz.come.service.IoComeService;

public class IoComeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IoComeService is 
			= new IoComeService("src/com/biz/come/매입매출장.txt");
		
		is.readFile();
		is.showIoList();
		
	}

}
