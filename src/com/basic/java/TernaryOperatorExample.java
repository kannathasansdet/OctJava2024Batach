package com.basic.java;

public class TernaryOperatorExample {
	public static void main(String args[]) {
		
		int num1, num2;

		num1 = 26;
		
		String result;
		
		result = (num1==25) ? "PASS" : "FAIL";
			
		System.out.println("The result is "+result);

		/* num1 is not equal to 10 that's why
		 * the second value after colon is assigned
		 * to the variable num2
		 */
		num2 = (num1 == 10) ? 100: 200;
		System.out.println( "num2: "+num2);

		/*
		 * status = (num1 == 10) ? "Fail": "Pass"; System.out.println(
		 * "Status: "+status);
		 */
		/* num1 is equal to 25 that's why
		 * the first value is assigned
		 * to the variable num2
		 */
		num2 = (num1 == 25) ? 100: 200;
		System.out.println( "num2: "+num2);

		/*
		 * int age=10; status = (age > 18) ? "eligible": "not eligible";
		 * System.out.println( "Status: "+status);
		 */


	}
}