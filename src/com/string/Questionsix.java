package com.string;


public class Questionsix {
	public static void main(String[] args) {
		String s1 = "Smruti Nibedita Sethy";
		String[] stringArray = s1.split(" ");
		
		System.out.println("The string is : Smruti Nibedita Sethy");
		System.out.println("The string array is : ");
		System.out.print("[");
		
		for (int i = 0; i < stringArray.length; i++) {
		
			System.out.print(stringArray[i] + ", ");
		}
			System.out.println("]");
		}
		

		
	}

