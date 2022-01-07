package com.ksnx3684.s5;

public class MyGodMain {

	public static void main(String[] args) {
		MyGod myGod = MyGod.makeGod();
		
		System.out.println(myGod);
		
		MyGod my2 = MyGod.makeGod();
		
		// SingleTone
		// 클래스메서드는 객체 생성없이 사용 가능하다.
		
		//MyGod m1 = new MyGod();
		//MyGod m2 = new MyGod();
		
		

	}

}
