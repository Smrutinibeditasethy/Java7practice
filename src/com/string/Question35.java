package com.string;

public class Question35 {
	public static void main(String[] args) {
		String s1 = "Smruti15*&";
		System.out.println(s1);
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (!Character.isDigit(s1.charAt(i)) && !Character.isWhitespace(s1.charAt(i))) {
				count++;
			}
		}
		if (count==s1.length()) {
			System.out.println("The string contain only alphabets.");
			
		}else
			System.out.println("The string contains mix of all.");
	
	}

}
