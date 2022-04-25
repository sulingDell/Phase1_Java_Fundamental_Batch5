package com.simplilearn.arrays;

import java.util.Arrays;

public class StudentArray {
	
	// TODO :: WAP for collection of students objects as an array.
	// id , name, marks, status, email

	public static void main(String[] args) {
		
		
		// create multiple account objects
		Student student1 = new Student(1001, "johnsmith", "john.smith@gmail.com", 89.00);
		Student student2 = new Student(1002, "willsmith", "will.smith@gmail.com", 79.00);
		Student student3 = new Student(1003, "mikesmith", "mike.smith@gmail.com", 65.00);
		Student student4 = new Student(1004, "ariasmith", "aria.smith@gmail.com", 95.00);

				// create account array
			Student[] students = new Student[5];

				students[0] = student1;
				students[1] = student2;
				students[2] = student3;
				students[3] = student4;

				// print all accounts data
				System.out.println(Arrays.toString(students));

				System.out.println("----------------");
				for (int index = 0; index < students.length; index++) {
					if (students[index] != null) {
						// System.out.println(accounts[index]);
						System.out.println(students[index].stuID);
						System.out.println(students[index].username);
						System.out.println(students[index].mark);
						System.out.println(students[index].email);
						System.out.println("-------------");
					}
				}

			}

	}


