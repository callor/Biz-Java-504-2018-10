package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class DogListClass {
	
	List<String> dogList ;
	String strName ;
	
	public DogListClass() {
		dogList = new ArrayList();
		this.strName = "몽이";
	}
	
	public DogListClass(String strName) {
		dogList = new ArrayList();
		this.strName = strName;
		dogList.add(this.strName);
	}

}



