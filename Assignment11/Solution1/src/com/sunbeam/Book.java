package com.sunbeam;

	
	import java.util.ArrayList;
	import java.util.Comparator;
	import java.util.List;
import java.util.Objects;
import java.util.Scanner;

	public class Book {
		String isbn;
		String tittle;
		String author;
		int quantity;
		double price;

		public void accept() {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter isbn");
			this.isbn = sc.next();
			System.out.println("enter tittle");
			this.tittle = sc.next();
			System.out.println("enter author");
			this.author = sc.next();
			System.out.println("enter quantity");
			this.quantity = sc.nextInt();
			System.out.println("enter price");
			this.price = sc.nextDouble();
		}
		
		
	         public Book(String isbn, String tittle, String author, int quantity, double price) {
			super();
			this.isbn = isbn;
			this.tittle = tittle;
			this.author = author;
			this.quantity = quantity;
			this.price
			= price;
		}


			public  String getisbn()
	         {
	        	return isbn; 
	         }
	         public void setisbn(String isbn)
	         {
	        	 this.isbn=isbn;
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

		

		@Override
		public int hashCode() {
			return Objects.hash(isbn);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Book other = (Book) obj;
			return Objects.equals(isbn, other.isbn);
		}
		

		

		

		
	}

	



