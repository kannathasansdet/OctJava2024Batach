package com.basic.java.variable;

public class StaticVarExample {

	//Class variables are declared with the static keyword inside a class but outside any method. They are shared among all instances of the class.

	public static String myClassVar="class or static variable";

	public static void main(String args[]){
		StaticVarExample obj = new StaticVarExample();
		StaticVarExample obj2 = new StaticVarExample();
		StaticVarExample obj3 = new StaticVarExample();

		//All three will display "class or static variable"
		System.out.println(obj.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);

		//changing the value of static variable using obj2
		obj2.myClassVar = "Changed Text";

		//All three will display "Changed Text"
		System.out.println(obj.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);
	}
}