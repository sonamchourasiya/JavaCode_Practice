package solution1;

import java.util.Scanner;

abstract public class Employee {
			private String firstname;
			private String lastname;
			int  ssnno;
			double salary;
			abstract public void calculate();
			
			public Employee()
			{
				
			}
			
			public Employee(String firstname, String lastname, int ssnno,double salary) {
			
				this.firstname = firstname;
				this.lastname = lastname;
				this.ssnno = ssnno;
				this.salary= salary;
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
				System.out.println("enter salary");
				this.salary= sc.nextDouble();
				
			}
			public void displayData()
			{
				System.out.println("first name="+this.firstname);
				System.out.println("last name="+this.lastname);
				System.out.println("ssnno="+this.ssnno);
				System.out.println("salary="+this.salary);
				
			}

			@Override
			public String toString() {
				return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", ssnno=" + ssnno + ",salary="+ salary+"]";
			}

	      public void calculatesalary()
	      {
	    	  double calculate;
			System.out.println("calculatesalary="+679.3);
			return;
	      }
			
			

		

 
	

	}


