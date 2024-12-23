package com.basic.java.oops.inheritance;

public class Maths extends Numbers{
	
	public int c;
	public int d;
	
	public void div() {
		System.out.println(c/d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Numbers num = new Numbers();
		Maths maths = new Maths();
		
		num.a = 10;
		num.b = 40;
		num.sum();
		num.sub();
		
		maths.c=10;
		maths.d=2;
		
		maths.div();
	}

}
