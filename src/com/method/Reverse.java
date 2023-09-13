package com.method;

public class Reverse {
	public static void main(String[] args) {
		
		String value = Rev("Hello how are you");
		
	}
	public static String Rev(String s1) {
		String[] s2 = s1.split(" ");
		String store;
		
		store= s2[0];
		s2[0]= s2[s2.length-1];
		s2[s2.length-1] = store;   //swap
		
		String store3 = " ";
		
		for (int i = s2.length-2; i >= 1; --i) {
			String store2= s2[i];
			
			for (int j =store2.length()-1; j >= 0; --j) {
				store3 += store2.charAt(j);
			}
			store3 += " ";
		}
		System.out.println(s2[0]+ " " +store3  +" " + s2[s2.length-1]);
		return s1;
	}

}
