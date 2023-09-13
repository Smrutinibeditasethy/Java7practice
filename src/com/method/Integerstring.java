package com.method;

public class Integerstring {
	void Integer(String s1) {
	String[] s2 = s1.split(" ");
	int[] arr= new int[s2.length];
	for (int i= 0; i<s2.length; i++) {
		arr[i]= Integer.parseInt(s2[i]);
		}
	System.out.println(" The string : " +s1);
	System.out.print( " The Integer array : ");
	System.out.print("[");
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] +" ");
	
	}
	System.out.println("]");
}
	public static void main(String[] args) {
		Integerstring i1= new Integerstring();
		i1.Integer("123 456 789");
	}
}
