package com.sunbeam;

abstract interface employee {
	double getsal();

	default double calcIncentives() {
		return 0.0;
	}

	static double calcTotalIncome(employee[] arr) {
		double total = 0.0;
		for (employee e : arr)
			total += e.getsal() + e.calcIncentives();
		return total;
	}

}

public class Manager implements employee {
	double salary;
	double da;

	public Manager() {

	}

	public Manager(double salary, double da) {
		super();
		this.salary = salary;
		this.da = da;
	}
	double getsalary() {
		return 0;
	}

	

	double calcInce() {
		return 0.2 * getsal();
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	class clerk implements employee {
		double salary;

		public clerk(double sal) {
			super();
			this.salary = salary ;
		}
		double get() {
			return salary;
		}

		public clerk() {

		}
		public clerk(Class<Double> class1) {
			// TODO Auto-generated constructor stub
		}
		@Override
		public double getsal() {
			// TODO Auto-generated method stub
			return 0;
		}
	}

	class labor implements employee {
		double hrs, rate;

		public labor(double hrs, double rate) {
			super();
			this.hrs = hrs;
			this.rate = rate;
		}

		public labor() {

		}

		public double getsal() {
			return hrs * rate;
		}

		double calcInce() {
			if (hrs > 300)
				return 0.05 * hrs * rate;
			return 0.0;
		}
	}

	public static void main(String[] args) {
		employee[] arr = new employee[3];
		arr[0] = new Manager();
		arr[1] = new clerk(double);
		arr[2] = new labor();
		double totalIncome = employee.calcTotalIncome(arr);
		System.out.println("total income");
	}

	@Override
	public double getsal() {
		// TODO Auto-generated method stub
		return 0;
	}

}
