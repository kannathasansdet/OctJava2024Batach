package com.basic.java.oops.polymorphisum;


//Java Program to Demonstrate
//Method Overloading

//Parent Class
public class OverLoading {

 // Method Declared
 public void func(){
     System.out.println("Parent Method func");
 }

 // Method Overloading
 public void func(int a){
     System.out.println("Parent Method func " + a);
 }

 public static void main(String args[]){
	 OverLoading obj1 = new OverLoading();
     obj1.func();
     obj1.func(5);
 }
}