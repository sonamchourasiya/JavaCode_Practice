package solution2;
import java.util.Scanner;
class Person implements Displayable{

	  String name;
	  int age;
	  
	  public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void acceptData()
	  {
		  Scanner sc=new Scanner (System.in);
		  System.out.println("enter name");
		  this.name=sc.next();
		  System.out.println("enter age");
		  this.age=sc.nextInt();
		  
	}
	@Override
	  public void display()
	  {
		  System.out.println("name="+this.name);
		  System.out.println("age="+this.age);
		  
	  }
	  
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}
	  

}

