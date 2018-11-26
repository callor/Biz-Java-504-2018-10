package com.biz.word;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordExec02 {

	public static void main(String[] args) {
		
		int intCount = 0 ;
		for(int i = 0 ; i < 3 ;i++) {
			if(viewWord()) {
				intCount++;
			}
		}
		System.out.println("맞은개수" + intCount);
		
	}
	
	public static boolean viewWord() {
		// TODO Auto-generated method stub
		List<String> wordList ; // = new ArrayList();
		boolean retOk = false;
		
		// 배열을 List 객체형으로 변환
		wordList = Arrays.asList(WordBook.word);
		
		// List를 무작위로 섞기
		Collections.shuffle(wordList);
		String getWord = wordList.get(0);
		System.out.println(getWord);
		
		String[] quizWord = getWord.split(":");
		System.out.println("다음 풀이에 맞는 영어단어를 입력하세요");
		System.out.println(quizWord[1]);
		
		Scanner scanner = new Scanner(System.in);
		String inputWord = scanner.nextLine();
		
		if(quizWord[0].equalsIgnoreCase(inputWord)) {
			System.out.println("참 잘했어요!!");
			retOk = true;
		} else {
			System.out.println(quizWord[0] + " 입니다");
		}
		return retOk;

	}

}
