package com.streamApi_Map;

import java.util.Arrays;
import java.util.List;

public class Employee_MapDemo {
	public static void main(String[] args) {
		Employee emp1 = new Employee("John", 35, 55000.0);
		Employee emp2 = new Employee("David", 25, 45000.0);
		Employee emp3 = new Employee("Buttler", 35, 35000.0);
		Employee emp4 = new Employee("Steve", 45, 65000.0);
List<Employee> listOfEmployees = Arrays.asList(emp1,emp2,emp3,emp4);
//Get the Employee age whose salary is more than 50k
listOfEmployees.stream().filter(e->e.salary>50000.0).map(e->e.age).forEach(System.out::println);
	
//Get the Employee names whose age is more than 30
listOfEmployees.stream().filter(e->e.age>30).map(e->e.name).forEach(System.out::println);
	}
}
