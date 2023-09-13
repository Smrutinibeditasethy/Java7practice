package com.concurrentcollection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo4 extends Thread {
static CopyOnWriteArrayList<Integer> cw = new CopyOnWriteArrayList<>();

public void run() {
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {	
	}
	System.out.println("Child thread is updating...");
	cw.add(123);
}

public static void main(String[] args) throws InterruptedException {
	cw.add(159);
	cw.add(753);
	cw.add(456);
	cw.add(852);
	Demo4 d = new Demo4();
	d.start();
	
	Iterator<Integer> i = cw.iterator();
	while (i.hasNext()) {
		Integer f = i.next();
		System.out.println("Main thread is iterating : " +f);
		Thread.sleep(4000);
	}
	System.out.println(cw);
}

}
