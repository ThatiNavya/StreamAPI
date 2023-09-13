package com.employeeDetails;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeStream {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList();
		employeeList.add(new Employee(1, "Jhansi ", 32, "Female", "HR ", 2011, 25000));
		employeeList.add(new Employee(2, "Smith ", 25, "Male", "Sales", 2015, 32500));
		employeeList.add(new Employee(3, "David", 29, "Male", "infrastructure", 2015, 18000));
		employeeList.add(new Employee(4, "orien", 28, "Male", "Development", 2014, 32500));
		employeeList.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700));
		employeeList.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500));
		employeeList.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000));
		employeeList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500));
		employeeList.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500));
		employeeList.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000));
		employeeList.add(new Employee(11, "Gouri", 27, "Female", "infrastructure", 2015, 15700));
		employeeList.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200));
		employeeList.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300));
		employeeList.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700));
		employeeList.add(new Employee(15, "Ashok", 23, "Male", "infrastructure", 2018, 12700));
		employeeList.add(new Employee(4, "Sanvi", 26, "Female", "Development", 2015, 28900));

		// 1.How many Male and Female employees are there in the organization
		Map<String, Long> femaleMaleCount = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(femaleMaleCount);
		System.out.println("============================================================");

		// 2.Write a java code to print all the departments in the organization
		List<String> departments = employeeList.stream().map(Employee::getDepartment).distinct()
				.collect(Collectors.toList());
		System.out.println(departments);
		System.out.println("============================================================");

		/*
		 * 3.Write a java code to print average age of male and female Employees in the
		 * organization
		 */
		Map<String, Double> averageAge = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
		System.out.println(averageAge);
		System.out.println("============================================================");

		// 4.Write a java code to print highest paid employee in the organization
		Optional<Employee> highestSalary = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		if (highestSalary.isPresent()) {
			System.out.println(highestSalary.get().getName());
		}
		System.out.println("============================================================");
		// 5.Get the all the Employees who's joined after 2015?
		employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(i -> i.getName())
				.forEach(System.out::println);
		System.out.println("============================================================");

		// 6.Count the number of Employee in each department
		Map<String, Long> EmployeeCount = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(EmployeeCount);
		System.out.println("============================================================");
		// 7.What is the average salary of each department
		Map<String, Double> aveargeSalary = employeeList.stream().collect(
				Collectors.groupingBy((Employee::getDepartment), Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(aveargeSalary);
		System.out.println("============================================================");
		// 8.Get the details of youngest male employee in the development department
		Optional<Employee> YoungestEmployee = employeeList.stream()
				.filter(i -> i.getGender() == "Male" && i.getDepartment() == "Development")
				.collect(Collectors.minBy(Comparator.comparing(i -> i.getAge())));
		if (YoungestEmployee.isPresent()) {
			System.out.println(YoungestEmployee.get().getName());
		}
		System.out.println("============================================================");
		// 9.Who is having most experience in the organization
		Optional<Employee> highexperience = employeeList.stream()
				.collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
		if (highexperience.isPresent()) {
			System.out.println(highexperience.get().getName());
		}
		System.out.println("============================================================");

		// 10.How many Male & Female Employees are there in the sales team?
		Map<String, Long> salesteamcount = employeeList.stream().filter(e -> e.getDepartment() == "Sales")
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(salesteamcount);
		System.out.println("============================================================");
		// 11. What is the average salary of Male and Female Employees ?
		Map<String, Double> averagesalary = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(averagesalary);
		System.out.println("============================================================");

		// 12. List down the names of all employees in each department ?
		Map<String, List<String>> nameOfEmployees = employeeList.stream().distinct().collect(Collectors
				.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
		System.out.println(nameOfEmployees);
		System.out.println("============================================================");
		Map<String, List<String>> nameOfEmployees1 = employeeList.stream().collect(Collectors
				.groupingBy((Employee::getDepartment), Collectors.mapping(Employee::getName, Collectors.toList())));
		System.out.println(nameOfEmployees1);
		System.out.println("============================================================");
		// 13. What is the average salary and Total Salary of whole organization ?
		Double avgSalary = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println("avgSalary " + avgSalary);
		System.out.println("============================================================");

		/*
		 * OptionalDouble average = employeeList.stream().mapToDouble(e ->
		 * e.getSalary()).average(); double sum = employeeList.stream().mapToDouble(e ->
		 * e.getSalary()).sum();
		 * 
		 * if (average.isPresent()) { System.out.println(average.getAsDouble() +
		 * " and sum is " + sum); } else System.out.println("no avg is found");
		 */
		System.out.println("============================================================");

		Double TotelSalary = employeeList.stream().collect(Collectors.summingDouble(Employee::getSalary));
		System.out.println("TotelSalary " + TotelSalary);
		System.out.println("============================================================");

		// 14. Separate the employees who are younger or equal to 25 years from those
		// employees who are older than 25 years?
		List<String> young25 = employeeList.stream().filter(i -> i.getAge() <= 25).map(e -> e.getName())
				.collect(Collectors.toList());
		System.out.println(young25);
		System.out.println("============================================================");

		List<String> older25 = employeeList.stream().filter(i -> i.getAge() >= 25).map(e -> e.getName())
				.collect(Collectors.toList());
		System.out.println(older25);
		System.out.println("============================================================");

		// 15. Who is the oldest employee in the organization ?

		Optional<Employee> oldestemployee = employeeList.stream()
				.collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
		if (oldestemployee.isPresent()) {
			System.out.println(oldestemployee.get().getName());
		}
		System.out.println("============================================================");

		// 16. Find the Second highest salaried employee details in the organization ?

		Optional<Employee> Secondhighest = employeeList.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
		if (Secondhighest.isPresent()) {
			System.out.println(Secondhighest.get().getName());
		}
		System.out.println("============================================================");
		employeeList.stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())).map(s -> s.getSalary())
				.skip(1).limit(1).forEach(System.out::println);

	}
}
