package com.simplilearn.arrays;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// array syntax
		int[]numbers=new int [5];
		
		//add value in numbers array
		numbers[0]=10;
		numbers[1]=-20;
		numbers[2]=30;
		numbers[3]=-40;
		numbers[4]=50;
		//numbers[5]=60; //ArrayIndexOutOfBoundException
		
		//print all arrays
		System.out.println(Arrays.toString(numbers));
		
		
		//print one array elements
		System.out.println ("index 2 element is" +numbers[1]);
		
		//print array using for loop
		System.out.println(".......................");
		
		for (int index = 0; index < numbers.length; index ++) {
			
			System.out.println("index " + index + " element " + numbers[index] );
			
		}
		// for loop to add elements in an array
		System.out.println(".......................");
		float[] amount = new float[10];
		
		for ( int index =0; index < amount.length; index ++) {
			
			amount[index]=10*index + 1; 
			
		}
		
		System.out.println(Arrays.toString(amount));
	}

}
