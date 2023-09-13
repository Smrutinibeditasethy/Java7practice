package com.generics;

public class Example1<T> {
	public void m1(T arg) {
	System.out.println("Parameter Recieved : " +arg);
	}
	public static void main(String[] args) {
		Example1 e = new Example1();
		e.m1(10);
		e.m1("Smruti");
		e.m1(100.25);
	}
}
