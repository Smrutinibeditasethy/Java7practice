package com.inheritance;

public class Employee extends User {
	int salary;
	public static void main(String[] args) {
		Employee e = new Employee();
		//User u = new User();
		//by using parent class object we cant access the child class variables
		//but by using child class object we can access all variables
		e.salary = 50000;
		e.id = 1259;
		e.name = "Smruti";
		System.out.println(e.id +"--" +e.name +"--" +e.salary);
	}

}
