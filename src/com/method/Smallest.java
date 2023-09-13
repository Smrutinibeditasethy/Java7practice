package com.method;

public class Smallest {
	public static void main(String[] args) {
		Smallest s1 = new Smallest();
		s1.Small();
	}
void Small() {
	int[] array= {5,3,5,2,5,43,7,77,99,101,9,45,50};
      int store;
      int i;
      int j;
      for (i=0; i<array.length; i++){
         for (j=i+1; j<array.length; j++){
             if (array[i]>array[j]){
                 store = array[j];
                 array[j]=array[i];
                 array[i]=store;
             }
         }
      }
      System.out.println("The smallest number in the array is= " +array[0]);

}
}
