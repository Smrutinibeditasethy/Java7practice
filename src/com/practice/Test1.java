package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Test1 t1= new Test1();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the id 7 or 18 or 45 : ");
		int id = Integer.parseInt(br.readLine());
		Cricket circket= t1.c1(id);
		System.out.println("The data is " +circket.name +"---" +circket.age);
	}
Cricket c1(int id) {
	Cricket c = new Cricket();
	if (id==7) {
		c.id=7;
		c.name ="Dhoni";
		c.age = 42;
	} else if (id==18) {
		c.id=18;
		c.name ="Kohli";
		c.age = 45;
	}else if (id==45) {
		c.id=45;
		c.name ="Rohit Sharma";
		c.age = 42;
	}
	return c;
	
}
}
