package com.collection;

import java.util.TreeSet;

public class ComparableComparator {

	public static void main(String[] args) {
Employee e1 = new Employee("Smruti", 100);
Employee e2 = new Employee("Mouli", 500);
Employee e3 = new Employee("Suraj", 600);
Employee e4 = new Employee("Real", 250);
Employee e5 = new Employee("Maruti", 560);

TreeSet<Employee> t = new TreeSet<>();
t.add(e1);
t.add(e2);
t.add(e3);
t.add(e4);
t.add(e5);


System.out.println(t);
	}

}
