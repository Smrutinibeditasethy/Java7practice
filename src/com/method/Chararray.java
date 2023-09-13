package com.method;

public class Chararray {
	void array(String a) {
		char[] s2 = a.toCharArray();
		System.out.println(s2);
		for (int i = 0; i < s2.length; i++) {
			System.out.print(s2[i] +" ");	
		}
	}
	public static void main(String[] args) {
		Chararray s1 = new Chararray();
		s1.array("Smruti Nibedita Sethy");
		
	}

}
