package com.javabasicopenLabBook;

public class SwapTwoNumbersPractice {
	public static void main(String[] args) {
		
		float f1 = 6.78f, f2 = 8.98f;
		
		System.out.println("----Before Swap---");
		
		System.out.println(" First Number ="+f1);
		
		System.out.println(" Second Number ="+f2 );
		
		float temperoary = f1;
		f1 = f2;
		f2 = temperoary;
		
		System.out.println("---After Swap----");
		System.out.println("First Number "+f1 );
		System.out.println("Second Number "+f2);
		
	
		
	}

}
