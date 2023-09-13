package com.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prime {
public static void main(String[] args) throws NumberFormatException, IOException {
	 InputStreamReader isr= new InputStreamReader(System.in);
     BufferedReader br=new BufferedReader(isr);
     int number =Integer.parseInt(br.readLine());
     System.out.print("Factors of " + number + " excluding 1 and the number itself: ");
     Prime p1 = new Prime();
     p1.printFactors(number);
}
public static void printFactors(int number) {
    boolean isPrime = true;

    for (int i = 2; i <= number / 2; i++) {
        if (number % i == 0) {
            isPrime = false;
            System.out.print(i + " ");
        }
    }

    if (isPrime) {
        System.out.println("-1");
}
}
}

