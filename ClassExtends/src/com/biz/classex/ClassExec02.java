package com.biz.classex;

import java.util.ArrayList;
import java.util.List;

import com.biz.classex.children.BookVO;

public class ClassExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookVO vo = new BookVO();
		vo.setStrTitle("열혈자바");
		vo.setStrAuth("윤성우");
		vo.setStrComp("오렌지 미디어");

		System.out.println(vo);
		System.out.println(vo.toString());
		
		List<String> strList = new ArrayList();
		strList.add("Korea");
		strList.add("대한민국");
		strList.add("우리나라");
		
		System.out.println(strList);
		System.out.println(strList.toString());
		
		
		
	}

}













