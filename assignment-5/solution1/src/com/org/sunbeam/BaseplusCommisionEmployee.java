package com.org.sunbeam;

public class BaseplusCommisionEmployee extends Commisionemployee  {
	
	 private int basesalary;

	BaseplusCommisionEmployee()
	{
		super();
	}
	public BaseplusCommisionEmployee(int basesalary) {
		super();
		this.basesalary = basesalary;
	}
	
	
	@Override
	public String toString() {
		return "BaseplusCommisionEmployee [basesalary=" + basesalary + ", getGrosssales()=" + getGrosssales()
				+ ", getCommisionrate()=" + getCommisionrate() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	public int getBasesalary() {
		return basesalary;
	}
	public void setBasesalary(int basesalary) {
		this.basesalary = basesalary;
	}
	
	public void calculate()
	{
		System.out.println("total salary: "+super.getCommisionrate()*super.getGrosssales()+this.basesalary);
	}
	
 

}
