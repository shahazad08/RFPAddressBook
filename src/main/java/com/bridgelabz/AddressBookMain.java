package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to address Book");
        Scanner sc=new Scanner(System.in);
        AddressBook addressBook=new AddressBook();
        while (true) {
            System.out.println("Address Book Menu:");
            System.out.println("1. Create Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addressBook.createContact();
                    break;
                case 2:
                    addressBook.displayContact();
                    break;
                case 3:
                    addressBook.editContact();
                    break;
                case 4:
                    addressBook.deleteContact();
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    sc.close(); // Close the scanner before exiting
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    }
