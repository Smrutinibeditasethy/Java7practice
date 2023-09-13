package com.filehandling;

import java.io.*;
import java.io.BufferedWriter;
public class Example11 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("mouli.txt");
		FileReader fr1 = new FileReader("smruti.txt");
		FileWriter fw = new FileWriter("popo.txt");
		BufferedReader br = new BufferedReader(fr);
		BufferedReader br1 = new BufferedReader(fr1);
		
		
		String m = br.readLine();
		while (m!=null) {
			fw.write(m);
			
			m=br.readLine();
		}
		fw.flush();
		
	System.out.println("\n");
		String m1 = br1.readLine();
		while (m1!=null) {
			fw.write(m1);
			m1=br1.readLine();
		}
		fw.flush();
		fw.close();
	}

}
