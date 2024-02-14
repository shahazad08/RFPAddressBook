package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import static com.bridgelabz.AddressBookMain.sc;
import static java.lang.System.exit;


class AddressBook {
    private String name;
    public ArrayList<Contact> contacts;

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
        System.out.println("Contact updated successfully.");
  }

    }




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





