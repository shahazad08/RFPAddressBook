package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import static com.bridgelabz.AddressBookMain.sc;
import static java.lang.System.exit;


class AddressBook {
    private String name;
    private ArrayList<Contact> contacts;

    public AddressBook(String name) {
        this.name = name;
        this.contacts = new ArrayList<>();
    }

    public AddressBook() {
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added to Address Book '" + name + "'");
    }

    public void displayContacts() {
        System.out.println("Contacts in Address Book '" + name + "':");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }


    public void editContact() {
        System.out.println("Enter the name you want to edit");
       // sc.nextLine();
        String targetFirstName = sc.nextLine().toLowerCase();
        char continueChoice;
        boolean contactFound = false;
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getFirstName().toLowerCase().equals(targetFirstName)) {
                do {
                    System.out.println("What do you want to edit");
                    System.out.println("1. First Name");
                    System.out.println("2. Last Name");
                    System.out.println("3. Address");
                    System.out.println("4. City");
                    System.out.println("5. State");
                    System.out.println("6. Zip Code");
                    System.out.println("7. Email");
                    System.out.println("8. Mobil Number");
                    int ch = sc.nextInt();
                    switch (ch) {
                        case 1:
                            System.out.println("Enter the new name you want to edit");
                            String newName = sc.next();
                            contact.setFirstName(newName);

                            break;
                        case 2:
                            System.out.println("Enter the new Last Name  you want to edit");
                            String newLastName = sc.next();
                            contact.setLastName(newLastName);
                            break;
                        case 3:
                            System.out.println("Enter the new Address you want to edit");
                            String newAddress = sc.next();
                            contact.setAddress(newAddress);
                            break;
                        case 4:
                            System.out.println("Enter the new City you want to edit");
                            String newCity = sc.next();
                            contact.setCity(newCity);
                            break;
                        case 5:
                            System.out.println("Enter the new State you want to edit");
                            String newState = sc.next();
                            contact.setState(newState);
                            break;
                        case 6:
                            System.out.println("Enter the new Zip Code you want to edit");
                            int newZip = sc.nextInt();
                            contact.setZip(newZip);
                            break;
                        case 7:
                            System.out.println("Enter the new Email you want to edit");
                            String newEmail = sc.next();
                            contact.setEmailId(newEmail);
                            break;
                        case 8:
                            System.out.println("Enter the new Mobile Number  you want to edit");
                            long newMobileNumber = sc.nextLong();
                            contact.setPhoneNumber(newMobileNumber);
                            break;
                        case 9:

                            System.out.println("Exiting the program. Goodbye!");
                            sc.close(); // Close the scanner before exiting
                            exit(0);
                        default:
                            System.out.println("Please enter the valid Choice");
                            exit(0);

                    }
                    System.out.print("Do you want to continue? (y/n): ");
                    sc.nextLine(); // Consume the newline character left by nextInt()
                    continueChoice = sc.nextLine().charAt(0);
                } while (continueChoice == 'y' || continueChoice == 'Y');

                System.out.println("Program terminated. Goodbye!");
                contactFound=true;
                break;
            }
            if (!contactFound) {
                System.out.println("Contact with name " + targetFirstName + " not found.");
            }

        }
    }
}


//    static void displayContact() {
//        System.out.println("Enter the name of the Address Book:");
//        sc.nextLine();  // Consume the newline character left by previous nextInt()
//        String addressBookName = sc.nextLine();
//
//        if (addressBooks.containsKey(addressBookName)) {
//            AddressBook addressBook = addressBooks.get(addressBookName);
//            addressBook.displayContacts();
//        } else {
//            System.out.println("Address Book '" + addressBookName + "' does not exist.");
//        }


//    public void deleteContact() {
//        System.out.println("Enter the name you want to delete");
//        String firstName = sc.next().toLowerCase();
//        for (Contact contact : contacts) {
//            if (contact.getFirstName().toLowerCase().equals(firstName)) {
//                contacts.remove(contact);
//                System.out.println("Contect remove Successfully");
//                return;
//            }
//            }
//        System.out.println("Contact not found");
//
//        }




//    private void displayContacts() {
//        System.out.println("contact list are:");
//        for (Contact contact : contacts)
//            System.out.println(contact);
//    }
//    }




