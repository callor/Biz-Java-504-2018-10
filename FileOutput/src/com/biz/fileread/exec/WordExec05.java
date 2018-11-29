package com.biz.fileread.exec;

import java.util.Scanner;

public class WordExec05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordService ws = new WordService();
		
		ws.makeWordList();
		
		while(true) {
			ws.playGame();
			System.out.println("==========================");
			System.out.println("게임을 끝내시겠습니까?");
			System.out.print("종료(YES)/계속(no, Enter)");

			Scanner scanner = new Scanner(System.in);
			String strYesNo = scanner.nextLine();
		
			if(strYesNo.equals("YES")) {
				System.out.println("게임을 종료합니다!!");
				System.out.println("Good Bye");
			}
		
		}
	}
}
