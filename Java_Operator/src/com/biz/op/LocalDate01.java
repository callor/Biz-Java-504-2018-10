package com.biz.op;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDate01 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// JDK 8(1.8)이상에서는 새로운 날짜, 시간 클래스가 있다.
		
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		LocalDateTime localDateTime = LocalDateTime.now();
		
		System.out.println("오늘날짜 : " + localDate);
		System.out.println("현재시각 : " + localTime);
		System.out.println("날짜와 시각 : " + localDateTime);
		
		LocalDate xmas = LocalDate.of(2018, 12, 25);
		System.out.println("올해의 크리스마스" + xmas);
		
		LocalDate xMasEve = xmas.minusDays(1);
		LocalDate newYear = xmas.plusDays(7);
		System.out.println(newYear);

		LocalDate xMas2019 = xmas.plusYears(1);
		System.out.println(xMas2019);
		
		LocalDate newClass = xmas.plusMonths(3);
		System.out.println(newClass);
		
		LocalTime newTime = localTime.plusHours(1);
		System.out.println(newTime);
		

	}

}
