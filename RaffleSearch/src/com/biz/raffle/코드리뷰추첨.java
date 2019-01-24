package com.biz.raffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 코드리뷰추첨 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nameList = new ArrayList();

//		 nameList.add("고은향");
		 nameList.add("고재범");
//		 nameList.add("대재민");
//		nameList.add("문지현");
//		 nameList.add("안정하");
//		 nameList.add("이상일");
		 nameList.add("이종환");
//		 nameList.add("이주현");
//		 nameList.add("이주훈");
//		 nameList.add("이준수");
//		 nameList.add("임동인"); // 금요일 발표
//		 nameList.add("정효순");
//		 nameList.add("조동혁");

		for (int i = 0; i < nameList.size(); i++) {
			Collections.shuffle(nameList);
		}

		System.out.println(nameList.get(0));
		
//		for (int i = 0; i < 3; i++) {
//			System.out.println(nameList.get(i));
//		}

	}

}
