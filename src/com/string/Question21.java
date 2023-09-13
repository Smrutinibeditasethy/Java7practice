package com.string;

import java.util.Iterator;

public class Question21 {
	public static void main(String[] args) {
		String s1= "Hello there are 1456 no of students";
		char[] s2 = s1.toCharArray();
		int count = 0;
		for (int i = 0; i < s2.length; i++) {
				if (Character.isDigit(s2[i])) {
					count++;
				}
					
				}
		System.out.println("The no of digit in the string :" +count);
			}
	
	}

