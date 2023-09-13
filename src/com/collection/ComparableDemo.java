package com.collection;

import java.util.TreeSet;

public class ComparableDemo {
public static void main(String[] args) {
	TreeSet<StringBuffer> t = new TreeSet<>();
	t.add(new StringBuffer("P"));
	t.add(new StringBuffer("R"));
	t.add(new StringBuffer("D"));
	t.add(new StringBuffer("P"));
System.out.println("R".compareTo("P"));
System.out.println("D".compareTo("P"));
System.out.println("P".compareTo("P"));

}
}
