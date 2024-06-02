package solution1;
   import java.util.Scanner;

	public abstract class manager extends Employee {
		private int weeklySalary;

		public manager() {
			
			super();
		}

		public manager(int weeklySalary) {
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

		public int getWeeklySalary() {
			return weeklySalary;
		}

		public void setWeeklySalary(int weeklySalary) {
			this.weeklySalary = weeklySalary;
		}

		@Override
		public String toString() {
			return "Salaryemployee [weeklySalary=" + weeklySalary + "]";
		}
	      public void  getcalculatesalary()
	      {
	    	  System.out.println("total salary="+7 * weeklySalary);
	    	  
	      }
	}

	

