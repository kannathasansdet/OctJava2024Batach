package com.basic.java;

public class UnaryOperatorsExample {

	public static void main(String args[]){
		int num1=100;
		int num2=200;

		//minus(-) unary operator
		int inverseNum = -num1;

		int b = inverseNum-10; //(-100-10)

		System.out.println("The value of b: "+b);


		System.out.println("The value of InversNUM: "+inverseNum);


		//increment
		num1++;

		//decrement
		num2--;

		System.out.println("num1++ is: "+num1);
		System.out.println("num2-- is: "+num2);

		//num++ is equivalent to num=num+1; num–- is equivalent to num=num-1;

	}
}

