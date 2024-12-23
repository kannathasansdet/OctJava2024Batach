package com.java.methods;

public class UserDefinedMethodInstanceDemo {
	
	// Creating an instance method.	
	void msg() {
		System.out.println("Instance method");
	}
	public static void main(String[] args) {
		// Creating an object of class.
		UserDefinedMethodInstanceDemo t = new UserDefinedMethodInstanceDemo();

		// Call the method using reference variable t.
		t.msg();
	}
}

