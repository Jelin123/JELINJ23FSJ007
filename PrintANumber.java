package com.javabasicopenLabBook;

import java.util.Scanner;

public class PrintANumber {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	    System.out.println("Enter A Number");
	    
	    int number = scan.nextInt();
	    
	    System.out.println("You have entered "+number);
	}

}
