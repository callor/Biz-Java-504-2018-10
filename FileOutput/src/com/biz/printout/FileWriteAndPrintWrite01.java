package com.biz.printout;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteAndPrintWrite01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String printFile 
		= "D:/bizwork/workspace/ExFiles/filePrint01.txt";
		
		FileWriter fw;
		PrintWriter pw;
		
		try {
			// 1. FileWriter를 append 모드로 시작하고
			fw = new FileWriter(printFile,true);
			
			// 2. FileWriter를 PrinterWriter에 연결하면
			pw = new PrintWriter(fw);
			
			for(int i = 0 ; i < 10 ; i++) {
				// 3. PrintWriter의 print() 메서드를 사용해서
				// 파일을 저장할수 있다.
				pw.println("우리나라만세 : " + i);
			}
			pw.close();
			fw.close();
			System.out.println("완료");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



