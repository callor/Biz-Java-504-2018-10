package com.biz.printout.review;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print_이상일 {
	
	public static void main(String[] args) {
		
		String printFile="d:/bizwork/workutf/ExFiles/gugudan.txt";
		
		try {
			PrintWriter pw=new PrintWriter(printFile);
			int intNum=5;
			
			for(int i=1; i<10; i++) {
				pw.printf("%d x %d = %d\r\n", intNum, i, (intNum*i));
			}
			pw.close();
			System.out.println("Save complete");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
