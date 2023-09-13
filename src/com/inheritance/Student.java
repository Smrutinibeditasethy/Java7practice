package com.inheritance;


public class Student extends User1 {
	void m2() {
		System.out.println("Child class method is called");	
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.m1();
		s.m2();
	}

}
