package com.collection;

public class Employee implements Comparable<Object>{
String name;
int eid;

public Employee(String name, int eid) {
	this.name = name;
	this.eid = eid;
	
}

@Override
public String toString() {
	return "[name=" + name + ", eid=" + eid + "]";
}

@Override
public int compareTo(Object o) {
	String s1=this.name;
	//int eid1 = this.eid;
	Employee e = (Employee) o;
	//int eid2 = e.eid;
	String s2 = e.name;
	return s2.compareTo(s1);
}	
}

