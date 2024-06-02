package com.sunbeam;
import java.util.Comparator;
public class Solution2 {

	
		static <T> void selectionSort(T[] arr, Comparator<T> c) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (c.compare(arr[i], arr[j]) > 0) {
						T temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}

		public static void main(String[] args) {

			Double[] arr = { 9.1, 2.2, 3.3 };
//				printGenericArray(arr);

			System.out.println("Before Sort: ");
			for (Double e : arr)
				System.out.println(e);
			System.out.println("=================================");
			

			class DoubleComparator implements Comparator<Double> {
				@Override
				public int compare(Double e1, Double e2) {
					int diff = Double.compare(e1, e2);
					return diff;
				}
			}

			DoubleComparator dc = new DoubleComparator();
			selectionSort(arr, dc);

			for (Double double1 : arr) {
				System.out.println(double1);
			}

//		public <T> void printGenericArray(T[] arr) {
//			System.out.println("Generic array:");
//			for (T ele : arr) {
//				System.out.println(ele);
//			}
		}
	
// TODO Auto-generated method stub

	}
//
//}
