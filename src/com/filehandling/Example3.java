package com.filehandling;

import java.io.File;
import java.io.IOException;

public class Example3 {
	public static void main(String[] args) throws IOException {
		File d = new File("C:\\Users\\Smruti Nibedita\\Desktop\\dumbu");
		String[] arr = d.list();
		for(String name:arr) {
			System.out.println(name);
		}
	}

}
