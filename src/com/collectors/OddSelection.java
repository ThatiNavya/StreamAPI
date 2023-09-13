package com.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class OddSelection {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Zero", "vtalent", "Two", "world", "four", "Batch", "six", "Api", "Eight",
				"Java");
		System.out.println();
		IntStream.range(0, list.size()).filter(i -> i % 2 == 1).mapToObj(i -> list.get(i))
				.forEach(i -> System.out.println(i));
		System.out.println();
		IntStream.range(0, list.size()).filter(i -> i % 2 == 0).mapToObj(i -> list.get(i))
		.forEach(i -> System.out.println(i));

	}

}
