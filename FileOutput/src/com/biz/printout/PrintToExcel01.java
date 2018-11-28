package com.biz.printout;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintToExcel01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String printFile 
		= "D:/bizwork/workspace/ExFiles/grade.xls";

		FileWriter fw;
		PrintWriter pw;
		
		try {
			fw = new FileWriter(printFile);
			pw = new PrintWriter(fw);
			
			pw.println("학번,국어,영어,수학");
			for(int i = 0 ; i < 100 ; i++) {
				int intNum = i + 1;
				int intKor = (int)(Math.random() * (100 -50 + 1)) + 50;
				int intEng = (int)(Math.random() * (100 -50 + 1)) + 50;
				int intMath = (int)(Math.random() * (100 -50 + 1)) + 50;
				
				// %5d : 전체 자릿수를 5개로 하고 오른쪽 정렬
				// %05d : 전체 자릿수를 5개로 하고, 빈칸 개수만큼
				// 0으로 채우기
				pw.printf("%d,%d,%d,%d \r\n",
						intNum, intKor, intEng, intMath);
				
			}
			pw.close();
			fw.close();
			System.out.println("저장 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}






