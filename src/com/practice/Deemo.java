package com.practice;

//toString and hashCode method

public class Deemo {
	int id;
	String name;
	
	public String toString() {
		return id + "__" +name;
		
	}
	public int hashCode() {
		return id;
	}
	public static void main(String[] args) {
		Deemo de = new Deemo();
		de.id = 102;
		de.name = "Smruti";
		System.out.println(de);
		System.out.println(de.toString());
		String s1 = new String();
		
		
		System.out.println(s1);
	System.out.println(de.hashCode());
	System.out.println(s1.hashCode());
	}
	
}
