package solution2;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

	   public class Mainsol3 {
		   
	   public static void main(String[] args) {
		 
		 Scanner sc=new Scanner(System.in);
		 Set<Book> set = new TreeSet<Book>();
		 set.add(new Book("ab", "Pen","ac" ,23 ,3.0));
		 set.add(new Book("ab", "P","A" ,22 ,23.0));
		 set.add(new Book("ab", "Pen","ac" ,23 ,23.0));
		 set.add(new Book("db", "P","A" ,22 ,25.0));
		 set.add(new Book("ea", "Pen","ac" ,23 ,24.0));
		 set.add(new Book("as", "sb","B" ,24,22.0));
		 Iterator<Book> itr=set.iterator();
		 while (itr.hasNext()) {
			 Book b=itr.next();
			 System.out.println(b+"enter book ");
		 }
			
	   }	

		

}






