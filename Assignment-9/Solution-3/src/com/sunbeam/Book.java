package com.sunbeam;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class Book {
       String isbn;
       String tittle;
       String author;
       int quantity;
       double price;
       public void accept()
       {
    	   Scanner sc = new Scanner (System.in);
    	   System.out.println("enter isbn");
    	   this.isbn=sc.next();
    	   System.out.println("enter tittle");
    	   this.tittle=sc.next();
    	   System.out.println("enter author");
    	   this.author=sc.next();
    	   System.out.println("enter quantity");
    	   this.quantity=sc.nextInt();
    	   System.out.println("enter price");
    	   this.price=sc.nextDouble();
       }
       
       
       
       
       
       
       
	public String getTittle() {
		return tittle;
	}







	public void setTittle(String tittle) {
		this.tittle = tittle;
	}







	public String getAuthor() {
		return author;
	}







	public void setAuthor(String author) {
		this.author = author;
	}







	public int getQuantity() {
		return quantity;
	}







	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}







	public double getPrice() {
		return price;
	}







	public void setPrice(double price) {
		this.price = price;
	}







	public String getIsbn() {
		return isbn;
	}







	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", tittle=" + tittle + ", author=" + author + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}
	
public boolean equals(Object obj)
{
	if(this==obj)
		return true;
	if(obj==null)
		return false;
	Book other = (Book)obj;
	if(other.getIsbn().equals(this.isbn))
		return false;
	return true;
}
int choice;
		System.out.println("------------------------------------------------------");
		System.out.println("Menu");
		System.out.println("1. Add new book in list");
		System.out.println("2. Display all books in forward order");
		System.out.println("3. Delete book at given index");
		System.out.println("4. Check if book with given isbn is in list or not");
		System.out.println("5. Delete all books in list");
		System.out.println("6. Display number of books in list");
		System.out.println("7. Sort all books by price in desc order");
		System.out.print("Enter your choice = ");
		choice = new Scanner(System.in).nextInt();
		System.out.println("------------------------------------------------------");

		return choice;
	}

	public static void main(String[] args) {
		List<Book> list =new ArrayList<>();
		Book b;
		String index;
		int choice;
		do {
			Scanner sc=new Scanner(System.in);
			choice =sc.nextInt();
			switch(choice) {
			
			case 1://add book
				b=new Book();
				b.accept();
				list.add(b);
				 break;
				 
			case 2://display book
				 for(Book bk:list)
					 System.out.println(bk);
				 break;
				 
			case 3://remove at book
				System.out.println("enter index at which element bre deleted");
				index=sc.next();
				list.remove(index);
				break;
			case 4: //check if book present
			         String isbn = new String();
			        Book key=new Book();
			        key.setIsbn(isbn);
			     if(list.contains(key))
			    	 System.out.println("found");
			     else
			    	 System.out.println(" not found");
				 break;
				 
			case 5://delete all books
				list.clear();
				break;
			case 6://display no.of books
				System.out.println("size="+ list.size());
				break;
			case 7://sort by price desc
				   class BookPriceComparator implements Comparator<Book>{
					 public int compare(Book b1,Book b2) {
						int diff = Double.compare(b1.getPrice(), b2.getPrice());
						return diff;
						
					}
				}
				BookPriceComparator comparator= new BookPriceComparator();
				list.sort((Comparator<? super Book>) comparator);
				break;
		}
		while(choice !=0);
	}
	}







					
				
				   
			    	  
			     
			
	





	private void setIsbn(String isbn2) {
		// TODO Auto-generated method stub
		
	}
		
		

	}


