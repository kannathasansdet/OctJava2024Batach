package weekend.tasks;

// This program perform simple Addition of two integers
// By - Nitish Tiwari

import java.util.Scanner;
public class sum{
	public static void main(String args[])
	{
	int a,b,sum;
	System.out.println("Enter the two nos to add");
	Scanner in = new Scanner(System.in);
	a=in.nextInt();
	b=in.nextInt();
	sum=a+b;
	System.out.println("Sum of the entered nos is = " +sum);
	}
}