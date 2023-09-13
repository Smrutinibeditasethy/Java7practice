package com.method;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
	public static void main(String[] args) throws NumberFormatException, IOException {
		 InputStreamReader isr= new InputStreamReader(System.in);
	        BufferedReader br=new BufferedReader(isr);	     
	        System.out.println("Enter the positive value: ");
	       int a= Integer.parseInt(br.readLine());
	       int value = fact(a);
	       System.out.println("The factorial is : " +value);
	       
	}
	public static int fact(int f) {
	        int facto= 1;
	        for (int i=1; i<=f; i++){
	            facto *=i;
	        }
	return facto;
}
}
