package com.abstraction;

//Abstract class

abstract class PetrolMacihne {
public PetrolMacihne() {
	System.out.println("PetrolMachine-constructor");
}
public void start() {
	System.out.println("Machine starting");
}
public abstract void fillFuel();
}
