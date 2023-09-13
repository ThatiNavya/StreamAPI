package com.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collectors_PersonDemo {

	public static void main(String[] args) {
		Person person1 = new Person("John", "USA");
		Person person2 = new Person("Steve", "JAPAN");
		Person person3 = new Person("Ashok", "INDIA");
		Person person4 = new Person("Ching", "CHINA");
		Person person5 = new Person("Kumar", "INDIA");
		List<Person> personsList = Arrays.asList(person1, person2, person3, person4, person5);

		/*List<Person> indians = personsList .stream().filter(P->P.coutry.equalsIgnoreCase("India")).collect(Collectors.toList());
		System.out.println(indians);*/
		
		/*List<String> indians = personsList.stream().filter(p ->p.coutry.equalsIgnoreCase("INDIA")).map(s->s.name).collect(Collectors.toList());
		System.out.println("Persons names who are in Stays in India-"+indians);*/
		
		List<String> indians = personsList.stream().filter(p ->p.coutry.equalsIgnoreCase("INDIA")).map(s->s.name).collect(Collectors.toList());
		//indians.forEach(System.out::println);
		indians.forEach(i->System.out.println(i));
		
	}

}
