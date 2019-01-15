package com.biz.cbt.exec;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import com.biz.cbt.vo.AnsVO;

public class CbtExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnsVO[] ansVOs = new AnsVO[4];
		for (int i = 0; i < 4; i++) {
			ansVOs[i] = new AnsVO();
		}

		ansVOs[0].multi_ans= "대한민국";
		ansVOs[0].multi_choice = true;

		ansVOs[1].multi_ans = "미국";
		ansVOs[1].multi_choice = false;

		ansVOs[2].multi_ans = "소련";
		ansVOs[2].multi_choice = false;

		ansVOs[3].multi_ans = "영국";
		ansVOs[3].multi_choice = false;

		Collections.shuffle(Arrays.asList(ansVOs));

		System.out.println("다음중 서울이 수도인 나라는");
		for (int i = 0; i < 4; i++) {
			System.out.println(ansVOs[i].multi_ans);
		}
		Scanner scan = new Scanner(System.in);
		System.out.print("선택 >> ");
		String strN = scan.nextLine();

		int intN = Integer.valueOf(strN);

		if (ansVOs[intN - 1].multi_choice) {
			System.out.println("참 잘했어요");
		} else {
			System.out.println("그것도 모르니");
		}

	}

}
