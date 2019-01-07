package com.biz.blackjack.vo;

public class CardVO {
	
	private String suit;
	private String denomination;
	private int value;
	
	
	public CardVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CardVO(String suit, String denomination, int value) {
		super();
		this.suit = suit;
		this.denomination = denomination;
		this.value = value;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getDenomination() {
		return denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "CardVO [suit=" + suit + ", denomination=" + denomination + ", value=" + value + "]";
	}
	
	

}
