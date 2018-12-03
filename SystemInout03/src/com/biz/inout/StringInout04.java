package com.biz.inout;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StringInout04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String secLetter
		= "src/com/biz/inout/secLetter.txt" ;
		
		FileReader fr;
		
		try {
			fr = new FileReader(secLetter);
			while(true) {
				int intRead = fr.read();
				if(intRead < 0) break ; // EOF 이면 Break
				char cRead = (char)(intRead - 'A');
				System.out.print(cRead);
				
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




