package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Method4 {
public static void main(String[] args) throws NumberFormatException, IOException {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	System.out.println("Enter the age : ");
	int a = Integer.parseInt(br.readLine());
	Method4 m4 = new Method4();
	System.out.println(m4.age(a));
}
boolean age(int a) {
	if (a>=18) {
	return true;}
	else {
		return false;
	}
}
}
