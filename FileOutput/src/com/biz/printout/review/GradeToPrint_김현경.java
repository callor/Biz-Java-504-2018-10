package com.biz.printout.review;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.printout.vo.GradeVO;

public class GradeToPrint_김현경 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<GradeVO> gradeList = new ArrayList();
		
		for (int i=0; i<30;i++) {
			String strNum = "" +(i+1);
			int intKor = (int)(Math.random()*(100-50+1))+50;
			int intEng = (int)(Math.random()*(100-50+1))+50;
			int intMath = (int)(Math.random()*(100-50+1))+50;
			
			GradeVO gradeVO = new GradeVO();
			gradeVO.setStrNum(strNum);
			gradeVO.setIntKor(intKor);
			gradeVO.setIntEng(intEng);
			gradeVO.setIntMath(intMath);
			gradeList.add(gradeVO);
			
		}
		
		/*
		 * ������ ������ gradeList�� Ȱ���Ͽ�
		 * ../gradeList.txt ������ �����Ͻÿ�.
		 * �� ������ ������ 
		 * �й�:��������:��������:��������
		 * ex)1:90:80:70
		 * �������� �����Ͻÿ�.
		 */
		
		String printFile = "D:/bizwork/workspace/ExFiles/gradeList.txt";
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(printFile);
			//pw.println("�й�:��������:��������:��������");
			for(int i=0; i<30; i++) {
				pw.print(gradeList.get(i).getStrNum()+":");
				pw.print(gradeList.get(i).getIntKor()+":");
				pw.print(gradeList.get(i).getIntEng()+":");
				pw.print(gradeList.get(i).getIntMath()+"\r\n");
			}
			pw.close();
			System.out.println("���� �Ϸ�");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			pw.close();
		
		}

	}

}
















