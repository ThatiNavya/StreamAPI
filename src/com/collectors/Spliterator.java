package com.collectors;

import java.util.Arrays;
import java.util.List;
public class Spliterator {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("sachin","sehwag","dhoni","kohli");
	  java.util.Spliterator<String> spliterator = names.stream().spliterator();
	  spliterator.forEachRemaining(n->System.out.println(n));
	}

}
