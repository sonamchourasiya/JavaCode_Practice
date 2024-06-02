package solution2;

public class Box<T>{
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

		
	private static void printDisplayable(Box<? extends Displayable> b) {
			b.getObj().display();
			
		}
		public static void  printBox(Box<?> b)
		{
			System.out.println(b.getObj().toString());
		}
		public static void main(String[] args)
		{
			Box<Person> b1=new Box<>();
			b1.setObj(new Person("ram",20));
			printDisplayable(b1);
			
			Box<Date>b2=new Box<>();
			b2.setObj(new Date(1,1,2023));		
			printDisplayable(b2);
			
		}

		
	}


