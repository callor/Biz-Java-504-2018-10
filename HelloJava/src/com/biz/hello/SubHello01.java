package com.biz.hello;

import java.util.ArrayList;
import java.util.List;

public class SubHello01 {
	
	// member 영역
	List<String> strList = new ArrayList();
	
	public void view1() {
		System.out.println(strList.size());
	}
	
	public void addList() {
		strList.add("Korea");
	}

}
