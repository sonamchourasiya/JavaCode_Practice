package com.sunbeam;
import java.util.stream.IntStream;

public class SolMain8 {

	public static void main(String[] args) {
		IntStream strm1=IntStream.range(1,10);
		int total=strm1.sum();
		System.out.println(total);

		IntStream strm2=IntStream.range(1,10);
		total=strm2.sum();
		System.out.println(strm2.summaryStatistics());
		}

}
