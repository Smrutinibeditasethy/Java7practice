package com.method;

public class Count {
	void Splchar(String s1) {
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
	public static void main(String[] args) {
		Count c1 = new Count();
		c1.Splchar("S@mr$uti#Nib&edit@aS@et@hy");
		c1.Splchar("Smruti&*HI$%#");
	}

}
