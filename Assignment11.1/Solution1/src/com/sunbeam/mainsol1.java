package com.sunbeam;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class mainsol1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			 
			 Scanner sc=new Scanner(System.in);
			 Set<Book> set = new HashSet<Book>();
			 set.add(new Book("ab", "Pen","ac" ,23 ,3.0));
			 set.add(new Book("bc", "P","A" ,22 ,23.0));
			 set.add(new Book("ca", "Pen","ac" ,23 ,23.0));
			 set.add(new Book("db", "P","A" ,22 ,25.0));
			 set.add(new Book("ea", "Pen","ac" ,23 ,24.0));
			 set.add(new Book("as", "sb","B" ,24,22.0));
			 Iterator<Book> itr=set.iterator();
			 while (((Iterator<Book>) set).hasNext()) {
				 Book b=((Iterator<Book>) set).next();
				 System.out.println(b+"enter book ");
			 }
				
		   }	
	}
				
	}

}
