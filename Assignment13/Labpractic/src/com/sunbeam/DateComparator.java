package com.sunbeam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

import com.mysql.cj.util.Util;
import java.util.Comparator;
public class DateComparator  implements Comparator<Project>{
	public int compare(Project p1,Project p2) {
		return Long.compare(p1.getStartDate().getTime(),p2.getStartDate().getTime());
		
	}
	public class TeamsizeComparator implements Comparator <Project>{
		public int compare(Project p1,Project p2) {
			return Integer.compare(p1.getTeamSize(), p2.getTeamSize());
			
		}
	}
}
public class Tester {


		public static int menu()
		{
			int choice;
			Scanner sc=new Scanner(System.in);
			System.out.println("-------- menu--------");
			System.out.println("0.exit");
			System.out.println("1.add following Projects in the set");
			System.out.println("2.input a project from user and add in set");
			System.out.println("3.Display all project in set");
			System.out.println("4.delete a project by id from set");
			System.out.println("5.copy all projects from set to array list");
			System.out.println("6.find project with max team size using collections.max()");
			System.out.println("7.count all project of java technologyusing stream api");
			System.out.println("enter from choice");
			choice=sc.nextInt();
			return choice;
		}
		public static void main(String[]args) {
			Set<Project> projectset=new HashSet<>();
			Project projects;
			Scanner scanner=new Scanner(System.in);
			projectset.add(new Project(1, "Train Reservation System", 4,Util.toDate("2023-02-22"), "Java"));
		     projectset.add(new Project(2, "Airline Reservation System",3, Util.toDate("2023-03-21"), ".NET"));
			projectset.add( new Project(4, "Online Grocery Shop", 6, Util.toDate("2023-04-12"), "Java"));
			projectset.add (new Project(5, "Online Book Shop", 2, Util.toDate("2023-01-14"), ".NET"));
			projectset.add (new Project(3, "Online Jewelry Shop", 4, Util.toDate("2023-01-31"), "Java"));
			projectset.add (new Project(2, "Bus Reservation System", 3, Util.toDate("2023-01-31"), "JS"));
           //arraylist
			List<Project>projectlist=new ArrayList<>();
			projectlist.addAll(projectset);
			int choice1;
			while((choice1=menu())!=0) {
				switch (choice1) {
				Scanner sc=new Scanner(System.in);
				case 1:
				 System.out.println("enter id");
				 int id=sc.nextInt();
				 System.out.println("enter projectname");
				 String projectname=sc.next();
				 System.out.println("enter team size");
				 int  teamsize=sc.nextInt();
				 System.out.println("enter enter start date(yyyy-MM-dd)");
				 String date=Scanner.nextLine();
				 System.out.println("enter technology");
				 String technology=sc.next();
				 java.util.Date uDate=util.toDate(date);
				 project add=new Project(id,name,teamsize,uDate,technology);
				 projectSet.add(project);
				break;
				case 2:
				for(int i=0;i<ArrayList.size();i++)
						System.out.println(projectlist.get(i));
				case 3:
					System.out.println("enter id");
					int id= sc.nextInt();
					Project=new Project();
					projectset.remove(id);
					break;
				case 4:
					System.out.println("display all project from list");
					for(int i=0;i<projectList();i++)
						System.out.println(projectlist.get(project));
				case 5:
					System.out.println("enter id for searching");
					index=sc.nextInt();
					key=newProject();
					projectList.indexof(key);
					if(index==-1)
					{
						System.out.println("book is not found");
						
					}else
					{
						System.out.println("book is found");
						
					}
					System.out.println(booklist.contains(key));
					break;
				case 6:
				System.out.println("searching");
				//enter id for searching
					int index=sc.nextInt();
					key=new project();
					projectList.indexof (key);
					if(index==-1)
					{
						System.out.println("book is not found");
					}
					System.out.println(booklist.contains(key));
				
				
				}
// @formatter:on

					
					
			}
			
			
		}
	}
}


