package com.biz.inout;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StringInput02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strLetter 
			= "src/com/biz/inout/loveLetter.txt" ;
		List<Integer> intList = new ArrayList();

		FileReader fr;
		
		try {
			fr = new FileReader(strLetter);
			while(true) {
				
				// ASCII 코드로 파일을 읽기
				int read = fr.read();
				if(read < 0) break; // EOF 이면 끝
				intList.add(read);
				
				System.out.print((char)read + ", ");
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // try end
		
		// intList에 담긴 int 값을
		// 문자로 변환하여 콘솔에 출력하시오
		int listLen = intList.size();
		for(int i = 0 ; i < listLen; i++) {
			System.out.println(intList.get(i));
		}
		
		for(int i : intList) {
			System.out.print((char)(i));
		}
		
	}

}
