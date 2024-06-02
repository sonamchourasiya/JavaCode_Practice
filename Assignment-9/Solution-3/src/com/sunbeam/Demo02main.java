package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class Demo02main {
static int menu() {
		int choice;
		System.out.println("------------------------------------------------------");
		System.out.println("Menu");
		System.out.println("1. Add new book in list");
		System.out.println("2. Display all books in forward order");
		System.out.println("3. Delete book at given index");
		System.out.println("4. Check if book with given isbn is in list or not");
		System.out.println("5. Delete all books in list");
		System.out.println("6. Display number of books in list");
		System.out.println("7. Sort all books by price in desc order");
		System.out.print("Enter your choice = ");
		choice = new Scanner(System.in).nextInt();
		System.out.println("------------------------------------------------------");

		return choice;
	}



	public static void main(String[] args) {
		Student arr[] = new Student[5];
		arr[0] = new Student(3, "gouri", "sagar", 88.8);
		arr[1] = new Student(1, "surya", "bhopal", 88.8);
		arr[2] = new Student(4, "Prashant", "bhopal", 60.0);
		arr[3] = new Student(5, "Prashant", "pune", 60.0);
		arr[4] = new Student(2, "Nitin", "punam ", 70.0);
		System.out.println("Before Sort: ");
		for (Student e : arr)
			System.out.println(e);

		Arrays.sort(arr);

		System.out.println("After Sort by Empno: ");
		for (Student e : arr)
			System.out.println(e);

		class studentnamemarks_Comparator implements Comparator<Student> {
			@Override
			public int compare(Student e1, Student e2) {
				int diff = e2.getName().compareTo(e1.getName());
				if (diff == 0)
					diff = Double.compare(e1.getMarks(), e2.getMarks());
				   if(diff==0)
					   
				diff = e2.getCity().compareTo(e1.getName());
				if (diff == 0)
					diff = e1.getCity().compareTo(e2.getName());
				if (diff == 0)
					diff = - Double.compare(e1.getMarks(), e2.getMarks());
					return diff;
				}
			}
			
	
		studentnamemarks_Comparator marksdescComparator = new studentnamemarks_Comparator();
			Arrays.sort(arr, marksdescComparator);
			System.out.println("After Sort by marks Desc: ");
			for (Student e : arr)
				System.out.println(e);
			
		}	
			
		
	

}
}
}
