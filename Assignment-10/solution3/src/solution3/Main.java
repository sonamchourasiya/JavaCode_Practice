package solution3;

import java.util.*;



public class Main {
	static int menu() {
		int choice;
		System.out.println("------------------------------------------------------");
		System.out.println("Menu");
		System.out.println("1. Add new employee in  list");
		System.out.println("2. delete employee in list");
		System.out.println("3. find a employee in list");
		System.out.println("4. sort a list in list");
		System.out.println("5. edit a list in list");
		System.out.println("6.reverse the list ");

		System.out.print("Enter your choice = ");
		choice = new Scanner(System.in).nextInt();
		System.out.println("------------------------------------------------------");

		return choice;
	}

	public static void main(String[] args) {
		int choice, index = 0, count = 0;
	   String name;
	   int id;
       Employee key;
       
		Scanner sc = new Scanner(System.in);
		
List<Employee> employeelist= new LinkedList<Employee>();
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				Employee e = new Employee();
			
				e.accept();
				employeelist.add(e);
				System.out.println("employee list added successfully");
				break;
				
			case 2:
				System.out.println("delete book");
				employeelist.remove(index);
				System.out.println("delete all employee");
				
				break;
				
			case 3:
				System.out.println("find a employee in list");
				
				index = sc.nextInt();
				key = new Employee();
				employeelist.indexOf(key);
			    if(index==-1) {
			    
			    	System.out.println("employee  is not found");
			    }
			    else
			    	System.out.println("employee is found");
			    
			break;
			case 4:
				class  EmployeeComparator implements Comparator<Employee>{
					 public int compare(Employee e1,Employee e2 ) {
						int diff = e1.getId()-e2.getId();
						return diff;
					 }
				}
						EmployeeComparator comparator= new EmployeeComparator();
						employeelist.sort(comparator);
				System.out.println("sort a list in list");
				employeelist.sort(null);
				System.out.println("employee name");
				  name=sc.next();
				  System.out.println("employee name");
				  name=sc.next();
				  break;
				  case 5:
				  {
					System.out.println("edit a list");
					System.out.println("Enter emp id to be modified: ");
					 id = sc.nextInt();
					Employee key1 = new Employee();
					key1.setId(id);
				 index = employeelist.indexOf(key1);
					if(index == -1)
					System.out.println("Employee not found.");
					else {
					Employee oldEmp = employeelist.get(index);
					System.out.println("Employee Found: " + oldEmp);
					System.out.println("Enter new information for the Employee");
					Employee newEmp = new Employee();
					newEmp.accept();
					employeelist.set(index, newEmp);
					break;
					}
				  }
				
					  
			}
		}
	}
}
				
	
			


	