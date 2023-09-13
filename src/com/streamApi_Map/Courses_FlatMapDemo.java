package com.streamApi_Map;

import java.util.Arrays;
import java.util.List;

public class Courses_FlatMapDemo {

	public static void main(String[] args) {
		List<String> javacourses = Arrays.asList("core java","adv java","springboot");
        List<String> uicourses = Arrays.asList("html","css","bs","js");
        List<List<String>> courses = Arrays.asList(javacourses, uicourses);
        courses.stream().flatMap(e->e.stream()).forEach(System.out::println); 
        
	}

}
