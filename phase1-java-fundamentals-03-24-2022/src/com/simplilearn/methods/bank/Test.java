package com.simplilearn.methods.bank;

public class Test {

	public static void main(String[] args) {
		
		//create an account object
		Account account = new Account(131834567, 10000, "Iron Man", "ironman@gmail.com");
		
		//create a bank operations object
		BankOperations operation = new BankOperations();
		
		System.out.println("Welcome to the bank: "+BankOperations.bankName +" ");
		
		System.out.println("The user balance is " +operation.showBalance(account));
		
		System.out.println("The user balance after deposit is " +operation.depositAmount(account, 1000));
		
		System.out.println("The user balance after withdraw is " +operation.withdrawAmount(account, 100));
		
	}

}
