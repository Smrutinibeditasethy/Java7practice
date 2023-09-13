package com.encapsulation;

public class Test {
public static void main(String[] args) {
	Student s= new Student();
	s.setName("Smruti");
	s.setRollNo(07);
	
	int rollno =s.getRollNo();
	String name = s.getName();
	System.out.println(rollno + "---" +name);
}
}
