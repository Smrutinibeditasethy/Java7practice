package com.string;

public class Question13 {
	public static void main(String[] args) {
	String s1= "Hi i am smruti Hi welcome to my house my house name is smruti";
	String[] stringArray = s1.split(" ");
	System.out.println(s1);
	int temp=0;
	for (int i = 0; i < stringArray.length; i++) {
		temp= 1;
	for (int j = i+1; j < stringArray.length; j++) {
		if (stringArray[i].equalsIgnoreCase(stringArray[j])) {
			temp++;
			stringArray[j]= " ";
		}
		}
	if (temp==1 && stringArray[i] !=" ") {
		System.out.println(stringArray[i]);
	      } 
	    }
}	
}
		 
		
		


