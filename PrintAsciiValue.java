package com.javabasicopenLabBook;

public class PrintAsciiValue {
	
	public static void main(String[] args) {
		
		char ch = 'h';
		int ascii = ch;
		//cast char to int
		
		int castAscii= (int)ch;
		
		System.out.println("The ASCII value of " + ch+ "is " +ascii);
		System.out.println(" The ASCII value of "+ ch+ "is "+castAscii);
		
		
	}

}
