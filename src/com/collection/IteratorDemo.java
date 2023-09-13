package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			ar.add(i);
		}
		System.out.println(ar);
		Iterator i = ar.iterator();
		while (i.hasNext()) {
			Integer I = (Integer) i.next();
			
			if (I%2==0) {
				System.out.println(I);
			}else {
				i.remove();
			}
		}
		System.out.println(ar);
	}

}
