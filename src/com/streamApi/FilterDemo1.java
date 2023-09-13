package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class FilterDemo1 {

	public static void main(String[] args) {

		List<Integer> asListnum = Arrays.asList(55, 66, 24, 36, 25);
		/*
		 * for (Integer i : asListnum) { if (i % 2 == 0) { System.out.println(i); } }
		 */

		asListnum.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
	}

}
