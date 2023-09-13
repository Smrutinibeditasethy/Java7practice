package com.collections;

import java.util.Arrays;
import java.util.List;

public class Demo6 {

	public static void main(String[] args) {
		String[] b = {"Smr", "Bru", "Don", "pic"};
 List<String> list =  Arrays.asList(b);
 System.out.println(list);
 b[0] ="Mou";
 System.out.println(list);
 list.set(1, "Li");
 for (String s1:b) {
	System.out.println(s1);
}
 //list.add("Smruti");
 //list.remove(1);
	}

}
