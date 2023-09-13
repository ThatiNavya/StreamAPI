package com.collectors;

public class Person {
    String name;
    String coutry;
	public Person(String name, String coutry) {
		super();
		this.name = name;
		this.coutry = coutry;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", coutry=" + coutry + "]";
	}
}