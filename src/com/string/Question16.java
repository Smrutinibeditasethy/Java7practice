package com.string;

public class Question16 {
	public static void main(String[] args) {
		String s1=  "SmruTiNibeDitaSeTHy";
		System.out.println("The orignal String : " +s1);
		
		String temp = "";
		
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i)>=65 && s1.charAt(i)<=90 ) {
				temp += s1.charAt(i);
			}else
				System.out.print(s1.charAt(i));
			
		}
		
		System.out.println(temp);
		
	
	}

}
