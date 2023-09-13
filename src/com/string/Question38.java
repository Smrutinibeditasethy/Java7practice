package com.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question38 {
	 private static String padString(String s1, int ans, char paddingChar) {
	        return String.format("%-" + ans + "s", s1).replace(' ', paddingChar);
	    }
	public static void main(String[] args) throws NumberFormatException, IOException {
		String s1= "Smruti";
		System.out.println(s1);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter the length of String : ");
		int ans = Integer.parseInt(br.readLine());
		
		char paddingChar = '*';
		
		String paddedString = padString(s1,ans, paddingChar);
		System.out.println("The string is padded in right side : " +paddedString);
		
	}
	}

