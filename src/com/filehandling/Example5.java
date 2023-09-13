package com.filehandling;

import java.io.*;

public class Example5 {
	
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("data.txt");
		fw.write("Hello");
		fw.write("\n");
		fw.write("How are you people?");
		fw.flush();
		fw.close();
	}

}
