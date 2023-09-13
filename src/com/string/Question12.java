package com.string;

public class Question12 {
	public static void main(String[] args) {
		String s1= "S@mr$uti#Nib&edit@aS@et@hy";
		int count= 0;
		for (int i = 0; i < s1.length(); i++) {
			if (!Character.isDigit(s1.charAt(i)) && (!Character.isLetter(s1.charAt(i)) && !Character.isWhitespace(s1.charAt(i)))) {
				count++;
			
			}
			
		}
		System.out.println("The string : " +s1);
		if (count==0) {
			System.out.println("NO special charater is present in the string.");
		
		}else
			System.out.println("Special character is present : " +count);
	}

}
