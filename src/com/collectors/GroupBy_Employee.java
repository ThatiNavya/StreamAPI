package com.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy_Employee {
//Employees should be grouped based on country on country name.
	public static void main(String[] args) {
		Employee1 e1 = new Employee1(1,"Robert",26500.00,"USA");
		Employee1 e2 = new Employee1(2,"Abraham",46500.00,"INDIA");
		Employee1 e3 = new Employee1(3,"Ching",36500.00,"CHINA");
		Employee1 e4 = new Employee1(4,"David",16500.00,"INDIA");
		Employee1 e5 = new Employee1(5,"Cathy",25500.00,"USA");

		List<Employee1> employees = Arrays.asList(e1,e2,e3,e4,e5);
		Map<String, List<Employee1>> map = employees.stream().collect(Collectors.groupingBy(e->e.country));
		System.out.println(map);
	
	}
	
	

}
