package com.streamApi;

import java.util.stream.Stream;

public class Employee {

	String name;
	int age;
	double salary;
	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
}
class Demo{
	public static void main(String[] args) {
		Employee e1 = new Employee("John", 35, 55000.00);
		Employee e2 = new Employee("David", 25, 45000.00);
		Employee e3 = new Employee("Buttler", 35, 35000.00);
		Employee e4 = new Employee("Steve", 45, 65000.00);
		
		Stream<Employee> empDetails = Stream.of(e1, e2, e3, e4);
		empDetails.filter(e -> e.salary >= 50000.00)
		  .forEach(e -> System.out.println(e.name + "-" + e.age));
	}
}