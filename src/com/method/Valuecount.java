package com.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Valuecount {
	public static void main(String[] args) throws NumberFormatException, IOException {
		 InputStreamReader isr= new InputStreamReader(System.in);
	     BufferedReader br=new BufferedReader(isr);
	     System.out.println("Enter the value= ");
	        int a=Integer.parseInt(br.readLine());
	        int count = Value(a);
	}
	public static int Value(int a) {
		 int i;
	        int[] array= {5,3,5,2,5,99,7,77,99,101,9,45,50};
	        int count=0;
	        for (i=0; i< array.length; i++){
	            if (array[i]==a){
	                count++;
	            }
	        }
	        System.out.println("Total number of times the value is present= " +count);
	        if (count==0){
	            System.out.println("The value is not present");
	        } return count;
	}

}
