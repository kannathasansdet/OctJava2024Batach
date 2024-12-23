package com.java.methods;

public class Addition {
 
// Declare two instance variables. 
   int a = 10; 
   int b = 20; 
   
  // System.out.println(a + b); // It is invalid syntax because we cannot write directly the business logic of the application inside the class. Therefore, we declare the method inside the class and write the logic inside the methods. 

// Declaration of an instance method. 
   void add()
   { 
  // Write logic of adding two number and print it on the console. 
     System.out.println(a + b); 
   }
public static void main(String[] args)
{
   Addition a = new Addition(); // Object creation.
   a.add(); // Calling method.
 }
}