package com.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Questioneight {
	public static void main(String[] args) throws IOException {
		String s1 = "Smruti Nibedita Sethy";
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader be =new BufferedReader(isr);
		
		System.out.println("Enter the String 'Smruti Nibedita Sethy': ");
		String s2 = be.readLine();
	}

}
