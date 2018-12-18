package com.biz.exam.leep;

import java.util.Scanner;

import com.biz.exam.method.LeepMethod;

public class LeepYear03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		LeepMethod lm = new LeepMethod();
		
		while(true) {
			System.out.print("연도 입력(-1:종료) >> ");
			String strYear = scan.nextLine();
			int intYear = Integer.valueOf(strYear);
			if(intYear < 0) {
				System.out.println("Good Bye!!");
				break;
			}
			
			boolean b = lm.isLeepYear(intYear);
			if(b) {
				System.out.println(strYear + "는 윤년");
			}  else {
				System.out.println(strYear + "는 평년");
			}
		}
	}

}
