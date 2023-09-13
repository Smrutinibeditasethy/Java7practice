package com.generics;

public class Example2<T> {
	T obj;
	void add(T obj) {
		this.obj = obj;
	}
	T get() {
		return obj;
	}
	public static void main(String[] args) {
		Example2<Integer> e1 = new Example2<>();
		e1.add(100);
		System.out.println(e1.get());
		
		Example2<String> e2 = new Example2<>();
		e2.add("Smruti");
		System.out.println(e2.get());
	}

}
