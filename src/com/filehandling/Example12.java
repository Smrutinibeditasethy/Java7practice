package com.filehandling;

import java.io.*;
public class Example12 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("dude.txt");
		FileReader fr1 = new FileReader("me.txt");
		BufferedReader br = new BufferedReader(fr);
		BufferedReader br1 = new BufferedReader(fr1);
		String name = br.readLine();
		String name1 = br1.readLine();
		while (name!=null) {
			System.out.println(name);
			name = br.readLine();
		}
		while (name1!=null) {
			System.out.println(name1);
			name1 = br1.readLine();
		}
		
	}
	

}
