package com.sunbeam;

import java.util.Scanner;

@FunctionalInterface
interface Arithmetic
{
	
  double calculate(double d1,double d2);

}
public class Que3 {
	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calculate(num1, num2);
		System.out.println("Result: "+result);
		}
	
		 static int menu1()
		 {
			Scanner sc=new Scanner(System.in) ;
			int choice;
			double d1;
			double d2;			
			System.out.println("1.Enter number 1");
			System.out.println("2.enter number 2");
			System.out.println("3.addition number");
			System.out.println("4.subtraction number");
			System.out.println("3.multiplication number");
	        System.out.println("enter your choice");
	        choice=sc.nextInt();
	        return choice;
			
		 }
	
	        public static  void main(String[] args) {
	    		double num1	;
	    		Scanner sc=new Scanner(System.in);
	    		double num2;
	    		
	    		int choice;
	    	while ((choice = menu1()) != 0) {
			switch (choice) 
			{
			case 1:
			System.out.println("enter num1");	
			num1=sc.nextDouble();
				
			System.out.println("enter num2");	
			num2=sc.nextDouble();
				
			calculate(num1,num2,(x,y) -> x+y);	
			break;
			case 2:
				System.out.println("enter num1");	
				num1=sc.nextDouble();
					
				System.out.println("enter num2");	
				num2=sc.nextDouble();
					
				calculate(num1,num2,(x,y)->x-y);	
				break;
			case 3:
				System.out.println("enter num1");	
				num1=sc.nextDouble();
					
				System.out.println("enter num2");	
				num2=sc.nextDouble();
					
				calculate(num1,num2,(x,y) -> x*y);	
				break;
			case 4:
				System.out.println("enter num1");	
				num1=sc.nextDouble();
					
				System.out.println("enter num2");	
				num2=sc.nextDouble();
					
				calculate(num1,num2,(x,y) -> x/y);	
				break;
				
				
				
			}
	  }
	        }
}
	        
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				