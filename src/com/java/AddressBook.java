package com.java;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	static Scanner scanner = new Scanner(System.in);
	ArrayList<Contact> personInformation = new ArrayList<Contact>();

	// add new person record to array list after taking input

	public Contact addPersonContact() {
		System.out.println("Enter the First Name");
		String fName = scanner.next();
		System.out.println("Enter the Last Name");
		String lName = scanner.next();
		System.out.println("Enter the Address");
		String address = scanner.next();
		System.out.println("Enter the City");
		String city = scanner.next();
		System.out.println("Enter the State");
		String state = scanner.next();
		System.out.println("Enter the Zip");
		String zip = scanner.next();
		System.out.println("Enter the PhoneNumber");
		String phoneNumber = scanner.next();
		System.out.println("Enter the Email");
		String email = scanner.next();
		// creating constructor
		Contact contacts = new Contact(fName, lName, address, city, state, zip, phoneNumber, email);

		// add the above list to to Contacts array list
		personInformation.add(contacts);

		// printing contacts object data inside
		System.out.println(contacts);

		return contacts;

	}// end of add person method
		// Edit contact details using person name

	public void editPerson() {
		System.out.println("Enter name to Edit");
		String s = scanner.next();
		AddressBook addressbook = new AddressBook();

		for (int i = 0; i < personInformation.size(); i++) {
			Contact person = (Contact) personInformation.get(i);
			if (s.equals(person.getFirstName())) {
				System.out.println(person);
				person = addressbook.addPersonContact();/// calling add person to replace

				for (int j = 0; j < personInformation.size(); j++) {
					personInformation.set(j, person);
				}

			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program in AddressBookMain class");
		AddressBook addresbook = new AddressBook();
		addresbook.addPersonContact();

	}// end of main

}/// end of class
