package solution3;
import java.util.Scanner;

public class Date {
	int month;
	int year;
	int day;
	public Date()
	{
		
	}
	public Date(int month, int year, int day) {
		super();
		this.month = month;
		this.year = year;
		this.day= day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getday() {
		return day;
	}
	public void setday(int day) {
		this.day = day;
	}
	
	void acceptDate()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter day="+day);
		  day=sc.nextInt() ;
		  System.out.println("enter month="+month);
		  month=sc.nextInt() ;
		  System.out.println("enter year="+year);
		  year=sc.nextInt() ;
		  
	}
	void displayDate()
    {
    	System.out.println("Date="+29 +"/"+ 11 + "/" + 11);
    }
    
	
	

}
