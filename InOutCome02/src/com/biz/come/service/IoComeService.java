package com.biz.come.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.come.vo.IoListVO;

public class IoComeService {
	List<IoListVO> ioList;
	String strFileName;
	
	public IoComeService(String strFileName) {
		ioList = new ArrayList();
		this.strFileName = strFileName;
	}
	
	public void showIoList() {
		System.out.println("========================================");
		System.out.println("거래일자\t구분\t상품이름\t단가\t수량");
		System.out.println("-----------------------------------------");

		for(IoListVO vo : ioList) {
			
			String strIo = "매출";
			int iTotal = 0;
			int oTotal = 0;
			
			if(vo.getIntIO() == 0) { // 매입
				strIo = "매입";
				iTotal = vo.getIntPrice() * vo.getIntQuan();
			} else {
				strIo = "매출";
				oTotal = vo.getIntPrice() * vo.getIntQuan();
			}
			
			System.out.print(vo.getStrDate() + "\t");
			System.out.print(vo.getStrCName() + "\t");
//			System.out.print(vo.getIntIO() + "\t");
			System.out.print(strIo + "\t");
			System.out.print(vo.getIntPrice() + "\t");
			System.out.print(vo.getIntQuan() + "\t");
			
			System.out.print(iTotal + "\t");
			System.out.print(oTotal + "\n");
			
		}
		
	
	}
	
	public void readFile() {
		
		FileReader fr;
		BufferedReader buffer;
		
		try {
			fr = new FileReader(strFileName);
			buffer = new BufferedReader(fr);
			//-- 파일을 읽기 위해 open
			
			//-- 파일 읽기 실행
			while(true) {
				String reader = buffer.readLine();
				if(reader == null) break;
				String[] strN = reader.split(":");
				
				IoListVO vo = new IoListVO();
				vo.setStrDate(strN[0]);
				vo.setStrCName(strN[1]);
				vo.setIntIO(Integer.valueOf(strN[2]));
				vo.setIntPrice(Integer.valueOf(strN[3]));
				vo.setIntQuan(Integer.valueOf(strN[4]));
				ioList.add(vo);

//				System.out.println(strN[1]);
//				System.out.println(reader);
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




