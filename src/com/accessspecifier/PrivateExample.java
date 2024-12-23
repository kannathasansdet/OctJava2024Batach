package com.accessspecifier;

public class PrivateExample {
	
	//The private access modifier restricts the access of a class, method, or variable to within the same class only. It is not accessible from any other class.


	private int data = 10;

	private void display() {
		System.out.println("Private method");
	}

	public static void main(String[] args) {
		PrivateExample obj = new PrivateExample();
		System.out.println(obj.data); // Accessible
		obj.display(); // Accessible
	}
}