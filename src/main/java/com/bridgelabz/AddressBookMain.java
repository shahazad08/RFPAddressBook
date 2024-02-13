package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
     static Map<String, AddressBook> addressBooks = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to address Book");

        AddressBook addressBook = new AddressBook();
        while (true) {
            System.out.println("Address Book Menu:");
            System.out.println("1. Create Address Book");
            System.out.println("2. Create Contact");
            System.out.println("3. Display Contacts");
            System.out.println("4. Edit Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    createAddressBook();
                    break;
                case 2:
                    addressBook.createContact();
                    break;
                case 3:
                    addressBook.displayContact();
                    break;
                case 4:
                    addressBook.editContact();
                    break;
                case 5:
             //       addressBook.deleteContact();
                    break;
                case 6:
                    System.out.println("Exiting the program. Goodbye!");
                    sc.close(); // Close the scanner before exiting
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createAddressBook() {
        System.out.println("Enter the name of the new Address Book:");
        String addressBookName = sc.next();
        AddressBook newAddressBook = new AddressBook(addressBookName);
        addressBooks.put(addressBookName, newAddressBook);
        System.out.println("Address Book '" + addressBookName + "' created successfully.");
    }



}
