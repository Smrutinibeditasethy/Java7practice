package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Truefalse {
	public static void main(String[] args) throws NumberFormatException, IOException {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	System.out.println("Enter the age : ");
	int age= Integer.parseInt(br.readLine());
	System.out.println(Truefalse.check(age));
	}
static boolean check(int age) {
	if (age>=18) {
		return true;
		
	} else
	return false;
}
}
