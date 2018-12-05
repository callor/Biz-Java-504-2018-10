package com.biz.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class MyClass09 {

	List<String> stList ;
	
	public MyClass09() {
		stList = new ArrayList();
	}
	
	public void add(String strName, int num) {
		String _t = strName + ":" + num;
		stList.add(_t);
	}

}



