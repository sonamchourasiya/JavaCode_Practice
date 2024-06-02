 package com.sunbeam;
import java.util.Scanner;

	interface check<T> {	
		boolean compare(T x, T y);
		}

		public class sol5Main{

			static <T> int countIf(T[] arr, T key, check<T> c) {
				
				int count=0;
			for(T ele : arr) {
				if(c.compare(ele,key)) {
						
					count++;
				
			}
			

			}	return count;
			}

			public static void main(String[] args) {
				Double  key;
				Scanner sc =new Scanner(System.in);
				Double[] arr = { 2.2, 3.2, 2.2, 2.5 };
		         System.out.println("enter key");
		           key=sc.nextDouble();
		           
				int cnt = countIf(arr, key, (x, y) -> x.equals(y));
				System.out.println("Count = " + cnt);

			}

		


		
		}


	


