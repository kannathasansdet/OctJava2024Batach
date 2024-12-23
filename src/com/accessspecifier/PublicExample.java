package com.accessspecifier;

public class PublicExample {
   
	// The public access modifier makes a class, method, or variable accessible from any other class. There are no restrictions on its visibility.

	public int data = 10;

    public void display() {
        System.out.println("Public method");
    }

    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        System.out.println(obj.data); // Accessible
        obj.display(); // Accessible
    }
}