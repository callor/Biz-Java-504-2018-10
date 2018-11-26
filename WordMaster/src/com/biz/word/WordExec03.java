package com.biz.word;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordExec03 {

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
		
		// 문자열배열WordBook.word를 
		// 배열을 List 객체형으로 변환
		// Collections.shuffle() 메서드를 사용하기 위해
		wordList = Arrays.asList(WordBook.word);
		
		// List를 무작위로 섞기
		Collections.shuffle(wordList);
		String getWord = wordList.get(0);
		// System.out.println(getWord);

		String[] quizWord = getWord.split(":");
		System.out.println("다음제시된 단어를 완성하시오");
		System.out.println(quizWord[1]);

		// 단어를 알파벳으로 분해
		String[] spWord = quizWord[0].split("");
		
		// 알파벳배열을 List로 변환
		List<String> spWordList = Arrays.asList(spWord);
		
		// Collections.shuffle()을 이용해서 뒤섞기
		Collections.shuffle(spWordList);
		
		// 뒤섞은 알파벳을 보여주고
		System.out.println(spWordList);
		
		// 키보드 입력으로 단어 입력
		Scanner scanner = new Scanner(System.in);
		String inputWord = scanner.nextLine();
		
		// 입력받은 단어를 비교
		if(quizWord[0].equalsIgnoreCase(inputWord)) {
			System.out.println("참 잘했어요!!");
			retOk = true;
		} else {
			System.out.println(quizWord[0] + " 입니다");
		}
		return retOk;

	}

}
