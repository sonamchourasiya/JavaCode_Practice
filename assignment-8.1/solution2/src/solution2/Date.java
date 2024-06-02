package solution2;
import java.util.Scanner;
public class Date implements Displayable{
	int day;
	int month;
	int year;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter day");
		this.day=sc.nextInt();
		System.out.println("enter month");
		this.month=sc.nextInt();
		System.out.println("enter year");
		this.year=sc.nextInt();
		
	}
	public void display()
	{
		System.out.println("enter day="+this.day);
		System.out.println("enter month="+this.month);
		System.out.println("enter year="+this.year);
	}
	
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

}
