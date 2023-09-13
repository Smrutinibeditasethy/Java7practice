package com.concurrentcollection;

import java.util.ArrayList;
import java.util.Iterator;

public class Traditional extends Thread {
	static ArrayList<String> a = new ArrayList<>();
	 public void run() {
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		 System.out.println("Child Thread updating List.");
		 a.add("Smruti");
	 }
public static void main(String[] args) throws InterruptedException {
	a.add("Mouli");
	a.add("Deepika");
	a.add("Ajay");
	a.add("Nani");
	Traditional t= new Traditional();
	t.start();
	
	Iterator<String> i = a.iterator();
	while (i.hasNext()) {
	String s = i.next();
	System.out.println("Main thread iterating list and current object is : " +s);
	Thread.sleep(5000);
	
	}
	System.out.println(a);
}
}
