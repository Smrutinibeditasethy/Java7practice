package com.method;

public class Stringarray {
void string() {
	String s1 = "Smruti Nibedita Sethy";
	String[] stringArray = s1.split(" ");
	for (int i = 0; i < stringArray.length; i++) {
		
		System.out.print(stringArray[i] + ", ");
	}
		System.out.println("]");
	}
public static void main(String[] args) {
	Stringarray s1 = new Stringarray();
	s1.string();
	System.out.println("The string is : Smruti Nibedita Sethy");
	System.out.println("The string array is : ");
	System.out.print("[");
}
}

