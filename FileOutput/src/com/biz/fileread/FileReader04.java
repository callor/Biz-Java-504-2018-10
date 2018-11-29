package com.biz.fileread;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String readFile 
		= "D:/bizwork/workspace/ExFiles/영단어.txt";
		
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
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
