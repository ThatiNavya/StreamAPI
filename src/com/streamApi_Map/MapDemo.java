package com.streamApi_Map;

import java.util.Arrays;
import java.util.List;

public class MapDemo {

	public static void main(String[] args) {
		List<String> countryNames = Arrays.asList("India","Japan","Australia","Russia");
        //To display countryNames in UpperCase
		countryNames.stream().map(name->name.toUpperCase()).forEach(System.out::println);
        //To print the length of country names
		countryNames.stream().mapToInt(name->name.length()).forEach(System.out::println);
	
	}

}
