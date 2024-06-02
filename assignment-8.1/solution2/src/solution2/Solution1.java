package solution2;

public class Solution1 {

	
		static <T extends Number> T findMin(T[] arr) {
			   T min =arr[0];
			   for(T t: arr)
				if(t.doubleValue()<min.doubleValue()) 
					min =t;
			   return min;
		}
		
		    
		      
		
			public static void main(String[] args) {
			
			Integer[] arr1 = { 22, 55, 77, 11, 33 };
			Integer min1 = findMin(arr1);
			System.out.println("print arr1="+arr1);
			  
			Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
			Double min2 = findMin(arr2);
			System.out.println("print array2=+array2");
			}

	}


