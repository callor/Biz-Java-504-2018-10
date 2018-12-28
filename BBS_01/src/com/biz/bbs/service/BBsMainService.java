package com.biz.bbs.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.bbs.dao.BBsMainDao;
import com.biz.bbs.dao.BBsMainDaoImp;
import com.biz.bbs.vo.BBsMainVO;

public class BBsMainService {
	
	List<BBsMainVO> bbsMainList ;
	BBsMainDao mainDao ;

	public BBsMainService() {
		
		bbsMainList = new ArrayList();
		mainDao = new BBsMainDaoImp();
		
	}
	
	public void viewBBsList() {
		bbsMainList = mainDao.selectAll();
		
		System.out.println("====================================================");
		System.out.println("나의 게시판 v1.0");
		System.out.println("====================================================");
		System.out.printf("%5s  %-10s%-15s%s\n","NO","날짜","작성자","제목");
		System.out.println("----------------------------------------------------");
		for(BBsMainVO vo : bbsMainList) {
			System.out.printf("%5d  ",vo.getB_id());
			System.out.printf("%-12s", vo.getB_date());
			System.out.printf("%-15s", vo.getB_auth());
			System.out.println(vo.getB_subject());
		}
		
		
		
		
	}
	
}






