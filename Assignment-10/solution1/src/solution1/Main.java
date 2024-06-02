package solution1;

import java.util.*;

public class Main {

	
	static int menu() {
		int choice;
		System.out.println("------------------------------------------------------");
		System.out.println("Menu");
		System.out.println("1. Add new book in list");
		System.out.println("2. Display all books in forward order using random access");
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
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				Book b = new Book();
				b.accept();
				if (bookList.contains(b)) {
					System.out.println("list already contais book");
					index = bookList.indexOf(b);
					b.setQuantity(b.getQuantity() + 1);
					bookList.set(index, b);
					System.out.println("quantity of book=" + b.getQuantity());
				} else
					 {
					bookList.add(b);
				System.out.println("book added successfully");
			}

				break;

			case 2:

				for (int i = 0; i < bookList.size(); i++) {
					
					System.out.println(bookList.get(i));
				}
				break;
			case 3:
				System.out.println("Enter book for searching = ");
				index = sc.nextInt();
				key = new Book();
			    bookList.indexOf(key);
			    if(index==-1)
			    {
			    	System.out.println("book is not found");
			    }
			    else 
			    {
			    	System.out.println("book is found");
			    }
				System.out.println(bookList.contains(key));
				break;


			case 4:
				System.out.println("delete a book at given index");
				  System.out.println("enter element for index");
				  int index1=0;
				     index1=sc.nextInt();
				  
				     bookList.remove(index1);
				break;
				
			case 5:
				System.out.println("delete a book with given isbn ");
				System.out.println("enter isbn for delete");
				
				isbn=sc.next();
				bookList.remove(isbn);
				
			case 6:

				for (Book book : bookList) {
					count += book.getQuantity();
				}
				System.out.println("Number of books in list = " + count);
				break;

			case 7:

				class Arrsort implements Comparator<Book> {
					@Override
					public int compare(Book a, Book b) {
						int diff = -Double.compare(a.getPrice(), b.getPrice());

						return diff;
					}
				}

				Arrsort booksort = new Arrsort();
				bookList.sort(booksort);
				System.out.println("Sorted Book List");
				for (Book book : bookList) {
					System.out.println(book);
				}
				break;

			default:
				System.out.println("Wrong Choice Entered :(");
				break;
			}
		}
		System.out.println("Thank you for using our Book App :)");
	}

	
}
