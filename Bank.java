package com.xworkz.encapsulation;

public class Bank {
	public String accNum;
	public double balance;
	public String name;
	public String branch;

	public Bank(String inaccNum, String inname, String inbranch) {
		accNum = inaccNum;
		balance = 10000.00;
		name = inname;
		branch = inbranch;
	}

	void withdraw(double amount) {
		System.out.println("withdraw of amount" + amount);

		if (amount > 0 && balance > amount)
			balance -= amount;
		else
			System.out.println("enter the amont more than 0");
	}

	void deposit(double amount) {

		if (amount > 0)
			balance += amount;

	}

	void miniStatment() {
		System.out.println("For AcctNum " + accNum + "Balance is: " + balance);
	}
}
