package com.filehandling;

import java.io.*;

public class Example9 {
public static void main(String[] args) throws IOException {
	FileReader fr = new FileReader("popo.txt");
	int i = fr.read();
	
	int count =0;
	while (i!=-1) {
		count++;
		i= fr.read();
	}
	System.out.println("The number of character = " +count);
	
}
}
