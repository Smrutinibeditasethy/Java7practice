package com.exception;


public class Example4 {
	public String getName(int id) throws Exception {
		if (id ==100) {
			return "Smruti";
		}else if (id ==101) {
			return "Mouli";	
		}else {
			throw new Exception("Invalid id");
		}		
	}
	public static void main(String[] args) throws Exception {
		Example4 e4 = new Example4();
		String name = e4.getName(101);
		System.out.println(name);
		
		String name2 = e4.getName(105);
		System.out.println(name2);
	}

}
