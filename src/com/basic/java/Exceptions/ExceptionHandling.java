package com.basic.java.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan = new Scanner(System.in);
	
	try {
		int a = scan.nextInt();
		int b = 10/2;	
		System.out.println(b);

	}
	
	catch(InputMismatchException e) {

		System.out.println(e);
		
	}
	catch(ArithmeticException e) {

		System.out.println(e);
		
	}
	
	finally {
		System.out.println("The program executed with finally block");

	}
	
	System.out.println("The program Ended");

	}

}
