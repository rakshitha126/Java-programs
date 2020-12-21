package com.xworkz.encapsulation;

public class BankTester {
	public static void main(String args[]) {
		Bank iobacc = new Bank("56849897", "Rakshitha","vijaynagar");
		
		System.out.println("Name:" + iobacc.name);
		System.out.println("AccountNumber:" + iobacc.accNum);
		System.out.println("Branch:" + iobacc.branch);

		iobacc.withdraw(20000.00);// balance-=amount ->balance = 50000 - 10000.00 = 40000.00
		iobacc.deposit(90000.00);// balance +=amount -> balance = 10000.00+50000.00 = 60000.00
		
		System.out.println("Mini Statment");
		iobacc.miniStatment();
	}


}
//output
//Name:Rakshitha
//AccountNumber:56849897
//Branch:vijaynagar
//withdraw of amount20000.0
//enter the amont more than 0
//Mini Statment
//For AcctNum 56849897Balance is: 100000.0
