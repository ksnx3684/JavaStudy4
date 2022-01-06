package com.ksnx3684.s3.member;

public class MemberMain {

	public static void main(String[] args) {
		Member member = new Member();
		member.setEmail("ksnx3684#naver.com");
		member.setHeight(200);
		member.setAge(30);
		
		String email = member.getEmail();
		
		System.out.println(email);
		System.out.println(member.getHeight());
		System.out.println(member.getAge());
		
	}

}
