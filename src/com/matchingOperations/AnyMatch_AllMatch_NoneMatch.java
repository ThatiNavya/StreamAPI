package com.matchingOperations;

import java.util.Arrays;
import java.util.List;

public class AnyMatch_AllMatch_NoneMatch {

	public static void main(String[] args) {
		Person p1 = new Person("John", "USA");
		Person p2 = new Person("Steve", "JAPAN");
		Person p3 = new Person("Ashok", "INDIA");
		Person p4 = new Person("Ching", "CHINA");
		List<Person> persons = Arrays.asList(p1, p2, p3, p4);

		boolean anyIndian = persons.stream().anyMatch(p -> p.country.equals("INDIA"));
		System.out.println("Any Indian available:" + anyIndian);
		
		boolean allIndians = persons.stream().allMatch(p->p.country.equals("INDIA"));
		System.out.println("All the persons are Indians?" + allIndians);

		boolean noneChina = persons.stream().noneMatch(p->p.country.equals("CHINA"));
		System.out.println("NO  persons from China?" + noneChina);

	}

}
