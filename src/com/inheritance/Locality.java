package com.inheritance;

public class Locality extends City {
	public int hashcode() {
		return 101;
	}
	void m1() {
		System.out.println("This is child class 1st method");
	}
	/*void m2() {
		System.out.println("This is child class 2nd method");
	super.m2();
	}*/

}
