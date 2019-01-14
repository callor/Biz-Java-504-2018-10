package com.biz.blackjack.exec;

import java.util.List;

import com.biz.blackjack.service.BlackjackService;
import com.biz.blackjack.vo.CardVO;

public class BlackExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BlackjackService bs = new BlackjackService();
		bs.makeDeck();
		
		List<CardVO> deckList = bs.getDeck();
		
		for(CardVO v : deckList) {
			System.out.println(v);
		}
		System.out.println("카드개수:" + deckList.size());
		
		
		
	}

}
