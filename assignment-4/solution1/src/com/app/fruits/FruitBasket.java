package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	public static void main(String[] args) {
		   System.out.println("enter the number of fruits you want");
		   Scanner sc=new Scanner(System.in);
		   int num=sc.nextInt();
		   Fruits basket[] =new Fruits[num];
		   int choice;
		   int counter=0;
		   int index;
		   
	    do {
	    
		System.out.println("0.exit");
	    System.out.println("1.add mango");
	    System.out.println("2.add orange");
		System.out.println("3.add apple");
	    System.out.println("4.display name of all fruits in the basket");
	    System.out.println("5.display name,color,weight taste");
		System.out.println("6.display tastes of all stale ");
		System.out.println("7.mark a fruit as stale");
		System.out.println("8.mark all sour fruits stale");
	   
	     System.out.println("enter your  choice=+");
	     choice= sc.nextInt();
	   switch (choice) {
	   case 1:
		   if(counter<num) {
			   
		  
			   basket[counter] = new mango();
		       basket[counter].acceptFruits();
		       counter++;
		   } 
	      break;
	   case 2:
		   if(counter<num) {
			   basket[counter] = new orange();
	       basket[counter].acceptFruits();
	       counter++;
	   } 
	    break;
	    
	   case 3:
	    	    if(counter <num) {
	    	
	 			   basket[counter] = new Apple();
	 	       basket[counter].acceptFruits();
	 	       counter++;
	    	}
	    	break;
	    	
	    	
	   case 4:
		   for(Fruits fruits :basket)
		   {
			   if(fruits!=null) {
				   String name=fruits.getName();
				   System.out.println(name);
				   
			   }
		   }
		   break;
	   case 5:
		   
		   System.out.println("enter index");
		   for(Fruits fruits : basket) {
			   if(fruits!=null) {
				   if(fruits.isFresh()) {
					   String details=fruits.toString();
					   System.out.println("details");
					   
				   } else
				   {
					   System.out.println("fruit is null");
					   
				   }
			   }
		   }
		   break;
	   case 6:
		   for(Fruits fruits : basket) {
				if(fruits.isFresh()) {
					System.out.println("all fruits are fresh");
					break;	
				}else
				{
					String taste=fruits.taste();
					System.out.println(taste);
					}
		   }
				break;
				
				case 7:{
					System.out.println("enter the number of index");
					index= sc.nextInt();
					if(index >counter && counter < 0 ) {
						  System.out.println("not index print index");
		   }
		   else{
			   basket[index].setFresh(false);
		   }
				}
			   break;
			   
		 case 8:
		    for(Fruits fruit :basket) {
		    	if(fruit.taste()== "sour") {
		    		fruit.setFresh(false);
		    	}
		    }
		    break;
		    
	   }
}   while (choice!=0);
}
}
