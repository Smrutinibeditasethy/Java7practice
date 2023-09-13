package com.practice;

import java.lang.reflect.Array;

public class MaxElement {
	public static void main(String[] args) {
		int[] arr = { 8, 5, 7, 3 , 9 , 14 ,82};
		System.out.println(MaxElement.findMax(arr));
	}
static int findMax(int[] arr) {
	
	int temp=arr[0];
	for (int i=0; i<arr.length; i++) {
		
		if (arr[i]>temp) {
			temp = arr[i];
		}
	}
	return temp;
	
}
}

