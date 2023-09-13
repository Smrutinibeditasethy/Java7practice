package com.string;

public class Question25 {
	public static void main(String[] args) {
		String s1= "SmrU&%123";
		System.out.println(s1);
		String s2 = s1.replaceAll("[A-Z]", "");
		System.out.println(s2);
		String s3 = s1.replaceAll("[a-z]", "");
		System.out.println(s3);
		String s4 = s1.replaceAll("[0-9]", "");
		System.out.println(s4);
		String s5 = s1.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(s5);
	}

}
