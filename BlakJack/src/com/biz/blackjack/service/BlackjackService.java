package com.biz.blackjack.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.biz.blackjack.vo.CardVO;

public class BlackjackService {

	List<CardVO> deckList;
	String suit = "다이아몬드(◆):하트(♥):스페이드(♠):클로버(♣)";
	String denomination = "A234567890KQJ";
	
	public BlackjackService() {
		deckList = new ArrayList();
	}
	
	public List<CardVO> getDeck() {
		return deckList;
	}
	
	
	public void makeDeck() {
		
		String[] suits = suit.split(":");
		String[] denoms = denomination.split("");
		
		for(String s : suits) {
			for(String d : denoms) {
				
				CardVO vo = new CardVO();
				vo.setSuit(s);
				vo.setDenomination(d);
				
				int intValue = 0;
				try {

					// 숫자가 아닌 값이면
					// exception 발생
					// 숫자이면 바로 intValue 세팅
					intValue = Integer.valueOf(d);
					if(intValue == 0) intValue=10;
									
				} catch (Exception e) {
					
					// 문자열을 Integer.valueOf()로
					// 숫자로 바꾸려고 시도했을 때
					if(d.equals("A")) intValue = 1;
					else { intValue = 10; }
				}
				vo.setValue(intValue);
				deckList.add(vo);
				
				Collections.shuffle(deckList);
	
			}
			
		}
		
		
		
		
	}
	
}
