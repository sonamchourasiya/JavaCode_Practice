

	package solution2;


	import java.util.Comparator;
import java.util.HashSet;
	import java.util.Iterator;
	import java.util.LinkedHashSet;
	import java.util.Scanner;
	import java.util.Set;
	import java.util.TreeSet;

import solution4.Book;


		   public class Mainsol4 {
			   
			   
		   public static void main(String[] args) {
			class BookComparator implements Comparator<Book>
			{

				@Override
				public int compare(Book b1, Book b2) {
					double  diff= - (b1.getPrice()-b2.getPrice());
					return (int) diff;
				}
				
			}
			 
			 Scanner sc=new Scanner(System.in);
			BookComparator bc = new BookComparator();
			 TreeSet<Book> set = new TreeSet<Book >(bc);
			 set.add(new Book("ab", "Pen","ac" ,23 ,3.0));
			 set.add(new Book("ab", "P","A" ,22 ,23.0));
			 set.add(new Book("ab", "Pen","ac" ,23 ,23.0));
			 set.add(new Book("db", "P","A" ,22 ,25.0));
			 set.add(new Book("ea", "Pen","ac" ,23 ,24.0));
			 set.add(new Book("Null", "sb","B" ,24,22.0));
			 Iterator<Book> itr=set.iterator();
			 while (itr.hasNext()) {
				 Book b=itr.next();
				 System.out.println(b+"enter book ");
			 }
			 System.out.print("Iterate in Descending order: ");
				Iterator<Book> itr1=((TreeSet<Book>) set).descendingIterator();
				while(itr.hasNext()) {
					Book b= itr.next();
					System.out.print(b + "enter book ");
				}
				System.out.println();
				
			 
				
		   }	

			

	







	
	}


