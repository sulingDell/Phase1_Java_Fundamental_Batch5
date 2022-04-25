package com.simplilearn.multithreading;

public class OrganizationThread {

	public static void main(String[] args) {
		/// create a John thread
		
		John t1 = new John();
		t1.start();
		
		Mike t2 = new Mike();
		t2.start();
		
		Sam t3 = new Sam();
		t3.start(); 
		
		
		
		

	}
	
}
	class John extends Thread{
			public void run() {
		// thread processing logic
		System.out.println("John thread is running.");
	}
	}
	
	class Mike extends Thread{
		public void run() {
			System.out.println("Mike thread is running.");
			
		}
	}
		
	class Sam extends Thread{
		public void run() {
			System.out.println("Sam thread is running");
		}
	}
	


	
	

	


