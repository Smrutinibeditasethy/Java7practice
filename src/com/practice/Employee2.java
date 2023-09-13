package com.practice;

//example of this keyword

public class Employee2 {
int age;
String name;
public Employee2(String name, int age) {
	this.age = age;
	this.name = name;
	System.out.println("My name is " +this.name +" and my age is " +this.age);
}
public static void main(String[] args) {
	Employee2 emp = new Employee2("Smruti", 25); 
}
}
