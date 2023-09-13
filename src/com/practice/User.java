package com.practice;

public class User {
	public static void main(String[] args) {
		User u =new User();
		Student sd =new Student();
		sd.name = "Smruti";
		sd.id = 1023;
		u.m1(sd);
	}
void m1(Student sd) {
	System.out.println("The student name is " +sd.name +" and the id is " +sd.id);
}
}
