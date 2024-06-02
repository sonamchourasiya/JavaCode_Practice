package com.sunbeam;
import java.util.*;
public class Mainsol5 {




	

		
		static int menu() {
			int choice;
			System.out.println("------------------------------------------------------");
			System.out.println("Menu");
			System.out.println("1.insert in map");
			System.out.println("2.find in map ");
			System.out.println("3. search a book with given isbn");
			System.out.println("4. delete a index at given index");
			System.out.println("5. Delete a book with given isbn");
			System.out.println("6.reverse the list ");
		
			System.out.print("Enter your choice = ");
			choice = new Scanner(System.in).nextInt();
			System.out.println("------------------------------------------------------");

			return choice;
		}

		public static void main(String[] args) {

			int choice, index, count = 0;
			Book key;
			String isbn;

			Scanner sc = new Scanner(System.in);
			Map<String,Book> map = new HashMap<>();
			
			while ((choice = menu()) != 0) {
				switch (choice) {
				case 1:
					Book b = new Book();
					b.accept();
					map.put(b.getIsbn() ,b);
					

					break;
					
				case 2:
					String isbn1 = sc.next();
					
					Book f = map.get(isbn1);
					System.out.println(f);
				}
			}
		}
}

				