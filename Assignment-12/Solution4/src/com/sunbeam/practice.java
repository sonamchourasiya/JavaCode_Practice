package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class practice {
	public static void writeMovies() {
		list<Movie> list =new ArrayList<>();
		list.add(new movie());
		list.add(new movie());
		try(FileOutputStream fout =new FileOutputStream(null)){
			try(DataOutputStream dout = new DataOutputStream(fout)){
				for(movie m:list) {
					dout.writeInt(m.getId());
					dout.writeDouble(m.getsalary());
					
				}
			}
		}
		catch(Exception e)
	{
		e.printStackTrace();
	}
public static Void readMovies() {
	try(FileInputStream fin= new FileInputStream("movie bin")){
		try(DataInputStream din =new DataInputStream(fin)){
			    movie m=new movie();
			    m.setId(din.readInt());
		}
	}
}
catch(Exception e)
		{
	e.printStackTrace();
		}
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

