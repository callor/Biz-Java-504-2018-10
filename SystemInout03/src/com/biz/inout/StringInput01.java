package com.biz.inout;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StringInput01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strLetter 
			= "src/com/biz/inout/loveLetter.txt" ;

		FileReader fr;
		
		try {
			fr = new FileReader(strLetter);
			while(true) {
				
				// ASCII 코드로 파일을 읽기
				int read = fr.read();
				if(read < 0) break; // EOF 이면 끝
				System.out.print((char)read + ", ");
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
