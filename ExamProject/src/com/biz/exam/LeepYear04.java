package com.biz.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.biz.exam.method.LeepMethod;

public class LeepYear04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file = "src/com/biz/exam/윤년List.txt";
		
		FileReader fr;
		BufferedReader buffer;
		
		LeepMethod lm = new LeepMethod();
		
		try {
			fr = new FileReader(file);
			buffer = new BufferedReader(fr);
			
			while(true) {
				String reader = buffer.readLine();
				if(reader == null) break;
				
				// 1번 split 을 이용
				String[] dates = reader.split(" ");
				int intYear = Integer.valueOf(dates[0]);
				
				// 2번 substring 을 이용
				String strYear = reader.substring(0,4);
				intYear = Integer.valueOf(strYear.trim());
				
				if(lm.isLeepYear(intYear)) {
					System.out.println(reader + "은 윤년");
				} else {
					System.out.println(reader + "은 평년");
				}
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
