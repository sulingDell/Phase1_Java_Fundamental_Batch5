package com.simplilearn.methods.bank;

//POJO
public class Account {

	public long acctNo;
	public double balance;
	public String username;
	public String email;

// no parameterized constructors 
	public Account () {
		
	}
	
	//parameterized constructors
	public Account (long acctNo, double balance, String username, String email ) {
		this.acctNo = acctNo;
		this.balance = balance;
		this.username = username;
		this.email = email;
	}
	
}
