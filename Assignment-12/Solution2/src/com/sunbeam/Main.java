package com.sunbeam;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
 private static Book1 key1;
private static Book1 key2;


static int menu() {
	 int choice;
	 Scanner sc =new Scanner (System.in);
	 System.out.println("------------------------");
	 System.out.println("1.add new book");
	 System.out.println("2.display all book");
	 System.out.println("3.search a book ");
	 System.out.println("4.delete a index at given index");
	 System.out.println("5.delete a book with given isbn");
	 System.out.println("6.reverse a book");
	 System.out.println("7.save book from file");
	 System.out.println("8.load book from file");
	 System.out.println("enter your choice");
	 choice=sc.nextInt();
	 return choice;
 }
	
 
	public static void main(String[] args, Book1 Key3) {
		int choice;
		int index,key;
		Scanner sc =new Scanner(System.in);
		ArrayList<Book1>bookList=new ArrayList<Book1>();
		ArrayList<Book1>bookList1=new ArrayList<Book1>();
		while((choice=menu())!=0) {
			switch (choice) {
			case 1:
			   Book1 b=new Book1();
			   b.accept();
			   bookList.add(b);
			break;
			case 2:
				for(Book1 b1:bookList)
			System.out.println(b1);
				break;
			case 3:
				System.out.println("enter book for searching");
				index=sc.nextInt();
			key1= new Book1();
				int key1 = 0;
				bookList.indexOf(key1);
				if(index==-1)
				{
					System.out.println("inded is not found");
				}
				else
				{
					System.out.println("book is ound");
				}
				System.out.println(bookList.contains(key1));
				break;
			case 4:
				System.out.println("enter book for searching");
				index=sc.nextInt();
				key2=new Book1();
				int Key2=0;
				bookList.indexOf(Key2);
				if(index==-1)
					System.out.println("index is not found");
				else
				{
					System.out.println("index is found");
				}
				System.out.println(bookList.contains(key2));
			case 5:
				System.out.println("delete a book at given isbn");
				System.out.println("enter isbn for delete");
				String isbn=sc.next();
				bookList.remove(isbn);
			case 6:
				System.out.println("enter index");
				System.out.println("enter index for delete");
				int index1=0;
				
				index1 =sc.nextInt();
				bookList.remove(index1);
			case 7:
				System.out.println("enter index for searching");
				int index3=0;
			index3=sc.nextInt();
			Key3=new Book1();
			//
			//int Key3=0;
			bookList.indexOf(Key3);
			if (index3==-1)
			{
				System.out.println("not found");
			}
			else
			{
			System.out.println("found");
			}
			System.out.println(bookList.contains(Key3));
			
			case 8:
			    try()
			default:
				
				break;
			}
		}
		
		
	}

}
