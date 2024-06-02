package com.app.fruits;

import java.util.Scanner;


public class Fruits {
	String color;
	double weight;
	String name;
	boolean  isFresh;
	public Fruits()
	{
		
	}
	public Fruits(String color, double weight, String name, boolean isFresh) {
		
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	@Override
	public String toString() {
		return "Fruits [color=" + color + ", weight=" + weight + ", name=" + name + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void acceptFruits()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter color=");
		this.color=sc.next();
		System.out.println("enter weight=");
		     this.weight=sc.nextDouble();
	
		System.out.println("enter name=");
		this.name=sc.next();
		
		
	}
	 public void displayFruits()
	{
		System.out.println("color="+this.color);
		System.out.println("weight="+this.weight);
		System.out.println("name="+this.name);
	
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	public String taste() {
		// TODO Auto-generated method stub
		return "no specific taste";
		
				
	
	
	
	
	}
	
	
	
	
	
	
	
	

}
