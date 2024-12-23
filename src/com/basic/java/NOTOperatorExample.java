package com.basic.java;

public class NOTOperatorExample {

	public static void main(String[] args) {

		int totalMarks = 34;

		//if total marks are not greater than 33 then
		//the student is fail else pass
		if(!(totalMarks > 33)){

			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
		}
	}
}
