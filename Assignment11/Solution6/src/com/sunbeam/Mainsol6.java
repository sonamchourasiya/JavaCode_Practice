package com.sunbeam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mainsol6 {
	static int menu() {
		int choice = 0;;
		Scanner sc =new Scanner(System.in);
		System.out.println("------------------------------------------------------");
		System.out.println("Menu");
		System.out.println("1.Accept");
		System.out.println("2.find in map ");
		System.out.println("enter choice");
		choice=sc.nextInt();
		
		return choice;
	}
	public static void main(String[] args) {
		int choice, index, count = 0;
		Student  key;
		String isbn;
        int rollno;
		Scanner sc = new Scanner(System.in);
		
		Map<Integer, Student> map = new HashMap<>();
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				Student s = new Student();
				s.acceptStudent(); // implement method in Main class
				map.put(s.getRollno(), s);
				break;
			case 2:
				
			 //  Scanner sc = new Scanner(System.in);//
		        System.out.print("Enter rollno: ");
		        int  Rollno = sc.nextInt();
		        Student Student = map.get(Rollno);
		       
		}
				break;
	}


	
	
		
	}}
	
	
