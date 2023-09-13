package com.programs;

import java.util.ArrayList;
import java.util.List;

public class AnyMatch_ALLMatch_NoneMatchDemo {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Navya T", "Accounts", 8000));
		empList.add(new Employee("Jyothsna M", "Admin", 15000));
		empList.add(new Employee("Gouthami P ", "Security", 2500));
		empList.add(new Employee("Anusha N", "Admin", 12500));

		boolean result = empList.stream().anyMatch(emp -> emp.getAccount().matches("Admin"));
		System.out.println(result);

		result = empList.stream().allMatch(emp -> emp.getAccount().matches("Admin"));
		System.out.println(result);

		result = empList.stream().noneMatch(emp -> emp.getAccount().matches("Admin"));
		System.out.println(result);

	}

}
