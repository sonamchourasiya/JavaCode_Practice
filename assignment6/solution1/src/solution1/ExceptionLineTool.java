package solution1;

import java.util.Scanner;
public class ExceptionLineTool{
	public static void main(String[] args) throws ExceptionLineTool
    String line;
	System.out.println("enter the line toread");
	try {
		Scanner sc=new Scanner(System.in);
		line=sc.next();
		System.out.println("the length of the string is:"+line.length());
        if(line.length()>80) {
        	throw new ExceptionLineTool();
        	
        }
	}
	catch (ExceptionLineTool e) {
		e.display();
	}
}

	private void display() {
		// TODO Auto-generated method stub
		
	}
}
	


