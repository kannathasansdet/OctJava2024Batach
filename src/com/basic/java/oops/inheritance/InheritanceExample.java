package com.basic.java.oops.inheritance;

/***********************************************************************************************************************************
1) The process by which one class acquires the properties (data members) and functionalities (methods) of another class is called inheritance.
2) The aim of inheritance is to provide the re-usability of code so that a class has to write only the unique features and rest of the common properties and functionalities can be extended from the another class.
3) The class that extends the features of another class is known as child class, sub class or derived class.
4) The class whose properties and functionalities are used (inherited) by another class is known as parent class, super class or Base class. 
***********************************************************************************************************************************/


class Teacher
{
	public static String college = "ABC College";
	static String profession = "Teaching"; // protected variable
	private static String code; // private variable can only be accessed inside the class
	
	static void duty()
	{
		System.out.println("This is duty of Parent Class");
	}
	
	// set the value to the protected variable
	static void setCode(String pCode)
	{
		code = pCode;
	}
	
	// get the value of the protected variable
	static String getCode()
	{
		return code;
	}
}

public class InheritanceExample extends Teacher {

	public static void main(String[] args) {

		String name = "John";
		String department = "Physics";
		
		System.out.println("Name = " + name);
		System.out.println("Profession = " + profession);
		System.out.println("Department = " + department);
		System.out.println("College = " + college);
		
		duty();

		// super.duty();
		// The keyword super() can not be used in static context.
		// To access the method of Parent Class, remove static keyword from the method in Parent Class.
		
		System.out.println();
		setCode("abc123");
		System.out.println("Code = " + getCode());
		
	}
	
	// Here duty() method of Parent Class is overridden. This is called Method Overriding.
	static void duty()
	{
		System.out.println("This is duty of Child Class");
	}

}

/********************
Types of Inheritance:
1) Single Inheritance: Class B extends Class A.
2) Multilevel Inheritance: Class C extends Class B. Class B extends Class A.
3) Hierarchical Inheritance: Class B, Class C and Class D extends Class A.
4) Multiple Inheritance: Class C extends Class A and Class B. This is not supported in Java.
*********************/