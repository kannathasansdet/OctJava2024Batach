package com.java.methods;

public class MethodDemo {

	public static int AddtionOfTwoNumber(int a,int b) {
		int c = a+b;
		
		return c;
	}

	public static int SubOfTwoNumber(int a,int b) {
		int c = a-b;

		return c;

	}

	public static void main(String[] args) {

		int abc = MethodDemo.AddtionOfTwoNumber(10,10);
		System.out.println(abc);
		int bcd = MethodDemo.SubOfTwoNumber(10,90);
		System.out.println(bcd);


	}

}
