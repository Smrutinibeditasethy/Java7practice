package com.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question29 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		String s1 ="Smruti Nibedita Sethy";
		char[] arr = s1.toCharArray();
		 InputStreamReader isr= new InputStreamReader(System.in);
		 BufferedReader br = new BufferedReader(isr);
		  
		 System.out.println(arr);
		 System.out.println("Enter the number of string to be printed : ");
		 int k=Integer.parseInt(br.readLine());
		 
		 for (int i = 0; i <= k; i++) {
				 System.out.print(arr[i]);
				
			}
			
		}
		 
	}

