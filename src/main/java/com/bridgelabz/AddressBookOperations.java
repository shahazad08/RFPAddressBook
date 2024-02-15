package com.bridgelabz;

import java.util.Set;

public interface AddressBookOperations {
    void addContact(Contact contact, Set<String> uniqueNames);
    void displayContacts();
    void editContact();
    void deleteContact();
}
