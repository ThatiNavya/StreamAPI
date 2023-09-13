package com.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateElements {

	public static void main(String[] args) {

		String input = "ILoveWatchingCricketWithMyFriends";
		String[] arr = input.split("");
		// 1.System.out.println(Arrays.toString(arr));
		// 2.Arrays.stream(arr).forEach(System.out::println);

		/*
		 * Set<Entry<String, Long>> entrySet =
		 * Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),
		 * Collectors.counting())).entrySet(); System.out.println(entrySet);
		 */

		/*
		 * Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),
		 * Collectors.counting()))
		 * .entrySet().stream().filter(i->i.getValue()==2).forEach(System.out::println);
		 */

		/*List<String> duplicates = Arrays.stream(arr)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(i -> i.getValue() >= 2)
				.map(i -> i.getKey())
				.collect(Collectors.toList());

		 System.out.println(duplicates);*/
		
		
		

	}

}
