package com.streamApi_Map;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCount_HashMap {

	public static void main(String[] args) {
		String str = "Welcome to Vtalent, Welcome to Institute";

		String[] splitWords = str.split(" ");
		Stream<String> streamWords = Stream.of(splitWords);
		
		/*Map<String, Long> Count = streamWords.collect(Collectors.groupingBy(word -> word, Collectors.counting()));
		System.out.println(Count);*/
		System.out.println("******************************");

		Map<String, Long> wordMap = streamWords
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		wordMap.entrySet().forEach(entrySet -> System.out.println(entrySet.getKey() + " " + entrySet.getValue()));

	}

}
