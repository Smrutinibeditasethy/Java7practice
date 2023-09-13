package com.string;

import java.util.Arrays;

public class Question18 {
	public static void main(String[] args) {
		String s1 = "Hello eveyone how are you";
		String[] arr = s1.split(" " );
		
		System.out.println("The orignal string : " +s1);
		System.out.println("The String array : " +Arrays.toString(arr));
		
	}

}
