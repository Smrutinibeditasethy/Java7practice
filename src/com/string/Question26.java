package com.string;

public class Question26 {
public static void main(String[] args) {
	String s1 = "Smruti@%&*Nibeditasethy";
	int count = 0;
	for (int i = 0; i < s1.length(); i++) {
		if (!Character.isDigit(s1.charAt(i))&& !Character.isLetter(s1.charAt(i))&& !Character.isWhitespace(s1.charAt(i))) {
			count++;
		}
	}System.out.println("The string : " +s1);
	if (count==s1.length()) {
		System.out.println("Its a special character string only.");
	
	}else
		System.out.println("Its a mix of special and normal characters.");
	
		
	}
}
