package com.biz.raffle;

import java.util.Arrays;
import java.util.List;

public class Array2ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] card = { "DA", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10", "DJ", "DQ", "DK", "HA", "H2",
				"H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10", "HJ", "HQ", "HK", "SA", "S2", "S3", "S4", "S5", "S6",
				"S7", "S8", "S9", "S10", "SJ", "SQ", "SK", "CA", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10",
				"CJ", "CQ", "CK" };
		// 배열 안의 카드를 하나씩 나누어서 CardSet리스트에 차례대로 담기
		List<String> cardSet 
				= Arrays.asList(card);

//		for (int i = 0; i < Card.length; i++) {
//			String j = Card[i];
//			CardSet.add(j);
//		}

	}

}
