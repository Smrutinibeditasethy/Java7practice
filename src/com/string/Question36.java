package com.string;

public class Question36 {
	public static void main(String[] args) {
	String s1 = "Smruti@$123*&"	;
	System.out.println(s1);
	for (int i = 0; i < s1.length(); i++) {
		if (!Character.isLetterOrDigit(s1.charAt(i))) {
			System.out.print("");
		}else
			System.out.print(s1.charAt(i));
	}
	
	}

}
