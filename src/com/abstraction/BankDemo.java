package com.abstraction;

public class BankDemo {

	public static void main(String[] args) {
		Bank b; // reference variable
		
		
		
		b= new HdfcBank(); //Storing imple object into ref var
		b.moneyTransfer(); // Hdfc method called
		b.checkBalance(); // Hdfc method called
		
		
		b= new AxisBank();
		b.moneyTransfer(); // Axis method called
		b.checkBalance();  //Axis method called
	}

}
