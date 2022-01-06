package com.ksnx3684.s4;

public class Square {

	public static final int SERO = 1;
	final int GARO;
	
	public Square () { // 생성자 메서드
		this.GARO = 5;
	}
	
	static { // static 초기화 블럭
		// Square.SERO = 3;
	}
	
	public static void info() { // 클래스 메서드 (메서드 영역)
		System.out.println("Class Method");
		// System.out.println(this.garo); // 객체를 생성해야 호출이 가능하다
		System.out.println(Square.SERO);
		// this.info2(); // 객체를 생성해야 호출이 가능하다
	}
	
	public void info2() { // 인스턴스 메서드 (heap 영역)
		final int NUM = 1;
		System.out.println("Instance Method");
		System.out.println(this.GARO);
		System.out.println(Square.SERO);
		Square.info();
	}
}
