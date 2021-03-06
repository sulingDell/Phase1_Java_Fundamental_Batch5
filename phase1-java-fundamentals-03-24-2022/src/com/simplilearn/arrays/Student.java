package com.simplilearn.arrays;

	// POJO 
	public class Student {

		public int stuID;
		public String username;
		public String email;
		public double mark;

		// non parameterized constructor
		public Student() {

		}

		// parameterized constructor
		public Student(int stuID, String username, String email, double mark) {
			this.stuID = stuID;
			this.username = username;
			this.email = email;
			this.mark = mark; 
		}
		
		//public Account(long accNo, double balance) {
		//	this.accNo = accNo;
		//	this.balance  = balance;
		//}

		@Override
		public String toString() {
			//return "Student [stuID=" + stuID + ", balance=" + balance + ", username=" + username + ", email=" + email + "]";
			return "Student [stuID=" + stuID + ", username=" + username + ", email=" + email + "mark=" + mark + "]";
					}
		
	}

