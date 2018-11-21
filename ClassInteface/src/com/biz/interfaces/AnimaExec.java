package com.biz.interfaces;

public class AnimaExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ZooKeper zooKeper = new ZooKeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		
		AnimalInterface tigerImp = new Tiger();
		AnimalInterface lionImp = new Lion();

		// ZooKeper에 있는 food(Lion lion) 메서드를 호출
		zooKeper.food(lion); 
		
		// ZooKeper에 있는 food(Tiger tiger) 메서드를 호출
		zooKeper.food(tiger);
		
//		zooKeper.add(3, 4);
//		zooKeper.add(3f, 4f);

		
	}

}




