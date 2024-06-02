package com.org.sunbeam;
import java.util.Scanner;

abstract public class Employee {
	private String firstname;
	private String lastname;
	int  ssnno;
	abstract public void calculate();
	
	public Employee()
	{
		
	}
	
	public Employee(String firstname, String lastname, int ssnno) {
	
		this.firstname = firstname;
		this.lastname = lastname;
		this.ssnno = ssnno;
		
	}

	public void acceptData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first name");
		this.firstname= sc.next();
		System.out.println("enter last name");
		this.lastname=sc.next();
		System.out.println("enter ssno");
		this.ssnno= sc.nextInt();
		
	}
	public void displayData()
	{
		System.out.println("first name="+this.firstname);
		System.out.println("last name="+this.lastname);
		System.out.println("ssnno="+this.ssnno);

		
	}

	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", ssnno=" + ssnno + "]";
	}
	
	public void calculate()
	{
		
	}

}
