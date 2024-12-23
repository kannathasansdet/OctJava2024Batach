package com.basic.java.contorlflow;

public class BreakExample {

	public static void main(String args[]){
		for (int var =100; var>=10; var --)
		{
			System.out.println("var: "+var);
			if (var==99)
			{
				break;
			}
		}
		System.out.println("Out of for-loop");
		
	}
}


//https://javaconceptoftheday.com/java-control-flow-statements-cheat-sheet/
