package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class FilterDemo2 {

	public static void main(String[] args) {
		List<String> names =Arrays.asList("Navya","Srilatha","Nanditha","Jyothsna","Anusha","Vilasini");
		names.stream().filter(i->i.startsWith("N")).forEach(i->System.out.println(i));

	}

}
