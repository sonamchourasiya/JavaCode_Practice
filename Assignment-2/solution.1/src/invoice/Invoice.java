package invoice;

import java.util.Scanner;





public class Invoice {
	   
	    	String partNum;
	        String partDes;
	        int quantity;
	        double price;
	    
	   

	public Invoice() {
				
			}


	public Invoice(String partNum, String partDes, int quantity, double price) {
		
				this.partNum = partNum;
				this.partDes = partDes;
				this.quantity = quantity;
				this.price = price;
			
	
	
	}


	public String getPartNum() {
		return partNum;
	}





	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}





	public String getPartDes() {
		return partDes;
	}





	public void setPartDes(String partDes) {
		this.partDes = partDes;
	}





	public int getQuantity() {
		return quantity;
	}





	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}





	public double getPrice() {
		return price;
	}





	public void setPrice(double price) {
		this.price = price;
	}
	
	public void  acceptData()
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("enter partnum=");
		 partNum=sc.next();
		System.out.println("enter partDes="); 
		 partDes=sc.next();
		 System.out.println("enter quantity");
		   quantity=sc.nextInt();
		   if(quantity<0)
		   {
			   quantity=0;
			   System.out.println("quantity="+quantity);
		   }
		   System.out.println("enter price=");
		   price =sc.nextInt();
	       if(price<0)
	       {
	    	   price=0.0;
	    	   System.out.println("enter quantity="+price);
	       }
	}
	public void calculateAmount()
	{
		System.out.println("total invoice="+price*quantity);
	}
	
	
	
	
	
	
		
	
	}




