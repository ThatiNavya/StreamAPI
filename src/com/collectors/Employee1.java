package com.collectors;

public class Employee1 {
    int id;
    String name;
    double salary;
    String country;
	public Employee1(int id, String name, double salary, String country) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + ", country=" + country + "]";
	}
    
}
