package com.app.fruits;

import java.util.Scanner;

public class mango extends  Fruits
{
	    
	    
		
		public mango() {
		super();
		// TODO Auto-generated constructor stub
	}
	public mango(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		// TODO Auto-generated constructor stub
	}
		public String taste()
		{
			return "sweet";
		}
		public void accept()
		{
			super.acceptFruits();
		}
	   
		
	    

}
