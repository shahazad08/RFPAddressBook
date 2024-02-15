package com.bridgelabz;

import java.util.*;


import static com.bridgelabz.AddressBookMain.sc;
import static java.lang.System.exit;


class AddressBook implements AddressBookOperations {
    private String name;
    public ArrayList<Contact> contacts;
    private static Set<String> uniqueFirstNames  = new HashSet<>();

    public AddressBook(String name) {
        this.name = name;
        this.contacts = new ArrayList<>();
    }

    public AddressBook() {
    }

    public void addContact(Contact contact, Set<String> uniqueNames) {
        String firstName = contact.getFirstName().toLowerCase();
        if (uniqueFirstNames.contains(firstName.toLowerCase())) {
            System.out.println("Duplicate entry for " + firstName + ". Contact not added.");
        } else {
            contacts.add(contact);
            uniqueFirstNames.add(firstName.toLowerCase());
            System.out.println("Contact added to Address Book '" + name + "'");
        }
    }

    public void displayContacts() {
        System.out.println("Contacts in Address Book '" + name + "':");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }


    public void editContact() {
        System.out.println("Enter the first name of the contact you want to edit:");
        String targetFirstName = sc.nextLine();
        boolean contactFound = false;
        char continueChoice;
        Iterator<Contact> iterator = contacts.iterator();

        while (iterator.hasNext()) {
            Contact contact = iterator.next();

            if (contact.getFirstName().equalsIgnoreCase(targetFirstName)) {
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

                        default:
                            System.out.println("Please enter the valid Choice");
                            exit(0);

                    }
                    System.out.print("Do you want to continue? (y/n): ");
                    sc.nextLine(); // Consume the newline character left by nextInt()
                    continueChoice = sc.nextLine().charAt(0);
                } while (continueChoice == 'y' || continueChoice == 'Y');

//                    System.out.println("Program terminated. Goodbye!");
                contactFound=true;
                break;
            }
        }

        if (!contactFound) {
            System.out.println("Contact with name " + targetFirstName + " not found.");
        }
        System.out.println("Contact updated successfully.");
  }

    @Override
    public void deleteContact() {
        System.out.println("Enter the first name of the contact you want to delete:");
        String targetFirstName = sc.nextLine();

        Iterator<Contact> iterator = contacts.iterator();

        while (iterator.hasNext()) {
            Contact contact = iterator.next();

            if (contact.getFirstName().equalsIgnoreCase(targetFirstName)) {
                iterator.remove(); // Remove the matching contact
                System.out.println("Contact deleted successfully.");
                return;
            }
        }

        System.out.println("Contact with name " + targetFirstName + " not found.");

    }


}










