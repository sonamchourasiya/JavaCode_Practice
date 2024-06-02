package com.org.sunbeam;

import java.util.Scanner;

public class Salaryemployee extends Employee {
	private int weeklySalary;

	public Salaryemployee() {
		
		super();
	}

	public Salaryemployee(int weeklySalary) {
		super();
		this.weeklySalary = weeklySalary;
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		super.acceptData();
		System.out.println("enter weeklySalary");
		this.weeklySalary = sc.nextInt();
	}

	public void displayData() {
		super.displayData();
		System.out.println("weeklySalary=" + this.weeklySalary);
	}

	@Override
	public String toString() {
		return "Salaryemployee [weeklySalary=" + weeklySalary + "]";
	}
      public void calculate()
      {
    	  System.out.println("total salary="+7 * weeklySalary);
    	  
      }
}
