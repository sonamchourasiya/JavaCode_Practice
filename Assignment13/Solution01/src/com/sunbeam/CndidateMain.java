package com.sunbeam;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CndidateMain {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
	int choice=0;
		
		do {
			System.out.println();
			
			
			choice=sc.nextInt();
			
			
			switch(choice) {
			case 1:
				
				try(CandidateDAO dao= new CandidateDAO()){
					System.out.println("enter name");
					String name=sc.next();
					System.out.println("enter party");
					String party=sc.next();
					System.out.println("enter votes");
					int votes=sc.nextInt();
					Candidate c=new Candidate(0,name,party,votes);
					int cnt= dao.save(c);
					System.out.println("Insert row="+cnt);
				   
					
			
				}	
					
				catch(Exception e)
				{
					e.printStackTrace();	
				}
				
				
				
				
				
				
				break;
			case 2:
				try(CandidateDAO dao= new CandidateDAO()){
					System.out.println("enter candidate id to be updated");
					int id=sc.nextInt();
					System.out.println("enter candidate new name");
					String name=sc.next();
					System.out.println("enter candidate new party");
					String party=sc.next();
					Candidate c =new Candidate(id,name,party,0);
					int cnt=dao.update(c);
					System.out.println("update row="+cnt);
					
					
			}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
			case 3:
				try(CandidateDAO dao= new CandidateDAO()){
					List<PartyVotes>list= dao.getPartywiseVotes();
					list.forEach(c -> System.out.println(c));
				
		}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				break;
			}
		}
		
		
				
				
			
		while(choice!=0);
}
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		try(CandidateDAO dao= new CandidateDAO()){
//			System.out.println("enter name");
//			String name=sc.next();
//			System.out.println("enter party");
//			String party=sc.next();
//			System.out.println("enter votes");
//			int votes=sc.nextInt();
//			Candidate c=new Candidate(0,name,party,votes);
//			int cnt= dao.save(c);
//			System.out.println("Insert row="+cnt);
//			
//			
//	
//		}	
//			
//		catch(Exception e)
//		{
//			e.printStackTrace();	
//		}
//		try(CandidateDAO dao= new CandidateDAO()){
//			System.out.println("enter candidate id to be updated");
//			int id=sc.nextInt();
//			System.out.println("enter candidate new name");
//			String name=sc.next();
//			System.out.println("enter candidate new party");
//			String party=sc.next();
//			Candidate c =new Candidate(id,name,party,0);
//			int cnt=dao.update(c);
//			System.out.println("update row="+cnt);
//			
//			
//	}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		
//		try(CandidateDAO dao= new CandidateDAO()){
//			List<PartyVotes>list= dao.getPartywiseVotes();
//			list.forEach(c -> System.out.println(c));
//		
//}
//		catch (Exception e)
//		{
//			e.printStackTrace();
//		}
//}
//}
//}
