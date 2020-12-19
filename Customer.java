package com.xworkz.staticmembers.fields;

public class Customer {
	int accountno;
	String name;
	int age;
	static String bankname;    //Note: Can be initialised to the value directly if method isn't used(alternative)
	String branch;

	Customer() {
		System.out.println("No-arg constructor");
	}

	Customer(int inAccountno, String inName, int inAge, String inBranch) {  //parameterized constructor
		accountno = inAccountno;
		name = inName;
		age = inAge;
		branch = inBranch;
	}

	static void setbankname(String bankName) {  //method
		bankname = "Canara Bank";
	}

	void displayInformation() {
		System.out.println("Account Number: " + accountno + " Name: " + name + " Age: " + age + " Bank name: "
				+ bankname + " Branch: " + branch);

	}
}
