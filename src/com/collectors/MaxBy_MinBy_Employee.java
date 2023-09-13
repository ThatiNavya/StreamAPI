package com.collectors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// Write a java program to get MAX,MIN and AVG salary from given employees data stream API.
public class MaxBy_MinBy_Employee {

	public static void main(String[] args) {
		Employee employee1 = new Employee(1, "Robert", 26500.00);
		Employee employee2 = new Employee(2, "Abraham", 46500.00);
		Employee employee3 = new Employee(3, "Ching", 36500.00);
		Employee employee4 = new Employee(4, "David", 16500.00);
		Employee employee5 = new Employee(5, "Cathy", 25500.00);
		// To find the maximum salary of an Employee
		List<Employee> employeeList = Arrays.asList(employee1, employee2, employee3, employee4, employee5);
		Optional<Employee> optional = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));
		if (optional.isPresent()) {

			System.out.println(optional.get().salary);

		}

		// To find the maximum salary of an Employee
		List<Employee> employeeList1 = Arrays.asList(employee1, employee2, employee3, employee4, employee5);
		Optional<Employee> optional1 = employeeList.stream()
				.collect(Collectors.minBy(Comparator.comparing(e -> e.salary)));
		if (optional1.isPresent()) {
			System.out.println(optional1.get().name);
		}
		// To find the avaerage salary of Employees
		Double averageSalary = employeeList.stream().collect(Collectors.averagingDouble(e -> e.salary));
		System.out.println(averageSalary);
	}

}
