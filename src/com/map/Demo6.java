package com.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class Demo6 {
public static void main(String[] args) throws Exception {
	Properties p = new Properties();
	FileInputStream f = new FileInputStream("myproperties.properties");
	p.load(f);
	System.out.println(p);
	
	String username = p.getProperty("user");
	System.out.println(username);
	
	p.setProperty("Mouli", "45689");
	FileOutputStream fo = new FileOutputStream("myproperties.properties");
	p.store(fo, "Updated by Smruti");
}
}
