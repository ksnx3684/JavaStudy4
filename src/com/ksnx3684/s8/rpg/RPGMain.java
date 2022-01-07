package com.ksnx3684.s8.rpg;

public class RPGMain {

	public static void main(String[] args) {
		Knight k1 = new Knight();
		Magition m1 = new Magition();
		Archer a1 = new Archer();
		
		Character[] ch = new Character[3];
		ch[0] = k1;
		ch[1] = m1;
		ch[2] = a1;
		
		
//		Knight k1 = new Knight();
//		Magition m1 = new Magition();
//		
//		int num = 10;
//		
//		m1.name = "이병훈";
//		m1.hp = 100;
//		m1.mp = 50;
//		
//		// Magition type은 Character type이다.
//		Character c1 = m1; // 다형성을 이용하여 Character type c1에 m1을 담음.
//		
//		System.out.println(c1.name);
//		System.out.println(c1.hp);
//		//System.out.println(c1.mp); 부모로는 접근 불가
//		System.out.println(m1.name);
//		System.out.println(m1.hp);
//		System.out.println(m1.mp);
//		
//		// m1 = c1; // 불가능
//		m1 = (Magition)c1; // 가능
//		
//		k1.attack();
//		k1.move();
//		m1.attack();

	}

}
