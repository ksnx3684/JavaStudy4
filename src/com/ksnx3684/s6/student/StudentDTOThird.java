package com.ksnx3684.s6.student;

public class StudentDTOThird extends StudentDTO {

	int physics;

	@Override
	public int setTotal() {
		this.total = this.kor + this.eng + this.math + this.physics;
		System.out.println(this.total);
		return this.total;
	}
	
//	public StudentDTOThird() { // 기본 생성자를 호출하는 메서드가 있지만 기본적으로 생략처리 되어있다.
//		// super();
//	}
	
}
