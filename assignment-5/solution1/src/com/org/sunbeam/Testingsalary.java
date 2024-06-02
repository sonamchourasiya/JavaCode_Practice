
package com.org.sunbeam;

public class Testingsalary {

	public static void main(String[] args) {
		Employee employe2= new Commisionemployee();
		employe2.acceptData();
		employe2.calculate();
		employe2.displayData();
		
		Employee employee= new Salaryemployee();
		employee.acceptData();
		employee.displayData();
		employee.calculate();
		
		Employee employe1= new Hourlyemployee();
		employe1.acceptData();
		employe1.calculate();
		employe1.displayData();
	   
	}

}
