package com.biz.exam.leep;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.exam.method.LeepMethod;

/*
 * 임진왜란은 1592년에 발생했다.
 * 1592년 부터 2018년까지 윤년인 해를 찾아서
 * 윤년들.txt 파일로 저장
 * 
 * 1992년
 */
public class LeepYear05 {

	// static 변수
	// static main() 메서드에서
	// 사용할 변수에는 method선언과 마찬가지로
	// static으로 선언 해주어야 한다.
	static List<String> yearList;
	
	public static void main(String[] args) {
		// 1592년 부터 2018년까지 윤년인 해를 찾아보자
		LeepMethod lm = new LeepMethod();
		yearList = new ArrayList();
		for(int i = 1592 ; i <= 2018 ;i++) {
			// boolean b = lm.isLeepYear(i);
			if(lm.isLeepYear(i)) {
				System.out.println(i + "년은 윤년");
				
				// 파일에 저장을 하기 위해서
				// PrintWriter, FileWriter등을 사용해서
				// 직접 파일에 저장 할 수 도 있지만
				// 파일이 열린상태(쓰기준비)로 있는
				// 시간은 최소한으로 만들어 주는 것이 좋다.
				// 직접 파일에 저장하지 않고
				// List를 하나 만들어서
				// List에 저장한 후 한꺼번에 파일에
				// 저장하도록 하는 것이 좋다.
				yearList.add("" + String.valueOf(i));
			}
		}
		writeFile();
		
		// 파일 저장을 실행
	} // main  end

	public static void writeFile() {
		String wFile = "src/com/biz/exam/윤년들.txt";
		
		PrintWriter pw;
		
		try {
			pw = new PrintWriter(wFile);
			for(String s : yearList) {
				pw.println(s + "년");
			}
			pw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}








