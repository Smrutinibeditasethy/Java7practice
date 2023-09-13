package com.concurrentcollection;

//CopyOnWriteArraylist demo
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo3 {
public static void main(String[] args) {
	ArrayList<String> a = new ArrayList<>();
	a.add("Smruti");
	a.add("Mouli");

	CopyOnWriteArrayList<String> cw = new CopyOnWriteArrayList<>();
	cw.addIfAbsent("Smruti");
	cw.addIfAbsent("Bubu");
	cw.addAll(a);
	
	ArrayList<String> b = new ArrayList<>();
	b.add("Smruti");
	b.add("Babu");
	
	cw.addAllAbsent(b);
	System.out.println(cw);
}
}
