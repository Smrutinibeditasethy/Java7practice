package com.practice;

public class Statvar {
	String name;
	int age;
	static String lastname;
	public static void main(String[] args) {
		Statvar.lastname = "Sethy";
		Statvar sv = new Statvar();
		sv.name = "Smruti";
		sv.age = 25;
		System.out.println("my Name is " +sv.name +Statvar.lastname  +" and my age is " +sv.age);
		
	}

}
