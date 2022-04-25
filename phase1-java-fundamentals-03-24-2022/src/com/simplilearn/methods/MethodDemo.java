package com.simplilearn.methods;

public class MethodDemo {

	public static void main(String[] args) {
			//method calling
		MethodDemo demo = new MethodDemo ();
		
		demo.showMessage();
		
		demo.displayAuthor("Will Smith");
		
		demo.ageCalculater(1996);
		
		int resultAge =demo.ageCalculater2(1982);
		System.out.println(resultAge);
		
		demo.retirementCalculator("John", 1971);
		demo.retirementCalculator("Apple", 1999);
		
		
	}

	//user definaed method
	//non parameterized method
	public void showMessage () {
		System.out.println("Welcome to Java methods");
	}
	
	//parameterized method
	public void displayAuthor (String author) {
		System.out.println("The Author is:" +author);
	}
	
	//age calculator
	public void ageCalculater (int yearOfBirth) {
		int currentYear = 2022;
		int age = currentYear - yearOfBirth; 
		System.out.println("The user age is:" +age);
		
	}
	
	//Return value
	//age calculator2
		public int ageCalculater2 (int yearOfBirth) {
			int currentYear = 2022;
			int age = currentYear - yearOfBirth; 
			System.out.println("The user age is:" +age);
			
			return age;
}
		
		//retirement calculator
		public void retirementCalculator(String username, int yearOfBirth) {
			int expectedAge = 60; 
			int actualAge = ageCalculater2 (yearOfBirth);
			int remainingYears = expectedAge - actualAge;
			
			if ( actualAge >= expectedAge) {
				System.out.println("Hi, '"+username+"' you have reach retired age");
			}else {
					System.out.println("Hi, '"+username+"' you have " +remainingYears+ " years to reach retired age");
				
			}
		}
}
