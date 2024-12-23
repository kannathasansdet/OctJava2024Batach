package com.basic.java.constractor;

public class ThisKeyWord {

	String myName;
	
	ThisKeyWord()
	{
		System.out.println("Hello");
	}
	
	void setName(String myname) {
		
		this.myName = myname;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeyWord thisKeyWord = new ThisKeyWord();
		thisKeyWord.setName("Kanna");
		System.out.println(thisKeyWord.myName);
		
	}

}
