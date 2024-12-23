package com.basic.java;

public class AssignmentOperatorsExample {

	public static void main(String args[]) {
		
		int num1 = 10, num2;
	
		num2 = num1;
		
		System.out.println("= Output: "+num2);
		
		num2 += num1; // num2= num1+num2
		System.out.println("+= Output: "+num2);
		num2 -= num1; // num2 = num1-num2
		System.out.println("-= Output: "+num2);
		num2 *= num1; // num2 = num1*num2
		System.out.println("*= Output: "+num2);
		num2 /= num1;
		System.out.println("/= Output: "+num2);
		num2 %= num1;
		System.out.println("%= Output: "+num2);
	}
}


