package com.method;

public class Replacechar {
void Character (String s1) {
	String s2 = s1.replace('i', 'e');
	System.out.println(s2);	
}
public static void main(String[] args) {
	Replacechar c1 = new Replacechar();
	c1.Character("Smruti Nibedita Sethy");
	c1.Character("Hi Everyone");
}
}
