package main;

import java.util.ArrayList;

public class ContactService {
	//Vector to store contacts
	private ArrayList<Contact> contactList = new ArrayList<Contact>();

    //Add contact to vector
    public boolean addContact(Contact contact) {
        boolean checkContact = false;

        //Check if contact already exists
        for (Contact c: contactList) {
            if (c.getContactId().equals(contact.getContactId())) {
                checkContact = true;
                System.out.println("Contact already exists.");
                return false;
            }
        }

        //Add the contact
        contactList.add(contact);
        System.out.println("Contact has been added!");
        return true;
    }
    
    //Remove contact from vector
    public boolean deleteContact(String contactId) {
    	boolean deleteContact = false;
    	
        //Check if contactID entered is valid
        if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("ID is invalid - null or length > 10");
		}

        //Search for contact
        for (Contact c: contactList) {
            if (c.getContactId().equals(contactId)) {
            	deleteContact = contactList.remove(c);
                System.out.println("Contact has been deleted!");
                return deleteContact;
            }
        }
        System.out.println("Contact could not be found.");
        return false;
    }
    
  //Update contact in vector
    public boolean updateContact(String contactId, int caseSelection, String infoUpdate){
        //Check if contactID entered is valid
        if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("ID is invalid - null or length > 10");
		}

        //Search for contact
        for (Contact c: contactList) {
            if (c.getContactId().equals(contactId)) {
                switch(caseSelection) {
                    case 1:
                        c.setFirstName(infoUpdate);
                        break;
                    case 2:
                        c.setLastName(infoUpdate);
                        break;
                    case 3:
                        c.setContactPhone(infoUpdate);
                        break;
                    case 4:
                        c.setContactAddress(infoUpdate);
                        break;
                    default:
                        System.out.println("Invalid selection.");
                        break;
                }
                System.out.println("Contact has been updated!");
                return true;
            }
        }
        System.out.println("Contact could not be found.");
        return false;
    }
}
