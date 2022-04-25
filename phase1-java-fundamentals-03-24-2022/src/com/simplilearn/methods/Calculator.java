package com.simplilearn.methods;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 400;
		int y = 100;
		
		//create operation class object
		
		Operations operations = new Operations();
		
		float result1 = operations.add(x, y);
		System.out.println("The addition is " +result1);
		
		short result2 = operations.sub(x, y);
		System.out.println("The subtraction is " +result2);
		
		float result3 = operations.mul(x, y);
		System.out.println("The multiplication is " +result3);
		
		double result4 = operations.div(x, y);
		System.out.println("The division is " +result4);
		
		double result5 = operations.avg(x, y);
		System.out.println("The average is " +result5);
		

	}
}

	
	class Operations {
		
		//addition
		public float add(int num1 , int num2) {
		return num1+num2;
		}
				
		//subtraction
		public short sub(int num1 , int num2) {
			return (short) (num1-num2);
		}
		
		//multiplication
		public float mul(int num1, int num2) {
			return num1 * num2;
		}
		
		//division
		public double div(int num1, int num2) {
			return num1/num2;
		}
		
		//average
		public double avg(int num1, int num2) {
			return (num1 + num2)/ 2;
		}
	}

