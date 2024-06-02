package com.org.sunbeam;

import java.util.Scanner;

public class Hourlyemployee extends Employee {
	private int wage;
	private int hours;

	public Hourlyemployee() {
		super();
	}

	public Hourlyemployee(int wage, int hours) {
		super();
		this.wage = wage;
		this.hours = hours;
	}

	public void acceptData() {
		super.acceptData();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter wage");
		wage = sc.nextInt();
		System.out.println("enter hours=");
		hours = sc.nextInt();

	}

	public void displayData() {
		super.displayData();
		System.out.println("wages=" + this.wage);
		System.out.println("hours=" + this.hours);

	}

	public void calculate()
	 {
		if(hours <= 40)
		{
	System.out.println(this.wage*this.hours);
		}
	else if (hours > 40)
	{
		System.out.println(40 + this.wage+(this.hours-40)*this.wage*1.5);
		
	}
	 

}

	@Override
	public String toString() {
		return "Hourlyemployee [wage=" + wage + ", hours=" + hours + "]";
	}
}