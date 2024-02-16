package com.bridgelabz;

import java.util.List;
import java.util.Set;

public interface AddressBookOperations {
    void addContact(Contact contact, Set<String> uniqueNames);
    void displayContacts();
    void editContact();
    void deleteContact();
    List<Contact> searchPersonByCityOrState(String cityOrState);
    List<Contact> getContactsByState(String state);
    List<Contact> getContactsByCity(String city);

}
