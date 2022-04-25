package com.simplilearn.methods.bank;

public class BankOperations {
	
	public static String bankName = "Iron Bank";
	
	//show balance
	public double showBalance(Account account) {
		if(account != null) {
			return account.balance;
		}
		return 0;
	}
	
	//deposit amount
	public double depositAmount(Account account, double amount) {
		if (amount > 0) {
			account.balance+=amount; //acount.balance = account.balance + amount;
			return account.balance;
		}else
		{System.out.println ("Invalid deposit amount");
		return 0;
		}
	}
	
	//withdraw amount
	public double withdrawAmount(Account account, double amount) {
		if (amount > 0) {
			account.balance-=amount; //acount.balance = account.balance + amount;
			return account.balance;
		}else
		{System.out.println ("Invalid withdraw amount");
		return 0;
		}
	}

	

}
