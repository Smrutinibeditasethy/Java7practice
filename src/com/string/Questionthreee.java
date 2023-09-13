0package com.string;


enum Cars{
	Toyota,
	Volvo,
	BMW,
	Audi,
	Mercedes;
}

public class Questionthreee {
	public static void main(String[] args) {
		System.out.println("Convert Enum to String");
		System.out.println(Cars.Toyota.name());
		System.out.println(Cars.Volvo.name());
		System.out.println(Cars.BMW.name());
		System.out.println(Cars.Audi.name());
		System.out.println(Cars.Mercedes.name());
		
	}

}
