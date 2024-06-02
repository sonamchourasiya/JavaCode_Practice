package solution1;

public class Box <t extends Employee> {
	   private t obj;
public void set ( t val ) {this.obj=val;}
	public t get() {
		return this.obj;
	}
	public void getcalculatesalary()
	{
		return obj.calculatesalary();
	}
	

	 
		 
	 


	public t getObj() {
		return obj;
	}
	public void setObj(t obj) {
		this.obj = obj;
	}
	public static   void main(String[] args) {
		manager m = new manager();
		m.acceptData();
		m.displayData();
	    Box<manager> b1 = new Box<>(); 
	    b1.set(m);
		System.out.println("manager total salary="+b1.getcalculatesalary());
	    System.out.println("manager calculate salary="+get.calculatesalary());
	    
	}
}
	   
 
		  

