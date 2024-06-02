
package com.app.fruits;

import java.util.Scanner;

public class Apple extends Fruits
{
	  
	  
	  public Apple() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Apple(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		// TODO Auto-generated constructor stub
	}
	public String taste()

	  {
		  return "sweet n sour";
		  
	  }
	  public void accept()
	  {
		  super.acceptFruits();
		  
	  }
}
	

	   
	