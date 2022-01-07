package com.ksnx3684.s6.student;

public class StudentSecondService extends StudentService {
	
	@Override
	public StudentDTO setStudent() {
		// studentDTOSecond 입력하는 메서드 생성
		StudentDTOSecond studentDTOSecond = new StudentDTOSecond();
		
		return studentDTOSecond;
		
	}
	

}
