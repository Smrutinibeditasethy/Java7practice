package com.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<>();
		l.add("Smruti");
		l.add("Mouli");
		l.add("Deepika");
		l.add("Ajay");
		l.add("Nani");
		System.out.println(l);
		
		ListIterator<String> li = l.listIterator();
		while (li.hasNext()) {
			String s = li.next();
			if (s.equals("Smruti")) {
				li.remove();
			}else if (s.equals("Deepika")) {
				li.add("Monika");
			}else if (s.equals("Ajay")) {
				li.set("Priya");
			}
		}
		System.out.println(l);
		
		
			}
				
	}

