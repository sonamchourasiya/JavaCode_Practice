package com.sunbeam;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;



	public class QueMain {
		
		
		private static String Tittle;

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
		    System.out.println("7.save book from file");
		    System.out.println("8.load book from file");
			System.out.print("Enter your choice = ");
			choice = new Scanner(System.in).nextInt();
			System.out.println("------------------------------------------------------");

			return choice;
		}

		public static void writebook() {

			int choice, index, count = 0;
			Book1 key;
		

			Scanner sc = new Scanner(System.in);
			ArrayList<Book1> bookList = new ArrayList<Book1>();
		
		    
			while ((choice = menu()) != 0) {
				switch (choice) {
				case 1:
					Book1 b = new Book1();
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
					key = new Book1();
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
					
					String isbn=sc.next();
					bookList.remove(isbn);
					
				case 6:

					for (Book1 book : bookList) {
						count += book.getQuantity();
					}
					System.out.println("Number of books in list = " + count);
					break;

				case 7:

					class Arrsort implements Comparator<Book1> {
						@Override
						public int compare(Book1 a, Book1 b) {
							int diff = -Double.compare(a.getPrice(), b.getPrice());

							return diff;
						}
					}

					Arrsort booksort = new Arrsort();
					bookList.sort(booksort);
					System.out.println("Sorted Book List");
					for (Book1 book : bookList) {
						System.out.println(book);
					}
					break;
				case  8:
					
					List<Book1> list = new ArrayList<>();
					
					String srcFilePath = "abc";
					String destFilePath ="bca";
				//	int b;//
					try(FileOutputStream fout = new FileOutputStream("booklist")) {
						try(DataOutputStream dout = new DataOutputStream(fout)) {
							for(Book1 b1:list)
							{
							   dout.writeUTF(b1.getisbn());
							   dout.writeUTF(b1.getTittle());
							   dout.writeUTF(b1.getAuthor());
							   dout.writeDouble(b1.getQuantity());
							   
							}
						} // dout.close();
					} // fout.close();
					catch (Exception e) {
						e.printStackTrace();
					}
					
					System.out.println("Book saved.");
			
				case 9:
					try(FileInputStream fin = new FileInputStream("booklist")) {
						try(DataInputStream din = new DataInputStream(fin)) {
							while(true)
								{
								 Book1 b1= new Book1();
								 b1.setisbn(din.toString());
								 b1.setTittle(din.readUTF());
								 b1.setAuthor(din.readUTF());
								// b.setQuantity(din.readUTF());
								}
						}
					}
					
					catch (EOFException e) {
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}
				}
			}
				}
				
					
			
		public static void main(String[] args)
		{
			writebook();
		}

		
	}

	


