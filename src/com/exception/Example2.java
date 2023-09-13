package com.exception;

public class Example2 {
public static void main(String[] args) {
	System.out.println("main() method started...");
	try {
		System.out.println("try block started..");
		String s1 = "hi";
		int a = s1.length();
		System.out.println("try block end...");
	} catch (Exception e) {
		System.out.println("in catch block");
		e.printStackTrace();
	}
	System.out.println("main() method ended...");
}
}
