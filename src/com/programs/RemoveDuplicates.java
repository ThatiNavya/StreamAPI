package com.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {

		List<String> uniqueList = Arrays.asList("A", "B", "C", "A", "B");

		uniqueList.stream().distinct().forEach(x -> System.out.println(x));
	}

}
