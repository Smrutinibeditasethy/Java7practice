package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the id 101 or 102 : ");
		int id = Integer.parseInt(br.readLine());
		Test t = new Test();
		Person person= t.print(id);
System.out.println("The data is : " +person.id  +"--" +person.name );
		
	}
	
Person print(int id) {
	Person p= new Person();
	if (id==101) {
		p.id=101;
		p.name = "Raju";
		p.age = 30;
	}else if (id == 102) {
		p.id = 102;
		p.name="Rani";
		p.age = 32;	
	}return p;
}
}
