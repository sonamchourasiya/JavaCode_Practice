package solution1;

import java.util.Scanner;

	
		public class salesman extends Employee {
			int grosssales;
			int commisionrate;
			int totalSalary;

			salesman() {
				super();
			}

			public salesman(int grosssales, int commisionrate) {
				super();
				this.grosssales = grosssales;
				this.commisionrate = commisionrate;
			}

			public void acceptData() {
				Scanner sc = new Scanner(System.in);

				super.acceptData();
				System.out.println("enter grosssales");
				grosssales = sc.nextInt();
				System.out.println("enter commisionrate");
				commisionrate = sc.nextInt();

			}

			public void displaysalesman() {
				super.displayData();
				System.out.println("grosssales=" + this.grosssales);
				System.out.println("commisionrate=" + this.commisionrate);

			}

			public void calculate() {

				totalSalary = (this.grosssales * this.commisionrate);
				System.out.println("total commision :" + totalSalary);
			}

			public int getGrosssales() {
				return grosssales;
			}

			public void setGrosssales(int grosssales) {
				this.grosssales = grosssales;
			}

			public int getCommisionrate() {
				return commisionrate;
			}

			public void setCommisionrate(int commisionrate) {
				this.commisionrate = commisionrate;
			}

			@Override
			public String toString() {
				return "Commisionemployee [grosssales=" + grosssales + ", commisionrate=" + commisionrate + ", toString()="
						+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
			}

		}

