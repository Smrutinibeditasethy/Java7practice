package com.string;

public class Count {
	public static void main(String[] args) {
		String s1 = "SmrUTiniBedITa@1234";
		System.out.println(s1);
		   for (int i = 0; i < s1.length(); i++) {
		  char s2= s1.charAt(i);
          if (Character.isUpperCase(s2)) {
              System.out.print(s2);
          }
          
		} 
		   System.out.println( );
		   for (int i = 0; i < s1.length(); i++) {
		   char s3= s1.charAt(i);
	          if (Character.isLowerCase(s3)) {
				System.out.print(s3);
			
		}
	}

		   System.out.println( );
		   for (int i = 0; i < s1.length(); i++) {
		   char s4= s1.charAt(i);
	          if (Character.isDigit(s4)) {
				System.out.print(s4);
	}
}
		   System.out.println( );
		   for (int i = 0; i < s1.length(); i++) {
			   char s5= s1.charAt(i);
			   if (!Character.isUpperCase(s5) && !Character.isLowerCase(s5)&& !Character.isDigit(s5) ) {
				   System.out.print(s5);
			}
		   }
	}
}

