package solution1;
import java.util.Scanner;
public class Bank {
	
        int accno;
        int balance;
        int items;
        int credit;
        int charges;
        
		

	
	public Bank()
	{
		
	}



	public int getCharges() {
		return charges;
	}
	public void setCharges(int charges) {
		this.charges = charges;
	}
	public Bank(int accno, int balance, int items, int credit, int charges) {
	
		this.accno = accno;
		this.balance = balance;
		this.items = items;
		this.credit = credit;
		this.charges = charges;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getItems() {
		return items;
	}
	public void setItems(int items) {
		this.items = items;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	
	
	public void acceptBank()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter accno=+");
		accno=sc.nextInt();
		System.out.println("balance=+");
		balance=sc.nextInt();
		System.out.println("item=+");
		items=sc.nextInt();
		System.out.println("credit=+");
		credit=sc.nextInt();
		System.out.println("charge=+");
		charges=sc.nextInt();
	}
	public void displayBank()
	{
		System.out.println("accountno="+this.accno);
		System.out.println("balance="+this.balance);
		System.out.println("items="+this.items);
		System.out.println("credit="+this.credit);
		System.out.println("charge="+this.charges);
	}
	public double calculateBank(){
	
		double  newbalance=(this.balance+this.charges-this.credit);
		return newbalance;
		
	}
	
	public void checkCardLimit()
	{
		if(calculateBank()>credit) {
		System.out.println("credit limit exceed");	
	}
	else
	{
	
		System.out.println("credit limit not exceed");
	
	} 
}
	
	

}


	
	



	

