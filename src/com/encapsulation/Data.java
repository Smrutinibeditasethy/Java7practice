package com.encapsulation;

public class Data {
public static void main(String[] args) {
	Facebook f = new Facebook();
	f.setemail("Smruti.vtalent@gmail.com");
	f.setpassword("vtalent@123");
	
	String email = f.getemail();
	String password = f.getpassword();
	
	System.out.println("Email : " +email);
	System.out.println("Password : " +password);
}
}
