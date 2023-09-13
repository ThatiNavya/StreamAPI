package com.streamApi;

import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		Stream<Integer> str = Stream.of(1,2,3,4,5);
		str.forEach(System.out::println);

	}

}
