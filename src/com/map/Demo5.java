package com.map;

import java.util.Hashtable;

public class Demo5 {
public static void main(String[] args) {
	Hashtable<Car, String> h = new Hashtable<>();
	h.put(new Car(5), "Indian");
	h.put(new Car(2), "American");
	h.put(new Car(6), "African");
	h.put(new Car(8), "Chinese");
	h.put(new Car(12), "French");
	h.put(new Car(25), "Korea");

System.out.println(h);
}
}
