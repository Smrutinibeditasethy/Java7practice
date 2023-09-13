package com.exception;

public class Example5 {
	void m1() {
		m2();
	}
void m2() {
	m1();
}
public static void main(String[] args) {
	System.out.println("main() method started...");
	Example5 e5 = new Example5();
	e5.m1();
	System.out.println("main() method ended...");
}
}
