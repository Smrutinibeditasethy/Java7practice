package com.inheritance;

public class Test {
public static void main(String[] args) {
	Locality l=new Locality();
	l.m1();
	l.m2();
	int hashcode=l.hashcode();
	System.out.println(hashcode);
}
}
