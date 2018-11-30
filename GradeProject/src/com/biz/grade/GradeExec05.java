package com.biz.grade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class GradeExec05 {

	public static void main(String[] args) {

		String[] names = new String[200];
		
		String nameFile
		= "src/com/biz/grade/영어이름들.txt";

		FileReader fr ;
		BufferedReader buffer;
		
		try {
			fr = new FileReader(nameFile);
			buffer = new BufferedReader(fr);
			for(int i = 0 ; i < names.length ; i++) {
				String nameLine = buffer.readLine();
				if(nameLine == null) break;
				names[i] = nameLine;
			} // 배열에 담기
			
			// 파일읽기를 끝내고 다른 코드를 계속 실행해할경우
			// 가급적(원칙적으로) buffer와 fr을 close()한다.
			buffer.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // try end
		
		//=======================================
		// names 배열의 임의 위치에 있는 문자열을
		// : 을 기준으로 잘라서
		// 우리말 이름을 보여주고
		// 영어이름을 입력받아
		// 맞추는 코드를 작성하시오
		int namesC = names.length;
		int intIndex = (int)(Math.random() * namesC);
		
		?? names[intIndex].split(":");
		
		System.out.println("다음 제시된 단어를 입력하시오");
		System.out.println(names[intIndex]);
		
		Scanner scanner = new Scanner(System.in);
		String inputName = scanner.nextLine();
		
		if(names[intIndex].contains(inputName)) {
			System.out.println("맞았습니다");
		}
		//============================
		 
	}

}





