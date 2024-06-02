package com.sunbeam;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[]args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter a string s an input to check weather it is palindrome or not");
	String input=sc.nextLine();

	if(isPalindrome(input))
	{
		System.out.println(input+"is a palindrome string");
	}
	else
	{
		System.out.println(input+"is not a palindrome string");
	}
	}
		
	public static boolean isPalindrome(String str) 
	{
		int left=0;  int right;right=str.length() -1;
		while (left< right)
		{
			if(str.charAt(left)   != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		
	return true;
		
				
	}
	
}
