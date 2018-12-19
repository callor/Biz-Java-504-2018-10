package com.biz.names.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.biz.names.vo.FullNameVO;

// 파일 2개를 읽어서 조합을 해야 하므로
// 기본적으로 2개의 파일을 읽어 값들을 보관할
// List 2개를 선언 및 초기화 하자
public class NameService {

	// 새로운 이름을 만들어서 저장할
	// fullNameList를 선언 및 초기화
	List<FullNameVO> fNameList;

	// 파일 읽어서 저장할 List2개
	List<String> firstList; // 성씨 저장
	List<String> sndList; // 이름 저장

	// 파일2개를 읽기 위해서
	// service에서 직접 파일 이름을 지정해도 되지만
	// main()에서 파일 이름을 매개변수로 전달하도록
	// 디자인 하자.

	String fstFile;
	String sndFile;

	public NameService(String fstFile, String sndFile) {

		fNameList = new LinkedList(); // ArrayList();
		
		firstList = new ArrayList();
		sndList = new ArrayList();

		this.fstFile = fstFile;
		this.sndFile = sndFile;

	}

	public void menu() {
		
		String filePath = "src/com/biz/names/";
		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println("================================");
			System.out.println("* 1.화면출력   2.파일저장   0.종료");
			System.out.println("================================");
			System.out.print("업무선택 >>");
			
			String strM = scan.nextLine();
			int intM = Integer.valueOf(strM);
			
			if(intM == 0) return ;
			
			System.out.print("이름생성개수 >> ");
			String strC = scan.nextLine();
			int intC = Integer.valueOf(strC);
			
			this.makeFullName(intC);
			
			if(intM == 1) viewFullName();
			if(intM == 2) {
				System.out.print("파일이름 >>");
				String fileName = scan.nextLine();
				writeFullName(filePath + fileName +".txt");
			}
		}
	}

	public void writeFullName(String saveFile) {
		PrintWriter pw;

		try {
			pw = new PrintWriter(saveFile);
			for (FullNameVO vo : fNameList) {
				pw.println(vo.getStr1stName() + vo.getStr2ndName());
			}
			pw.close();
			System.out.println("파일 저장 완료!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void viewFullName() {
		System.out.println("================");
		System.out.println("한국인 이름들");
		System.out.println("----------------");
		for (FullNameVO vo : fNameList) {

			// 1
			System.out.println(vo.getStr1stName() + vo.getStr2ndName());

			// 2
			System.out.print(vo.getStr1stName());
			System.out.println(vo.getStr2ndName());

			// 3
			System.out.printf("%s%s\n", vo.getStr1stName(), vo.getStr2ndName());

			// 4
			String fName = vo.getStr1stName();
			String sName = vo.getStr2ndName();
			System.out.printf("%s%s\n", fName, sName);

		}
		System.out.println("====================");
	}

	// 100개의 새로운 이름을 만드는데,
	// service에서 개수를 정하지 않고
	// main()에서 몇개를 만들지 정해주도록 다자인
	public void makeFullName(int nameSize) {

		// fNameList를 비우고 이름을 생성
		fNameList.clear();
		
		int fSize = firstList.size();
		int sSize = sndList.size();

		for (int i = 1; i < nameSize + 1; i++) {

			int fstPos = (int) (Math.random() * fSize);
			int sndPos = (int) (Math.random() * sSize);

			String fName = firstList.get(fstPos);
			String sName = sndList.get(sndPos);

			// fNameList에 추가
			FullNameVO vo = new FullNameVO();
			vo.setStr1stName(fName);
			vo.setStr2ndName(sName);

			fNameList.add(vo);

		}
	}

	// 한국성씨.txt 파일에서 성씨리스트를 읽어서
	// firstList에 저장할 method를 만든다.
	public void readFirstFile() {

		FileReader fr;
		BufferedReader buffer;

		try {

			fr = new FileReader(fstFile);
			buffer = new BufferedReader(fr);
			while (true) {
				String reader = buffer.readLine();
				if (reader == null)
					break;

				String[] names = reader.split(":");

				String fstName = names[1]; // 한자포함
				
				// 일부 특수문자는 단독으로 split 이 안되는 것들이 있다
				// 대표적으로 () ! 문자들은 split 이 안되는데
				// 이런 문자 앞에 슬래시(\)를 두개(\\) 포함하면 
				// split 붆해가 가능하다
				String[] hanNs = fstName.split("\\(");
				
				firstList.add(hanNs[0]);

			}
			buffer.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 이름리스트.txt 파일에서 이름리스트를 읽어서
	// sndList에 저장할 method를 만든다.
	public void readSndFile() {
		FileReader fr;
		BufferedReader buffer;

		try {

			fr = new FileReader(sndFile);
			buffer = new BufferedReader(fr);
			while (true) {
				String reader = buffer.readLine();
				if (reader == null)
					break;
				sndList.add(reader);

			}
			buffer.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
