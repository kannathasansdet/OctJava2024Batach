package com.java.methods;

public class StaticMethodDemo {

   int a = 20; // Instance variable. 

// Declare static variables. 
   static int c = 40; 
   static int d = 50; 

// Instance method.
   void m1() 
   { 
  // We can call directly static variables from instance area (same area) without using class name. 
     System.out.println("Third number c = " +c); 
     System.out.println("Fourth number c = " +d); 
   } 
// Static method
   static void multiply() 
   { 
   // Static area. 
   // We cannot call directly instance members/non-static members in the static area. 
   // System.out.println(x); // Invalid syntax. 
      
      int mNum = c * d; 
      System.out.println("Multiplication: " +mNum); 
   } 

public static void main(String[] args) 
{ 
// Call static method using class name. 
	StaticMethodDemo.multiply(); 
 } 
}