package com.map;

import java.util.Objects;

public class Car {
int seat;

public Car(int seat) {
	this.seat=seat;
}

@Override
public int hashCode() {
	return seat;
}

@Override
public String toString() {
	return seat +" ";
}


}
