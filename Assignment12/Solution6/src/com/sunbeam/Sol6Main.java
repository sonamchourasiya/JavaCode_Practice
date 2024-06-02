package com.sunbeam;

import java.util.stream.Stream;

public class Sol6Main {

	public static void main(String[] args) {
		int num=6;
		Stream<Integer> strm = Stream.iterate(1, i->i+1).limit(num);
		int result= strm.reduce(1, (a,e)-> a*e);
		System.out.println(result);
	}

}
