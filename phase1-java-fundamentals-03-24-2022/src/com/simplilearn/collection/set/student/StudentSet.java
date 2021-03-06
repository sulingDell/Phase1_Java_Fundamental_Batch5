package com.simplilearn.collection.set.student;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class StudentSet {

	public static void main(String[] args) {
		// TODO :: WAP to create a set of student and iterate over it.
		// create student objects
		Student student1 = new Student(1001, "johnsmith", "john.smith@gmail.com", 89.00);
		Student student2 = new Student(1002, "willsmith", "will.smith@gmail.com", 79.00);
		Student student3 = new Student(1003, "mikesmith", "mike.smith@gmail.com", 65.00);
		Student student4 = new Student(1004, "ariasmith", "aria.smith@gmail.com", 95.00);
		
		Set<Student> studSet = new LinkedHashSet<Student>();
		
		studSet.add(student1);
		studSet.add(student2);
		studSet.add(student3);
		studSet.add(student4);
		
		System.out.println(studSet);
		
		System.out.println("-----------");
		Iterator<Student> itr =studSet.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("-----------");
		for (Student student:studSet) {
			System.out.println(student.stuID);
			System.out.println(student.username);
			System.out.println(student.email);
			System.out.println(student.mark);
			System.out.println("------");
		}
		
	}

}
