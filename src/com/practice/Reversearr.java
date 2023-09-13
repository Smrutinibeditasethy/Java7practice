package com.practice;

import java.util.Iterator;

public class Reversearr {
public static void main(String[] args) {
	int[] revArr = {10, 23, 45, 89};
	Reversearr.revArr(revArr);
}
static void revArr(int[] arr) {
	int i;
	int j;
	int[] revArr = new int[4];
	for (i = 0, j=4-1; i < 4; i++, j++) {
		revArr[i] = revArr[j];	
	
	}
		
	}
}

