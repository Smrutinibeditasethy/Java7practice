package com.generics;

public class Example3 <T1, T2>{
	T1 obj1;
	T2 obj2;
	Example3(T1 obj1, T2 obj2){
		this.obj1= obj1;
		this.obj2 = obj2;
	}
	void print() {
		System.out.println(obj1 + ", " +obj2);
	}
	public static void main(String[] args) throws Exception {
		Example3<Integer, String> e = new Example3<>(16, "Smruti");
		e.print();
		Example3<String, Boolean> e1 = new Example3<>("Mouli", true);
		e1.print();
		Example3<Double, String> e2 = new Example3<>(162.12, "Smruti");
		e2.print();
		
	}

}
