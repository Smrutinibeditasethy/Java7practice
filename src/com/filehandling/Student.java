package com.filehandling;

import java.io.Serializable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class Student implements Serializable {
	private static final long serialVersionUID = -1001;
	int id; 
	String name;
	public static void main(String[] args) throws IOException, Exception {
		Student s = new Student();
		s.id = 100;
		s.name = "Smruti";
		System.out.println("===Seialization Started====");
		
		FileOutputStream fos = new FileOutputStream("student.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.flush();
		oos.close();
		System.out.println("====Serialization completed====");
		
		System.out.println("====De-Serialization started===");
		
		FileInputStream fis = new FileInputStream("student.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object object = ois.readObject();
		Student s1 = (Student) object;
		System.out.println("Id : " + s1.id);
		System.out.println("Name : " +s1.name);
		ois.close();
		System.out.println("===De-Serialization completed===");
	}

}
