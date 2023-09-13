package com.practice;

public class BigBoss implements Cloneable{
public static void main(String[] args) throws CloneNotSupportedException  {
	BigBoss bb = new BigBoss();
	System.out.println(bb);
	
	Object clone = bb.clone();
	System.out.println(clone);
	
	System.out.println(bb.hashCode());
	System.out.println(clone.hashCode());
	
}
}
