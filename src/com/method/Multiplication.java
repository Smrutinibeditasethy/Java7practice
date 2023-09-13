package com.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplication {
	public static void main(String[] args) throws NumberFormatException, IOException {
		   InputStreamReader isr= new InputStreamReader(System.in);
	        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the positive value : ");
        int a=Integer.parseInt(br.readLine());
        int value = Mult(a);
        
        
	}
	public static int Mult(int m) {
		 for (int i=1; i<=20; i++){
	            System.out.println(m*i);
	        }
		 return m;
	}

}
