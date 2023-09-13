package com.filehandling;

import java.io.*;
public class Example6 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("data.txt");
		int i =fr.read();
		
	while (i!=-1) {
		System.out.print((char) i );
		i= fr.read();
	}
	fr.close();
		}
	}


