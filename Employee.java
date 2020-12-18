package com.xworkz.accessmodifier.defaultmodifier;

public class Employee {
	String name;
	int age;

	Employee(String name, int age) {
		name = "abc";
		age = 23;
	}

	void working() {
		System.out.println("working on project");
	}

}
