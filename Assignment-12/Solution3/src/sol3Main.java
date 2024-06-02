import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class sol3Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		try(FileWriter fwr=new FileWriter("file.txt")){
		
			try(BufferedWriter bw=new BufferedWriter(fwr)){
				
			
					for(int i=1;i<=4;i++) {
						System.out.println("enter a line");
						String line=sc.nextLine();
						bw.write(line);
						bw.newLine();
					}
		}
	
	}
     catch(Exception e){
    	 e.printStackTrace();
     }
     
	
	}
}
	
	

