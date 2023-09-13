package com.practice;

public class Studentclass {
	int age;
	String name;
	String gender;
public Studentclass(int age, String name,String gender) {
	this.age= age;
	this.name = name;
	this.gender = gender;
	System.out.println(this.age +"---" +this.name +"---" +this.gender);
}
public static void main(String[] args) {
	Studentclass sc= new Studentclass(25, "Smruti", "F");
	Studentclass sc2 = new Studentclass(27, "Mouli", "M");
}
	
}
