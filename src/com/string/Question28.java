package com.string;
public class Question28 {
	public static void main(String[] args) {
		String s1 = "Hyderabad";
		char[] arr= s1.toCharArray();
		System.out.println(arr);
		char temp=0;
		for (int i = 0; i < arr.length-1; i=i+2) {
				temp= arr[i];
				arr[i]= arr[i+1];
				arr[i+1]=temp;
			}System.out.print(arr);
		}
	
	}

