package com.xworkz.staticmembers.fields;

public class CustomerTester {
	public static void main(String[] args) {

		Customer diya = new Customer(16236, "Diya", 20, "Hunsur");
		diya.displayInformation();

		Customer anush = new Customer(15057, "Anush", 58, "Virajpet");
		anush.displayInformation();

		Customer.setbankname("Canara Bank");

		Customer vishma = new Customer(13403, "Vishma", 22, "Vijaynagar");
		vishma.displayInformation();

		Customer arjun = new Customer(12924, "Arjun", 30, "Gonikoppal");
		arjun.displayInformation();

		Customer raashi = new Customer(15096, "Raashi", 25, "JP Nagar");
		raashi.displayInformation();

	}

}
//OUTPUT:-
/* 
*  Account Number: 16236 Name: Diya Age: 20 Bank name: null Branch: Hunsur 
*  Account Number: 15057 Name: Anush Age: 58 Bank name: null Branch: Virajpet
*  Account Number: 13403 Name: Vishma Age: 22 Bank name: Canara Bank Branch: Vijaynagar
*  Account Number: 12924 Name: Arjun Age: 30 Bank name: Canara Bank Branch: Gonikoppal
*  Account Number: 15096 Name: Raashi Age: 25 Bank name: Canara Bank Branch: JP Nagar
*/
