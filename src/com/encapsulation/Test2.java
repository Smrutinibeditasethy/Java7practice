package com.encapsulation;

public class Test2 {
public static void main(String[] args) {
	Login l = new Login();
	l.setuserName("Smruti");
	l.setpassword("Smruti@16");

	String userName= l.getuserName();
	String password = l.getpassword();
	System.out.println(userName +"---" +password);
}
}
