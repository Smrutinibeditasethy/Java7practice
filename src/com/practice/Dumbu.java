package com.practice;

// equals()

public class Dumbu {
int id;
String name;
public Dumbu(int id, String name) {
	this.id = id;
	this.name = name;
}
public static void main(String[] args) {
	Dumbu d1 = new Dumbu(105, "Smruti");
	Dumbu d2 = new Dumbu(105, "Smruti");
	System.out.println(d1.equals(d2));
	System.out.println(d1==d2);
	
	String s1 = new String("Smruti");
	String s2 = new String("Smruti");
	System.out.println(s1.equals(s2));
	System.out.println(s1==s2); //in string == checks the address
}
}
