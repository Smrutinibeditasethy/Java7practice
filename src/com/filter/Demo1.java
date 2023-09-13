package com.filter;

import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
	public static void main(String[] args) {
		 List<Integer> numbers = new ArrayList<>();
	        numbers.add(10);
	        numbers.add(15);
	        numbers.add(20);
	        numbers.add(25);
	        numbers.add(30);

	        // Filter out even numbers
	        List<Integer> oddNumbers = numbers.stream()
	                .filter(number -> number % 2 != 0)
	                .collect(Collectors.toList());

	        System.out.println("Original numbers: " + numbers);
	        System.out.println("Odd numbers: " + oddNumbers);
	}

}
