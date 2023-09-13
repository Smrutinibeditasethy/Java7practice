package com.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Login implements Serializable {
	private static final long serialVersionUID = -1123;
	String name;
	String email;
	transient String pwd;
	
	public static void main(String[] args) throws IOException, Exception {
		Login l = new Login();
		l.name = "Smruti";
		l.email = "abcd@gmail.com";
		l.pwd = "whatever";
		
		System.out.println("===Serialization started===");
		FileOutputStream fos = new FileOutputStream("login.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(l);
		oos.flush();
		oos.close();
		System.out.println("===Serealization completed===");
		
		System.out.println("===De-Serialization started===");
		
		FileInputStream fis = new FileInputStream("login.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object object = ois.readObject();
		Login l1 = (Login) object;
		System.out.println("Name :: " +l1.name);
		System.out.println("Email :: " +l1.email);
		System.out.println("Password :: " +l1.pwd);
		
		System.out.println("===De-Serealization completed===");

	}

}
