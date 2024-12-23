package com.basic.java.interfaces;

public class InterfaceExamples {
	public static void main(String[] args) {
		Flyable flyable = new Bird();
		flyable.fly();
		
		Bird bird = new Bird();
		
		
		Aeroplane Aeroplane = new Aeroplane();
		Aeroplane.fly();
	}
}
