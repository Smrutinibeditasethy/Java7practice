package com.filehandling;

import java.io.File;
public class Example2 {
	public static void main(String[] args) {
		File f = new File("D:\\my work\\MySql");
		String[] arr = f.list();
		for (String name : arr) {
			System.out.println(name);
		}
	}

}
