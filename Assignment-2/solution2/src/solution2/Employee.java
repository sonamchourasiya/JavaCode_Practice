package solution2;

import java.util.Scanner;



public class Employee {
	
        String firstName;
        String LastName;
        double montholySalary;
        double  raise;
        
        public Employee()
        {
        	
        }
        
        
		public Employee(String firstName, String lastName, double montholySalary) {
			super();
			this.firstName = firstName;
			LastName = lastName;
			this.montholySalary = montholySalary;
			
			
		}
		public double getRaise() {
			return raise;
		}
		public void setRaise(double raise) {
			this.raise = raise;
		}
		public Employee(double raise) {
			super();
			this.raise = raise;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return LastName;
		}
		public void setLastName(String lastName) {
			LastName = lastName;
		}
		public double getMontholySalary() {
			return montholySalary;
		}
		public void setMontholySalary(double montholySalary) {
			this.montholySalary = montholySalary;
		}
		
        void acceptData()
        {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("enter first name=");
        	firstName=sc.next();
        	System.out.println("enter last name=");
        	LastName=sc.next();
        	System.out.println("enter montholySalary=");
        	montholySalary=sc.nextInt();
        	if (montholySalary<0)
        	{
        		montholySalary=0;
        		
        		System.out.println("montholySalary="+montholySalary);
        	}
             System.out.println("raise=");
             raise=sc.nextDouble();
        }
            
        
        
             void displayData()
             {
            	 System.out.println("firstname="+firstName);
            	 System.out.println("lastname="+LastName);
            	 System.out.println("yearlySalary="+montholySalary*12);
             }
        
            void displayRaise()
            {
            	System.out.println("yearlySalary="+montholySalary*12*1.1);
            }
            
        
        
        
	

}
