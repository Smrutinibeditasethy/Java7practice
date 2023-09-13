package com.filehandling;

import java.io.File;
import java.io.IOException;

public class Example1 {
	public static void main(String[] args) throws IOException {
		File f = new File("smruti.txt");
		boolean fstatus = f.createNewFile();
		System.out.println(fstatus);
		
		File f2 = new File("mouli.txt");
		boolean f2status = f2.createNewFile();
		System.out.println(f2status);
		
		File f3 = new File("myjob");
		boolean f3status  =f3.mkdir();
		System.out.println(f3status);
		
		File f4 = new File("data");
		f4.mkdir();
		File f5 = new File(f4, "tsst.txt");
		f5.createNewFile();
	}

}
