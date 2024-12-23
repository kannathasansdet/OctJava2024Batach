package com.basic.java.variable;

public class StaticVariableExample {

	//Consider there are 100 students in a college named "ABC", each student has their own unique roll number and name but the college remains the same among all the 100 students. The college field is declared as static so it can occupy memory only once.

	public static void main(String[] args) {
		Student s1 = new Student(101, "John");
		Student s2 = new Student(102, "Doe");

		System.out.println(s1.name + " studies at " + Student.college);
		System.out.println(s2.name + " studies at " + Student.college);
	}
}

