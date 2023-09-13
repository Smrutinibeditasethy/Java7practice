package com.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Averagearray {
public static void main(String[] args) throws IOException {
	 InputStreamReader isr= new InputStreamReader(System.in);
     BufferedReader br=new BufferedReader(isr);
     System.out.println("Enter the number of data: ");
     int num= Integer.parseInt(br.readLine());
     int value = Average(num);  
}

public static int Average(int a) throws NumberFormatException, IOException {
	  int[] myNum= new int[a];
	  InputStreamReader isr= new InputStreamReader(System.in);
	     BufferedReader br=new BufferedReader(isr);
	     System.out.println("Enter the data : ");
	     for (int i=0; i<a; i++){
	            myNum[i] = Integer.parseInt(br.readLine());
	        }
	        int total= 0;
	        int average;
	        for (int i=0; i< myNum.length; i++){
	            total= total+myNum[i];
	        }
	        average= total/a;
	        System.out.println("The average of the data :  " +average);
	        return average;
	    }
}
