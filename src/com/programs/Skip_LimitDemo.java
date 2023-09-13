package com.programs;

import java.util.ArrayList;
import java.util.List;

public class Skip_LimitDemo {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		l.add("e");
		l.stream().skip(2).limit(2).forEach(x -> System.out.println(x));
		System.out.println("***********************");
		l.stream().limit(3).skip(2).forEach(x -> System.out.println(x));
	}

}
