package com.sunbeam;

import java.util.Scanner;

public class MainClass {
         static int menu() {
        	  int choice;
     Scanner sc =new Scanner("System.in");
   
     
    System.out.println("----------------");
    System.out.println("menu");
    System.out.println("1.");
    System.out.println("2.");
    System.out.println("3.");
    
    System.out.println("4.");
    System.out.println("5.");
    System.out.println("6.");
    System.out.println("enter your choice");
    choice=sc.nextInt();
    return choice;
	
	}
         
    
      public static void main(String[] args) {
    	 int choice,index,count=0;
    	 Scanner sc=new Scanner(System.in);
    	 try(Bugsdao dao= new Bugsdao() ){
    		 
    		 System.out.println("enter tittle");
    		 String tittle=sc.next();
    		 System.out.println("enter description");
    		 String description=sc.next();
    		 System.out.println("enter status");
    		 String status=sc.next();
    		 
    		 System.out.println("enter assignedto");
    		 
    		 int  assignedto=sc.nextInt();
    		 System.out.println("enter created");
    		 String created=sc.next();
    		 System.out.println("enter modified");
    		 String modified=sc.next();
    		 Bugs b= new Bugs(0,tittle,description, status,assignedto,now(),now());
    		 int cnt=dao.save(b);
    		 System.out.println("insert row="+cnt);
    		
    			 
    	 
    	  
      }
    	 catch(Exception e) {
    		 e.printStackTrace();
    	 }




  try(Bugsdao dao=new Bugsdao()){
	  System.out.println("enter id to update status");
	 int id=sc.nextInt();
	 int cnt=dao.updatestatus(id);
	 System.out.println("insert row="+cnt);
	 System.out.println("ente bugs new status");
	 
	  
	  
  }catch(Exception e) {
	  e.printStackTrace();
  }
}
  
      


	private static String now() {
		// TODO Auto-generated method stub
		return null;
	}


	private void nextInt() {
		// TODO Auto-generated method stub
		
	}
}
