package com.basic.java;

public class LearningMethod{

	public void replace() {
		int a = 1;
		int b = 2;
		System.out.println(a + " " + b); // 1 2
		int c = a;
		a = b;
		b = c;
		System.out.println(a + " " + b); // 2 1

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearningMethod obj = new LearningMethod();
		obj.replace();



	}}


