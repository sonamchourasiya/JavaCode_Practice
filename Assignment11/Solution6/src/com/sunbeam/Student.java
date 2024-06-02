package com.sunbeam;

import java.util.Scanner;

public class Student {
	private int rollno;
	private String name;
	Student()
	{
		
	}
	public void acceptStudent()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rollno");
		this.rollno=sc.nextInt();
		System.out.println("enter name");
		this.name=sc.next();
	}
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	

}
