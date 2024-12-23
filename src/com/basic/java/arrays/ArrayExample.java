package com.basic.java.arrays;

public class ArrayExample {
	public static void main(String args[]){
		//array declaration, instantiation and initialization
		int number[] = {11, 22, 33, 44, 55, 66};

		int[] a = new int[4];

		
		a[0]=1;
		a[1]=2;
		a[2]=3;
		
		int abc = a.length;
		
		for (int j=0;j<number.length;j++) {
			
			System.out.println(number[j]);
			
		}
		
		
		//print array elements
		//length property return the size of the array
		for(int i1=0;i1<abc;i1++) {
			System.out.println("a["+i1+"]: "+a[i1]);
		}


		//print array elements
		//length property return the size of the array
		for(int i=0;i<number.length;i++) {
			
			System.out.println("number["+i+"]: "+number[i]);
		}
	}
}