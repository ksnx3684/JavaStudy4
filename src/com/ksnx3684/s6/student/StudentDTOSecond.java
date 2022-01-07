package com.ksnx3684.s6.student;

public class StudentDTOSecond extends StudentDTO {

//	public StudentDTOSecond() {
//		// super(); // 부모의 기본생성자를 호출하지 말고
//		super("이병훈"); // 매개변수를 받는 생성자를 호출
//	}
	
	int history;
	
	public int setTotal() { // 오버라이딩
		this.total = this.kor + this.eng + this.math + this.history;
		System.out.println(this.total);
		return this.total;
	}
	
}
