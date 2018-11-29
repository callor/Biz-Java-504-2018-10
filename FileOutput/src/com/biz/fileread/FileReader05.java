package com.biz.fileread;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader05 {

	/*
	 * 영단어.txt파일을 읽어 영어단어만 콘솔에 표시하는 코드이다.
	 * 
	 * 콘솔에 표시했던 영단어를
	 * wordList에 저장(추가)하시오.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String readFile 
		= "D:/bizwork/workspace/ExFiles/영단어.txt";
		
		List<String> wordList = new ArrayList();
		
		FileReader fr;
		BufferedReader buffer;
		
		try {
			
			fr = new FileReader(readFile);
			buffer = new BufferedReader(fr);
			while(true) {
				String strWord = buffer.readLine();
				if(strWord == null) break;
				// System.out.println(strWord);
				
				// 읽어들인 한줄의 문자열을 : 을 기준으로 분해해서
				// 영어단어만 콘솔에 보고 싶다.
				
				// 1. strWord를 : 으로 분해
				strWord.split(":");
				
				// 2. 분해한 문자열 들을 변수(문자열 배열)에 저장
				String[] words = strWord.split(":");
				
				// 3. words의 0번째 주소에 있는 
				// 문자열만 console에 표시
				System.out.println(words[0]);
				
				// 영단어만 wordList에 추가하는 코드
				wordList.add(words[0]);
				
			}
			
			// 읽기용으로 사용한 buffer와 FileReader는
			// 닫지 않아도 큰 문제는 없지만...
			// 만약 파일을 읽은후
			// 다른 연산을 수행해야 할 경우
			// buffer와 FileReader를 닫아주는 것이 좋다.
			buffer.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
