package com.javabasicopenLabBook;

public class LargestNumber {
	public static void main(String[] args) {
		
		double d1 = 5.5; double d2 = 6.5, d3 = -7.2;
		
		if (d1>=d2 && d1>=d3) {
			System.out.println("d1 is highest" +d1);
		}
		else if (d2>=d1 && d2>=d3) {
			System.out.println("d2 is highest" +d2);
			
		}
		else {
			System.out.println("d3 is highest "+d3);
		}
	}

}
