package com.biz.interfaces.imp;

public class AniExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		Bunny bunny = new Bunny();
		
		view(dog); // 강아지, Animal
		view(cat); // 야옹이, Animal
		view(bunny); // Animal
		
	}
	
	public static void view(Animal a) {
		// view를 호출할때 어떤 type의 변수를 
		// 전달했는가 알아보는 코드
		if(a instanceof Dog) {
			System.out.println("강아지");
		} else if( a instanceof Cat) {
			System.out.println("야옹이");
		} else if( a  instanceof Bunny) {
			System.out.println("빨간눈의 토끼");
		} else {
			System.out.println("Animal");	
		}
	}
	
	/*
	public static void view(Dog dog) {
		System.out.println("강아지");
	}

	public static void view(Cat cat) {
		System.out.println("야옹이");
	}
	*/

	
}



