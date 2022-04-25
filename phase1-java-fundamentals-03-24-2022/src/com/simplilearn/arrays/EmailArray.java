package com.simplilearn.arrays;

import java.util.Arrays;

public class EmailArray {

	public static void main(String[] args) {
		
		//create an empty string
		String emails[]=new String [5];
		
		//insert email data into an array
		emails[0]="john.smith@gmail.com";
		emails[1]="will.smith@gmail.com";
		emails[2]="aria.smith@gmail.com";
		emails[3]="mike.smith@gmail.com";
		
		System.out.println(Arrays.toString(emails));
		
		//access data from arrays
		System.out.println("email at index 2 is " +emails[2]);
		
		//for loop
		for (int index=0; index<emails.length;index++) {
			System.out.println("index " +index+ " email: " +emails[index]);
		}
		
		//create an array with default values
		String name[]= {"john", "will","aria","mike","david"};
		System.out.println(Arrays.toString(name));
		
		
			
	}

}
