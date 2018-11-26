package com.biz.raffle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RaffleExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList(NamesClass.NAMES);
		
		// 배열개수만큼 반복하여 뒤섞기
		for(int i = 0; i < names.size(); i++) {
			Collections.shuffle(names);
		}

		// 0부터 배열크기만큼의 범위에서 난수 만들기
		int nameCount = names.size();
		int nameSearch = (int)(Math.random() * nameCount);
		
		// 난수를 이용해서 List중에 선택하기
		System.out.println("오늘의 당첨자!!!");
		System.out.println(names.get(nameSearch));
		
		// 뒤섞인 순서대로 전체 리스트 보기
		System.out.println("당첨자 순위~~~");
		System.out.println(names);
		
	}

}
