package com.sunbeam;


public class String2 {

	public static void main(String2[] args) {
        
		     String[] array = {"abc", "cde", "jude", "bcd", "oiu", "gzw", "pqr"};
		    
			 
			        for (int i = 0; i < array.length-1; i++)
			        {
			            for (int j = i+1; j <array.length; j++)
			            {
			                if( (array[i].equals(array[j])) && (i != j) )
			                {
			                    System.out.println("Duplicate Element is : "+array[j]);
			                }
			            }
			        }
			    }    
			}
		
			
		
	