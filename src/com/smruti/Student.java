package com.smruti;
public class Student {


	public static void main(String[] args) throws Exception {


		Student s = new Student(); // obj creation
		Class clz = s.getClass();
		
		
		Object object = clz.newInstance(); // 2nd approach to create object for a cls
		System.out.println(object);

	

	}
	
}
