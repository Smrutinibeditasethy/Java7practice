package com.practice;

public class Driver1 {
	public static void main(String[] args) {
		Driver1 d = new Driver1();
		Product p = new Product();
		p.productid=5623;
		p.productname = "Colgat";
		p.productprice = 560;
		d.print(p);
	}
void print(Product p) {
	System.out.println("The product name is " +p.productname + " and the price is " +p.productprice +". The id is " +p.productid);
}
}
