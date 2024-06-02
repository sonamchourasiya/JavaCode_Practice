package solution3;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
public class Employee {
	
	private String name;
	private  int id;
	public Employee()
	{
		
	}
	public Employee(String name, int id) {
		//super();
		this.name = name;
		this.id = id;
	}
	public void accept()
	{
		Scanner sc=new Scanner (System.in);
	
		System.out.println("enter name");
		this.name= sc.next();
		System.out.println("enter id");
		this.id= sc.nextInt();	
		
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
}
	
	
	


		