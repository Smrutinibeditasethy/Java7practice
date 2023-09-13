package com.exception;

public class Example3 {
	public static void main(String[] args) {
		System.out.println("main() method started...");
		try {
			System.out.println("try block started...");
			String s1 = "Smruti";
			int a = s1.length();
			System.out.println("try block ended....");
		} catch (ArithmeticException e) {
			System.out.println("catch block..");
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally block...");
		}
		System.out.println("main() method is ended...");
	}


}
