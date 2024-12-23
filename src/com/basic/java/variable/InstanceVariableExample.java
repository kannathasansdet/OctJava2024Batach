package com.basic.java.variable;

public class InstanceVariableExample {

	//Instance variables are declared inside a class but outside any method. They are unique to each class instance, meaning each object created from the class has its own copy of these variables.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();

		emp1.id = 101;
		emp1.empName = "John";
		emp1.age = 30;

		emp2.id = 102;
		emp2.empName = "Doe";
		emp2.age = 25;

		System.out.println(emp1.empName + " is " + emp1.age + " years old.");
		System.out.println(emp2.empName + " is " + emp2.age + " years old.");
	}
}


