package com.biz.raffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 조편성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nameList = new ArrayList();

		nameList.add("고은향");
		nameList.add("고재범");
		nameList.add("대재민");
		nameList.add("문지현");
		nameList.add("안정하");
		// nameList.add("이상일");
		nameList.add("이종환");
		nameList.add("이주현");
		nameList.add("이주훈");
		nameList.add("이준수");
		nameList.add("임동인");
		nameList.add("정효순");
		nameList.add("조동혁");

		for (int i = 0; i < nameList.size(); i++) {
			Collections.shuffle(nameList);
		}
		
		for(int j = 0 ; j < 9 ; j++) {
			int classNum = 0 ;
			for(String s : nameList) {
				System.out.print(s);
				if(++classNum % 3 == 0) {
					System.out.println();
				} else {
					System.out.print(", ");
				}
				
			}
		}

	}

}
