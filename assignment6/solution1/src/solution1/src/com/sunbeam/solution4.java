package com.sunbeam;

import java.util.Scanner;

public class solution4 {
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter any statement having multiple words");
		String str= scanner.nextLine();
	    String[] strar = str.split(" ");
	    System.out.println("the number of words in the given string text is:"+strar.length);
		
	}

} 
