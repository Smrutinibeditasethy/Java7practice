package com.string;

public class Question31 {
	public static void main(String[] args) {
		String s1 ="Smruti";
		char[] arr= s1.toCharArray();
		System.out.println(arr);
		char temp = 0;		
			temp=arr[0]; 
			arr[0]= arr[arr.length-1];
			arr[arr.length-1]=temp;
		System.out.println(arr);

}
}