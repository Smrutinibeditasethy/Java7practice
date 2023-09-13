package com.exception;

public class Momo {
private String getName(int id) {
	if (id==100) {
		return "Smruti";
	}else if (id==101) {
		return "Mouli";
	}else {
		throw new NoDataFoundException("Invalid id");
	}
}
public static void main(String[] args) {
	Momo m =new Momo();
	String bubu = m.getName(103);
	System.out.println(bubu);
}
}
