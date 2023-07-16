package com.employee;

public class SumOfDigitsUsingRecursion {
static int[] arr= {12,1,2,13,5};
				// 0  1 2  3 4
	public static void main(String [] args) {
		
		int value=sumOfDigits(arr.length-1);
	System.out.println(value);	
	}

	private static int sumOfDigits(int n) {
		if(n==0) 
		return	arr[n];
		
		return arr[n]+sumOfDigits(n-1);
		
	}
		
	
	
}
