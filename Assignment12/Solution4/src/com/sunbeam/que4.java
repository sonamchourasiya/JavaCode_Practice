package com.sunbeam;

interface check<T> {

	boolean compare(T x, T y);
}

public class que4 {

	static <T> int countIf(T[] arr, T key, check<T> c) {
		
		int count=0;
	for(T ele : arr) {
		if(c.compare(ele,key)) {
				
			count++;
		
	}
	

	}	return count;
	}

	public static void main(String[] args) {
		Double[] arr = { 2.2, 3.2, 2.2, 2.5 };
		Double key = 2.2;
		int cnt = countIf(arr, key, (x, y) -> x > y);
		System.out.println("Count = " + cnt);

	}

}
