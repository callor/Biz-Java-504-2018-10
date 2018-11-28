package com.biz.printout;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Print02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String printFile 
				= "D:\\bizwork\\workspace\\ExFiles\\my.txt" ;
		
		printFile = "D:/bizwork/workspace/ExFiles/my.txt";
		
		InputStream in = System.in;
		Scanner scan = new Scanner(in);
		
		// 1. PrintWriter를 이용해서 객체를 선언
		PrintWriter pw = null ;
		
		// 2. 객체 초기화
		try {
			// PrintWriter를 사용해서 file을 생성하려면
			// 객체 초기화 문을 반드시 try..catch 문으로
			// 감싸줘야 한다.
			pw = new PrintWriter(printFile);
			for(int i = 0 ; i < 100 ; i++) {
				int rndNum = (int)(Math.random() * 100) + 1;
				pw.println(rndNum);
			}
			pw.close();
			System.out.println("파일 저장 완료");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}





