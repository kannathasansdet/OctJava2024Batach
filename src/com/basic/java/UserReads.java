package com.basic.java;

import java.util.Scanner;

// Import the Scanner class

public class UserReads {
	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter username");

		String userName = myObj.nextLine();  // Read user input

		int age = myObj.nextInt();
		// Read user input
		System.out.println("Username is: " + userName);

		System.out.println("Username is: " + age);// Output user input
	}
}