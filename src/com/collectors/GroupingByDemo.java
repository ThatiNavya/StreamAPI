package com.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByDemo {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(1,0,0,0,1,0,1,1,0,1);
		Map<Integer, Long> numberMap = numberList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(numberMap);
	}

}
