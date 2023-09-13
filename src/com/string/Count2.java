package com.string;

public class Count2 {
public static void main(String[] args) {
	String s1 = "SmrUTiniBedITa@1234";
	System.out.println(s1);
	int count =0;
	int count2 = 0;
	int count3 = 0 ;
	  for (int i = 0; i < s1.length(); i++) {
		  char arr= s1.charAt(i);
		  if (Character.isUpperCase(arr)) {
			  count++;
		  }
	  }
	  System.out.println("The no of uppercase : "  +count);
	  for (int i = 0; i < s1.length(); i++) {
		  char arr= s1.charAt(i);
		  if (Character.isLowerCase(arr)) {
			  count2++;
		  }
	  }
	  System.out.println("The no of lowercase : "  +count2);
	  for (int i = 0; i < s1.length(); i++) {
		  char arr= s1.charAt(i);
		  if (Character.isDigit(arr)) {
			  count3++;
		  }
	  }
	  System.out.println("The no of Digit : "  +count3);
}
}
