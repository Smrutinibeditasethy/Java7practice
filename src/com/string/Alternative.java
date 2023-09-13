package com.string;

public class Alternative {
public static void main(String[] args) {
	String s1 = "Smruti";
	System.out.println(s1);
	
	for (int i = 0; i < s1.length(); i++) {
		if (s1.charAt(i)%2==0) {
			System.out.print(s1.charAt(i));
		}
	}
	
}
}
