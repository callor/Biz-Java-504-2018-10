package com.biz.collects.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList();
		addList(al);
		
		LinkedList<Integer> ll = new LinkedList();
		addList(ll);
		
		List<Integer> aList = new ArrayList();
		List<Integer> lList = new LinkedList();
		allList(aList);
		allList(lList);

	}
	
	public static void allList(List<Integer> aList) {
		aList.add(20);
		aList.add(20);
		aList.add(20);
		aList.add(20);
		aList.add(20);
	}
	
	public static void addList(ArrayList<Integer> al) {
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
	}

	public static void addList(LinkedList<Integer> al) {
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
	}

	
}






