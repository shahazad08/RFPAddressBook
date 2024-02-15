package com.bridgelabz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.exit;

public class AddressBookMain {
    private static Map<String, AddressBook> addressBooks = new HashMap<>();
   // static AddressBook addressBook = new AddressBook();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");

        while (true) {
            System.out.println("Address Book Menu:");
            System.out.println("1. Create Address Book");
            System.out.println("2. Add Contact");
            System.out.println("3. Display Contacts");
            System.out.println("4. Edit Contacts");
            System.out.println("5. Delete Contacts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character left by previous nextInt()

            switch (choice) {
                case 1:
                    createAddressBook();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    displayContacts();
                    break;
                case 4:
                    editContacts();
                    break;
                case 5:
                    deleteContact();
                    break;
                case 6:
                    System.out.println("Exiting the program. Goodbye!");
                    sc.close();
                    exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void deleteContact() {
        System.out.println("Enter the name of the Address Book:");
        String addressBookName = sc.nextLine();

        if (addressBooks.containsKey(addressBookName)) {
            AddressBook addressBook = addressBooks.get(addressBookName);
            addressBook.deleteContact();
        } else {
            System.out.println("Address Book '" + addressBookName + "' does not exist.");
        }
    }



    private static void editContacts() {
        System.out.println("Enter the name of the Address Book:");
        String addressBookName = sc.nextLine();
        if (addressBooks.containsKey(addressBookName)) {
            AddressBook addressBook = addressBooks.get(addressBookName);
            addressBook.editContact();
        }
        else {
            System.out.println("Address Book '" + addressBookName + "' does not exist.");
        }



    }




    private static void createAddressBook() {
        System.out.println("Enter the name of the new Address Book:");
        String addressBookName = sc.nextLine();

        if (!addressBooks.containsKey(addressBookName)) {
            AddressBook newAddressBook = new AddressBook(addressBookName);
            addressBooks.put(addressBookName, newAddressBook);
            System.out.println("Address Book '" + addressBookName + "' created successfully.");
        } else {
            System.out.println("Address Book '" + addressBookName + "' already exists.");
        }
    }

    private static void addContact() {
        System.out.println("Enter the name of the Address Book:");
        String addressBookName = sc.nextLine();

        if (addressBooks.containsKey(addressBookName)) {
            AddressBook addressBook = addressBooks.get(addressBookName);

            Contact newContact = new Contact();
            System.out.println("Enter the first name:");
            newContact.setFirstName(sc.nextLine());

            System.out.println("Enter the last name:");
            newContact.setLastName(sc.nextLine());

            System.out.println("Enter the address:");
            newContact.setAddress(sc.nextLine());

            System.out.println("Enter the city:");
            newContact.setCity(sc.nextLine());

            System.out.println("Enter the state:");
            newContact.setState(sc.nextLine());

            System.out.println("Enter the email:");
            newContact.setEmailId(sc.nextLine());

            System.out.println("Enter the zip:");
            newContact.setZip(sc.nextInt());
            sc.nextLine(); // Consume the newline character left by nextInt()

            System.out.println("Enter the phone number:");
            newContact.setPhoneNumber(sc.nextLong());
            sc.nextLine(); // Consume the newline character left by nextLong()

            // Set contact details using user input...

            addressBook.addContact(newContact);
        } else {
            System.out.println("Address Book '" + addressBookName + "' does not exist.");
        }
    }

    private static void displayContacts() {
        System.out.println("Enter the name of the Address Book:");
        String addressBookName = sc.nextLine();

        if (addressBooks.containsKey(addressBookName)) {
            AddressBook addressBook = addressBooks.get(addressBookName);
            addressBook.displayContacts();
        } else {
            System.out.println("Address Book '" + addressBookName + "' does not exist.");
        }
    }
}