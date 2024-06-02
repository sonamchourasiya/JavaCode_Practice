package com.app.fruits;

public class orange extends Fruits
{
	
	
	public orange() {
		super();
		// TODO Auto-generated constructor stub
	}

	public orange(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		// TODO Auto-generated constructor stub
	}

	@Override
	public  void acceptFruits()
	{
		super.acceptFruits();
		
	}
	
	public String taste()
	{
		return "sour";
	}
   
	

}
