package com.inheritance;

public class Student4 extends Demo {
	double getLoanInterest() {
		return 12.56;
	}
	
public String applyHomeLoan() {
	boolean status = checkPassword();
	if (status) {
		double homeLoan = getLoanInterest();
		String msg = "loan is approved " +homeLoan;
		return msg;
		
	}else {
		return "you are not given ";
	}
}
public static void main(String[] args) {
	Student4 s = new Student4();
	String msg = s.applyHomeLoan();
	System.out.println(msg);
}
}
