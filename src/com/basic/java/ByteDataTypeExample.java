package com.basic.java;

public class ByteDataTypeExample {

	public static void main(String[] args) {

		byte num = 127;
		
		short number = 32767;


		System.out.println(num);
	}
}


//This can hold whole number between -128 and 127. Mostly used to save memory and when you are certain that the numbers would be in the limit specified by byte data type.
//Default size of this data type: 1 byte.
//Default value: 0


//Try the same program by assigning value assigning 150 value to variable num, you would get type mismatch error because the value 150 is out of the range of byte data type. The range of byte as I mentioned above is -128 to 127.

//short

//This is greater than byte in terms of size and less than integer. Its range is -32,768 to 32767.
//Default size of this data type: 2 byte

//int

//Used when short is not large enough to hold the number, it has a wider range: -2,147,483,648 to 2,147,483,647
//Default size: 4 byte
//Default value: 0
