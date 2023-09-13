package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

//weakhash map demo


public class Demo3 {
public static void main(String[] args) throws InterruptedException {
	//Map<Integer, String> m = new HashMap<>();
	Temp t = new Temp();
	Map<Temp, String> m = new WeakHashMap<>();

	//Integer i = new Integer(20);
	m.put(t, "Smruti");
	System.out.println(m);
	t=null;
	
	System.gc();
	Thread.sleep(5000);
	System.out.println(m);
}
}
