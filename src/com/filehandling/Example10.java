package com.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example10 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("popo.txt");
		BufferedReader br = new BufferedReader(fr);
		String po = br.readLine();
		int count1 = 0;
		
		while (po!=null) {
			count1++;
			po = br.readLine();
		}
		System.out.println("The number of line = " +count1);
	}

}
