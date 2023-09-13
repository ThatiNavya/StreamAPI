package com.streamApi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
        names.add("Shiva");
        names.add("Srilatha");
        names.add("Karthika");
        names.add("Nanditha");
        Stream<String> Namesstream = names.stream();
        Namesstream.forEach(System.out::println);
	}

}
