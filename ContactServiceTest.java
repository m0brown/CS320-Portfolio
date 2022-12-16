package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Contact;
import main.ContactService;

class ContactServiceTest {
	
	//Test addContact() method
    @Test
    void testAddContact() {
        ContactService contactservice = new ContactService();
        Contact contact1 = new Contact("LK12345", "Leslie", "Knope", "123-4567","123 Main St.");
        Contact contact2 = new Contact("LK12345", "Leslie", "Knope", "123-4567","123 Main St.");
        
        //Test that contact was added
        assertEquals(true, contactservice.addContact(contact1));
        
        //Test for redundant Appointment
        assertEquals(false, contactservice.addContact(contact2));
    }
    
    //Test deleteContact() method
    @Test
    void testDeleteContact() {
        ContactService contactservice = new ContactService();
        Contact contact1 = new Contact("LK12345", "Leslie", "Knope", "123-4567","123 Main St.");
        //Add the contact to be removed
        contactservice.addContact(contact1);
        //Remove the contact
        contactservice.deleteContact("LK12345");
        //Check if the contact is removed
        assertTrue(contact1.getFirstName().equals("Leslie"));
    }

    //Test updateContact() method
    @Test
    void testUpdateContact() {
        ContactService contactservice = new ContactService();
        Contact contact1 = new Contact("LK12345", "Leslie", "Knope", "123-4567","123 Main St.");
        //Add the contact to be updated
        contactservice.addContact(contact1);

        //Update the contact first name
        contactservice.updateContact("LK12345", 1, "Smleslie");
        //Check if the contact is updated
        assertTrue(contact1.getFirstName().equals("Smleslie"));

        //Update the contact last name
        contactservice.updateContact("LK12345", 2, "Smknope");
        //Check if the contact is updated
        assertTrue(contact1.getLastName().equals("Smknope"));

        //Update the contact phone number
        contactservice.updateContact("LK12345", 3, "765-4321");
        //Check if the contact is updated
        assertTrue(contact1.getContactPhone().equals("765-4321"));
        
        //Update the contact address
        contactservice.updateContact("LK12345", 4, "321 Minor St.");
        //Check if the contact is updated
        assertTrue(contact1.getContactAddress().equals("321 Minor St."));
    }

}
