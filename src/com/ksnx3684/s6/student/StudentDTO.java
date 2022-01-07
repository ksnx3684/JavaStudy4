package com.ksnx3684.s6.student;

public abstract class StudentDTO {

	String name;
	int num;
	int kor;
	int eng;
	int math;
	int total;
	
	public abstract int setTotal();
	
//	public StudentDTO() {} // 기본생성자
//	
//	public StudentDTO(String name) { // 매개변수를 받는 생성자만 생성하면 따로 위에처럼 기본생성자를 생성하지 않는 이상 기본생성자는 자동으로 없어진다.
//		this.name = name;
//	}
	
}
