package com.concurrentcollection;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.rowset.serial.SQLOutputImpl;

import java.sql.SQLOutput;
import java.util.*;

public class Demo2 extends Thread{
static ConcurrentHashMap<Integer, String> m = new ConcurrentHashMap();
 
public void run() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
	}
	System.out.println("Child thread is updating...");
	m.put(102, "Smruti");
}
public static void main(String[] args) throws InterruptedException {
	m.put(100, "Mouli");
	m.put(101, "Rupali");
	m.put(103, "Sunsuna");
	m.put(104, "Pupu");
	Demo2 d = new Demo2();
	d.start();
	Set s =m.keySet();
	Iterator i = s.iterator();
	while (i.hasNext()) {
		Integer in = (Integer) i.next();
		System.out.println("Main thread is iterating the object and the current object is : " +in);
		Thread.sleep(5000);
	}
	System.out.println(m);
}
}

