package com.basic.java.contorlflow;

public class NestedForLoopExample {

	public static void main(String[] args) {
		//outer loop
		for(int i=1;i<=6;i++){
			//inner loop
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			// this is to move the cursor to new line
			// to print the next row of the pattern
			System.out.println();
		}
	}
}