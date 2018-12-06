package com.biz.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String readFile = "src/com/biz/files/우리말이름.txt";
		
		FileReader fr ;
		BufferedReader buffer;
		
		try {
			fr = new FileReader(readFile);
			buffer = new BufferedReader(fr);
			while(true) {
				String reader = buffer.readLine();
				// 먼저 EOF를 검사하고
				if(reader == null) break;
				
				// 통과되면 나머지 수행
				System.out.println(reader);
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
