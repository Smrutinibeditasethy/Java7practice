package com.filehandling;

import java.io.File;

public class Example4 {
public static void main(String[] args) {
	File f = new File("C:\\Users\\Smruti Nibedita\\Desktop\\dumbu");
	String[] poo = f.list();
	
	for(String name: poo) {
		File f1 = new File(f, name);
		if (f1.isFile()) {
			System.out.println("File :: " +name);
		}
		if (f1.isDirectory()) {
			System.out.println("Directory:: " +name);
		}
	}
}
}
