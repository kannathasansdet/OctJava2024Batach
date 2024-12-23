package com.basic.java;

public class NarrowingTypeCastingExample {

	public static void main(String[] args) {
		double d = 7.5590d;
		float f = 1.25f;

		int i = (int) d;
		int i2 = (int) f;

		System.out.println("Double Value: "+d); // Prints 4.55
		System.out.println("Double to int: "+i); // Prints 4
		System.out.println("Float value: "+f); // Prints 1.25
		System.out.println("Float to int: "+i2); // Prints 1
	}
}
