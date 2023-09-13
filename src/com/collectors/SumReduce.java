package com.collectors;

import java.util.Arrays;

public class SumReduce {

	public static void main(String[] args) {
		int[] nums = { 2, 5, 3, 4, 6 };
		int reducedValue = Arrays.stream(nums).reduce(0, (a,b)->a+b); //a=14 b=6 a+b=20
		System.out.println("The reduced value is: "+reducedValue);
	}

}
