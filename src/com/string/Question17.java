package com.string;

public class Question17 {
	public static void main(String[] args) {
		String s1 = "1010011";
		String s2 = "001010100";
		
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		
		int sum = n1 + n2;
		String result = Integer.toBinaryString(sum);
		
		System.out.println("The sum of 2 binary String : " +result);
	}

}
