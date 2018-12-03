package com.biz.grade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ConvertName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String readFile = "src/com/biz/grade/우리말.txt";
		String saveFile = "src/com/biz/grade/우리말이름.txt";
		
		FileReader fr;
		BufferedReader buffer;
		
		FileWriter fw;
		PrintWriter pw;
		
		try {
			fr = new FileReader(readFile);
			buffer = new BufferedReader(fr);
			
			fw = new FileWriter(saveFile);
			pw = new PrintWriter(fw);
			
			while(true) {
				// 파일에서 한줄을 읽고
				String reader = buffer.readLine();
				
				// 만약 EOF 면 끝
				if(reader == null) break;
				
				// 문자열을 : 으로 분해
				String[] word = reader.split(":");
				
				// 분해한 문자열의 앞뒤 빈칸을 없앤후
				// 다시 결합
				String writer = word[0].trim() +":"
						+ word[1].trim();
				pw.println(writer);
			}
			pw.close();
			fw.close();
			buffer.close();
			fr.close();
			System.out.println("다했지롱!!!");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}




