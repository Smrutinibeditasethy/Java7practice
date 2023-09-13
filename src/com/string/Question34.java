package com.string;

public class Question34 {
	public static boolean stringToBoolean(String s) {
		boolean b1 = Boolean.parseBoolean(s);
		return b1;
	}
	
	public static void main(String[] args) {
		String s= "true";
		System.out.println(stringToBoolean(s));
		 s = "false";
		System.out.println(stringToBoolean(s));
		s = "no";
		System.out.println(stringToBoolean(s));
		s = "yes";
		System.out.println(stringToBoolean(s));
		
		
		
	}

}
