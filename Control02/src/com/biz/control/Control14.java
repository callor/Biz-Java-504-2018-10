package com.biz.control;

public class Control14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String weekName = "" ;
		
		// 1부터 10까지 반복
		for(int i = 0 ; i < 10 ; i++) {
			int week = (i % 7) + 1; // 1~7
			if(week == 1) weekName = "월요일";
			if(week == 2) weekName = "화요일";
			if(week == 3) weekName = "수요일";
			if(week == 4) weekName = "목요일";
			if(week == 5) weekName = "금요일";
			if(week == 6) weekName = "토요일";
			if(week == 7) weekName = "일요일";
			System.out.println(weekName);
		}
		
		// 11월 1일은 목요일로
		// 0을 월요일로 시작하는 3번요일
		int intNov = 3; 
		for(int i = 0 ; i < 30 ; i++) {
			int week = (intNov++ % 7); // 0~6
			if(week == 0) weekName = "월요일";
			if(week == 1) weekName = "화요일";
			if(week == 2) weekName = "수요일";
			if(week == 3) weekName = "목요일";
			if(week == 4) weekName = "금요일";
			if(week == 5) weekName = "토요일";
			if(week == 6) weekName = "일요일";
			System.out.println("11월" 
					+ (i+1) + " 는" 
					+ weekName + " 요일 입니다");
		}

		// 11월 1일은 목요일로
		// 0을 월요일로 시작하는 3번요일
		intNov = 3; 
		for(int i = 0 ; i < 30 ; i++) {
			int week = (intNov++ % 7); // 0~6
			switch(week) {
				case 0 : weekName = "월요일";
							break;
				case 1 : weekName = "화요일";
							break;
				case 2 : weekName = "수요일";
							break;
				case 3 : weekName = "목요일";
							break;
				case 4 : weekName = "금요일";
							break;
				case 5 : weekName = "토요일";
							break;
				case 6 : weekName = "일요일";
			}
			System.out.println("11월" 
					+ (i+1) + " 는" 
					+ weekName + " 요일 입니다");
		}

	
	
	}

}
