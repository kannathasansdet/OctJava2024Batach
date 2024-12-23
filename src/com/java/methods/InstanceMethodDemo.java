package com.java.methods;

public class InstanceMethodDemo {
 
// Instance area/non-static area.
// Declaration of instance variables. 
    int a = 10; 
    int b = 20; 
// Declaration of instance method. 
   void add() 
   { 
   // Instance area/Non-static area. 
   // Within instance area, we can directly call the instance variables from instance area (same area) without using object reference variable. 
      System.out.println("First number a = " +a); 
      System.out.println("Second number b = " +b); 
 
   // logic of addition. 
      int x = a + b; 
      System.out.println("Addition of two numbers x = " +x); // directly called. 
    } 
public static void main(String[] args) 
{ 
 // Static area. 
 // Create an object of the class. 
	InstanceMethodDemo ad = new InstanceMethodDemo(); 

 // Since we are calling an instance method from instance area within the static area. 
 // So, we will use object reference variable ad to call it. 
    ad.add(); 
  } 
}
