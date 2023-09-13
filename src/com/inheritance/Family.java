package com.inheritance;

public class Family extends User3{
	String gender;
	void Family() {
		System.out.println("Child class constructor");
	}
	void m1() {
		System.out.println("child class method");
	}
	
public static void main(String[] args) {
	Family fl =new Family();
	fl.fname="Smruti";
	fl.mname ="Nibedita";
	fl.lname="Sethy";
	fl.gender="F";
	System.out.println(fl.fname +fl.mname +fl.lname +"--" +fl.gender);
}
}
