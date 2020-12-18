package com.xworkz.accessmodifier.defaultmodifier;

public class EmployeeTester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("abc", 23);
		employee.name = "xyz";
		employee.age = 23;
		employee.working();
}
}
