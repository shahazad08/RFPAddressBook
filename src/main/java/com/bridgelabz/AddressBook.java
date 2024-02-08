package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contact> contacts = new ArrayList<Contact>();
    Contact contact=new Contact();
    Scanner sc=new Scanner(System.in);

    public void createContact() {

        System.out.println("Enter the First Name");
        String firstName=sc.nextLine();
        contact.setFirstName(firstName);

        System.out.println("Enter the Last Name");
        String lastName=sc.nextLine();
        contact.setLastName(lastName);

        System.out.println("Enter the address");
        String address=sc.nextLine();
        contact.setAddress(address);

        System.out.println("Enter the city");
        String city=sc.nextLine();
        contact.setCity(city);

        System.out.println("Enter the state");
        String state=sc.nextLine();
        contact.setState(state);

        System.out.println("Enter the email");
        String email=sc.nextLine();
        contact.setEmailId(email);

        System.out.println("Enter the zip");
        int zip=sc.nextInt();
        contact.setZip(zip);

        System.out.println("Enter the phoneNumber");
        long phoneNumber=sc.nextLong();
        contact.setPhoneNumber(phoneNumber);

        contacts.add(contact);

        System.out.println("Contact List"+contacts);

    }
}
