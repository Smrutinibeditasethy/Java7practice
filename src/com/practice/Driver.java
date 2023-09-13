package com.practice;

public class Driver {
	public static void main(String[] args) {
		Driver d = new Driver();
		Employee e = new Employee();
		e.id=123456;
		e.salary=500000;
		d.print(e);
	}
void print(Employee e) {
	System.out.println("The employee id is " +e.id + " and the salary is " +e.salary);
}
}
