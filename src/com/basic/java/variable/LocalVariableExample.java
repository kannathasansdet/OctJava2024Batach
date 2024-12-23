package com.basic.java.variable;

public class LocalVariableExample {

	//Local variables are declared inside a method, constructor, or block. They are created when the method, constructor, or block is entered and destroyed when it is exited. Local variables are only accessible within the method, constructor, or block where they are declared.

	public void calculateSum() {
		int sum = 0; // local variable
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("Sum of first 10 numbers: " + sum);
	}

	public static void main(String[] args) {
		LocalVariableExample example = new LocalVariableExample();
		example.calculateSum();
	}
}