package com.sunbeam;

import java.util.Scanner;

public class Usermain2 {

	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			choice =sc.nextInt();
			switch (choice) {
			case 1:
				try(UserDao dao=new UserDao()){
					System.out.println("enter id");
				int id=sc.nextInt();
					System.out.println("enter first_name");
					String first_name=sc.next();
					System.out.println("enter last_name");
					String last_name=sc.next();
					System.out.print("enter email");
					String email=sc.next();
					System.out.print("enter password");
					String password=sc.next();
					System.out.println("enter dob");
					String dob=sc.next();
					System.out.print("enter status");
					String status=sc.next();
					System.out.print("enter roll");
					String roll=sc.next();
					int id1=sc.nextInt();
					
					Users u=new Users(0,first_name,last_name,email,password,dob,status,roll);
				    int cnt= dao.save(u);
				    System.out.println("insert row="+cnt);
					
				
				}
				catch (Exception e) {
					e.printStackTrace();
				}
					
				
				break;
			case 2:
				try(UserDao dao=new UserDao()){
					System.out.println("enter users id to be updated");
					int id =sc.nextInt();
					System.out.println("enter user new first_name");
					String first_name=sc.next();
					System.out.println("enter user new  last_name");
					String last_name=sc.next();
					System.out.println("enter user new email");
					String email=sc.next();
					System.out.println("enter user new password");
					String password=sc.next();
					System.out.println("enter user new dob");
					String dob=sc.next();
					System.out.println("enter user new status");
					String status=sc.next();
					System.out.println("enter user new roll");
					String roll=sc.next();
					 Users u =new Users();
					int cnt=dao.update(id,first_name,last_name,email,password,status);
					System.out.println("update row="+cnt);
				}
               catch (Exception e) {
            	   e.printStackTrace();
               }
			
				
			}
			
		}while(choice!=0);

	}

}
