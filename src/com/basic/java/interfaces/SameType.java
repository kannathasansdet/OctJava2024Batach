package com.basic.java.interfaces;

public class SameType {
}

class SuperClass {

}

class SubClass extends SuperClass {

}

abstract class Abstract {
	abstract SuperClass method1();
}

interface Interface {
	SuperClass method2();
}

class ConcreteClass extends Abstract implements Interface {

	public SubClass method2() {
		return null;
	}

	SubClass method1() {
		return null;
	}

}
