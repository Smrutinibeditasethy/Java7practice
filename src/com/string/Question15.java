package com.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question15 {
	public static void main(String[] args) throws IOException {
		String s1 = "Hello its Smruti how can I help you";

		System.out.println(s1);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter the value you want to remove : ");
		String value= br.readLine();
		 
		s1= s1.replaceAll(value, "");
			
		System.out.println("The updated string is : " +s1);
		}

}
