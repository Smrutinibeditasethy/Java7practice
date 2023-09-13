package com.abstraction;

public class Machine extends PetrolMacihne {
	public Machine() {
		System.out.println("Machine constructor");
	}

	@Override
	public void fillFuel() {
		System.out.println("Filling fuel tank");
		
	}
	public static void main(String[] args) {
		Machine m=new Machine();
		m.fillFuel();
		m.start();
	}

}
