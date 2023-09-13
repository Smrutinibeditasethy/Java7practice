package com.practice;

//demo of static and instance block

public class DemoBlock {
	{
		System.out.println("this is a instance block");
	}
	public DemoBlock() {
		System.out.println("This is a constructor");
	}
	static {
		System.out.println("this is a static block");
	}
	
	public static void main(String[] args) {
		System.out.println("I am main method ");
		DemoBlock db = new DemoBlock();
	}

}
