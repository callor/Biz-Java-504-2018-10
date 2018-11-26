package com.biz.collects.arraylist;

import java.util.ArrayList;

import com.biz.collects.vo.BookVO;

public class ArrayList01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ai = new int[3];
		// ai[0] = Integer.valueOf("대한민국");
		
		
		// Collections 중에 가장 많이 사용하는
		// ArrayList라는 클래스 사용법 연습
		
		ArrayList bookList 
				= new ArrayList();
		
		// 문자열만
		ArrayList<String> strList 
				= new ArrayList();
		
		// ArrayList에는 int형을 쓸수 없고
		// Integer class를 사용해야 한다.
		ArrayList<Integer> intList
			= new ArrayList();
		
		ArrayList<Float> floatList
			= new ArrayList();

		ArrayList<Character> charList
			= new ArrayList();
		
		ArrayList<Boolean> boolList
			= new ArrayList();
		
		ArrayList<Double> doList
			= new ArrayList();
		
		ArrayList<Long> longList
			= new ArrayList();
		
		ArrayList<BookVO> bookVoList
			= new ArrayList();
		
	}

}
