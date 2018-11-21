package com.biz.input;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SystemIn06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList();
		Scanner scanner = new Scanner(System.in);
		
		int intNum = 0;
		while(true) {
			System.out.print(++intNum);
			System.out.print("번째 숫자 >> ");
			
			String strNum = scanner.nextLine();
			if(strNum.equals("--END")) {
				System.out.println("입력 종료...");
				break;
			}
			
			try {
				int intScore = Integer.valueOf(strNum);
				intList.add(intScore);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.print(intNum);
				System.out.println("번째 오류");
				System.out.println(intNum + "다시입력");
				intNum --;
				continue;
			}
		} // while end
		System.out.println(intList);
	}
}
