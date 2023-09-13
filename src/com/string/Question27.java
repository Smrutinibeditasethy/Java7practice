package com.string;

public class Question27 {
	public static void main(String[] args) {
	String s1= "Smruti@#456";
	int count=0;
	System.out.println(s1);
	for (int i = 0; i < s1.length(); i++) {
		if (!Character.isDigit(s1.charAt(i))&& !Character.isLetter(s1.charAt(i))&& !Character.isWhitespace(s1.charAt(i))&& !Character.isLetterOrDigit(s1.charAt(i))) {
			count++;
	}
}
	if (count==0) {
	System.out.println("NO the string dont conatain any uppercase, lowercase, special character or numeric value");
	}else
		System.out.println("The string conatain uppercase, lowercase, special character or numeric value");
}
}