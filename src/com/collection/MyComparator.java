package com.collection;

import java.util.Comparator;

public class MyComparator implements Comparator<Object>{


	@Override
	public int compare(Object o1, Object o2) {
		Integer t1=(Integer)o1;
		Integer t2=(Integer)o2;
		if (t1<t2) {
			return 100;
		}else if (t1>t2) {
			return -100;
		} else
		return 0;
	}

}
