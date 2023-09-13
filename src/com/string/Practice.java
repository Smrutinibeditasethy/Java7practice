package com.string;

public class Practice {
	public static void main(String[] args) {
		String s1 = "SmrutiNibeditaSethy";
		String s2 = "MouliShankarAdapa";
		String s = String.format("%s%s",s1,s2);
		String s3 = String.join(" ",s1,s2);
		System.out.println(s1.charAt(6));
		System.out.println(s1.codePointAt(6));
		System.out.println(s1.codePointBefore(6));
		System.out.println(s1.codePointCount(4, 9));
		System.out.println(s1.concat(s2));
		System.out.println(s1.contentEquals(s2));
		System.out.println(s2.compareTo(s1));
		System.out.println(s.toString());
		System.out.println(s3.toString());
		System.out.println(s1.substring(5));
		System.out.println(s2.substring(6, 10));

	}

}
