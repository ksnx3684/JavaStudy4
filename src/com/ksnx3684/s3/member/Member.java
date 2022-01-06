package com.ksnx3684.s3.member;

public class Member {

	// 자바를 개발할 때는 데이터 변수를 선언할 때 private로 선언하여 setter, getter 메서드로 캡슐화를 한다. 
	private String name;
	private String email;
	private double weight;
	private double height;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// setter 메서드 : 변수의 값을 입력하는 메서드
	// getter 메서드 : 변수의 값을 가지고 외부에서 가져갈 수 있는 메서드
	// set변수명, get변수명
	
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getEmail() {
//		return this.email;
//	}
//	
//	public void setHeight(double height) {
//		if(height > 0 && height < 300) {
//			this.height = height;
//		}
//	}
//	public double getHeight() {
//		return this.height;
//	}
//	
//	public void setAge(int age) {
//		this.age = 20;
//		if(age > 0 && age < 200) {
//			this.age = age;
//		}
//	}
//	public int getAge() {
//		return this.age;
//	}
	
}
