package com.string;

public class Question37 {
	public static void main(String[] args) {
		String s1 = "Smruti@$123*&"	;
		System.out.println(s1);
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (!Character.isDigit(s1.charAt(i))) {
				count++;
			}			
		}
		if (count ==0) {
			System.out.print("The string conatains only digit.");
		}else
			System.out.print("The string conatains mix of all.");

	}

}
