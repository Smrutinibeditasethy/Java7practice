package com.filehandling;

import java.io.*;
public class Example7 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("data.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		
		while (line!=null) {
			System.out.println(line);
			line= br.readLine();
		}
	}

}
