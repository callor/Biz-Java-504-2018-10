package com.biz.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class MyClass03 {

	// member 변수 영역
	List<String> stList ;
	
	public MyClass03() {
		stList = new ArrayList();
	}
	
	public void hello(String strName) {
		stList.add(strName);
	}
	
}
