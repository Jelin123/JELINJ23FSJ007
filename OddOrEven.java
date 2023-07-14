package com.javabasicopenLabBook;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		
		int num;
		
		System.out.println("Enter a number:");
		
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		
		if (num%2==0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is odd");
		}
		
	}
	

}
