package com.filehandling;

import java.io.*;

public class Example8 {
public static void main(String[] args) throws IOException {
	FileWriter fw = new FileWriter("popo.txt");
	fw.write("Hi");
	fw.write("\n");
	fw.write("My name is Smruti");
	fw.write("\n");
	fw.write("Lets start the file");
	fw.flush();
	fw.close();
}
}
