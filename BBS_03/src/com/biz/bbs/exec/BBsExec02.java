package com.biz.bbs.exec;

import com.biz.bbs.service.BBsMainService;

public class BBsExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BBsMainService bs = new BBsMainService();
		bs.bbsMemu();
		
		System.out.println(">> 게시판 종료 !!!");
	}

}
