package com.biz.printout;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String printFile 
			= "D:/bizwork/workspace/ExFiles/my1.txt";
		
		try {
			
			PrintWriter pw = new PrintWriter(printFile);
			pw.println("반갑습니다");
			pw.println("우리나라만세");
			pw.close();
			System.out.println("파일 저장 완료");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
