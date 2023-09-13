package com.slicingoperations;

import java.util.Arrays;
import java.util.List;

public class Limit_Skip_distinct_Demo {

	public static void main(String[] args) {

		List<String> javacourses = Arrays.asList("corejava", "advajava", "springboot", "restapi", "microservices");
		javacourses.stream().limit(4).forEach(c -> System.out.println(c));

		
		System.out.println("***************************************");
		javacourses.stream().skip(3).forEach(c -> System.out.println(c));

		System.out.println("***************************************");
	     List<String> names =Arrays.asList("rani","raja","raja","rani","guru");
	     names.stream().distinct().forEach(System.out::println);
	
	}

}
