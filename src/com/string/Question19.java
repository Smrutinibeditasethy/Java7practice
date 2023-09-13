package com.string;

public class Question19 {
	public static void main(String[] args) {
		String s1 = "Heaven";
		s1= s1.toLowerCase();
	int temp = 0;
		
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u') {
				temp++;
			}
		}
		System.out.println(s1);
		System.out.println("The no of vowels in the string  : " +temp);
	}

}
