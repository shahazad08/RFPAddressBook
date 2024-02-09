package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import static java.lang.System.exit;

public class AddressBook {
    private static ArrayList<Contact> contacts = new ArrayList<Contact>();
   // Contact contact=new Contact();
    Scanner sc=new Scanner(System.in);

    public void createContact() {
        char addAnotherContact;
    do{
        Contact contact=new Contact();
        System.out.println("Enter the First Name");
        String firstName=sc.next();
        contact.setFirstName(firstName);

        System.out.println("Enter the Last Name");
        String lastName=sc.next();
        contact.setLastName(lastName);

        System.out.println("Enter the address");
        String address=sc.next();
        contact.setAddress(address);

        System.out.println("Enter the city");
        String city=sc.next();
        contact.setCity(city);

        System.out.println("Enter the state");
        String state=sc.next();
        contact.setState(state);

        System.out.println("Enter the email");
        String email=sc.next();
        contact.setEmailId(email);

        System.out.println("Enter the zip");
        int zip=sc.nextInt();
        contact.setZip(zip);

        System.out.println("Enter the phoneNumber");
        long phoneNumber=sc.nextLong();
        contact.setPhoneNumber(phoneNumber);

        contacts.add(contact);

        System.out.print("Do you want to add another contact? (y/n): ");
        addAnotherContact = sc.next().charAt(0);
}   while (addAnotherContact == 'y' || addAnotherContact == 'Y');
        System.out.println("Contacts added:");



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
                            System.exit(0);
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

    public void displayContact() {
        System.out.println("contact list are:");
        for(Contact contact:contacts)
            System.out.println(contact);
    }

    public void deleteContact() {
        System.out.println("Enter the name you want to delete");
        String firstName = sc.next().toLowerCase();
        for (Contact contact : contacts) {
            if (contact.getFirstName().toLowerCase().equals(firstName)) {
                contacts.remove(contact);
                System.out.println("Contect remove Successfully");
                return;
            }
            }
        System.out.println("Contact not found");

        }
    }


